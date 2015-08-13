package eu.qleap.soapyatc.config

import static name.heavycarbon.checks.BasicChecks.*

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher
import java.util.regex.Pattern

import name.heavycarbon.carpetbag.FileInfo
import name.heavycarbon.carpetbag.ResourceHelpGroovy
import name.heavycarbon.carpetbag.ResourceInfo
import name.heavycarbon.carpetbag.BooleanParser

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.elements.AtpName;
import eu.qleap.soapyatc.elements.AtwsName;

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Code moved from the ConfigInfo class
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class Helper {

	final static CLASS = Helper.class.name
	final static Logger LOGGER_slurpConfig = LoggerFactory.getLogger("${CLASS}.slurpConfig")
	final static Logger LOGGER_mapifyKeyValueTextForConfigInfo = LoggerFactory.getLogger("${CLASS}.mapifyKeyValueTextForConfigInfo")
	final static Logger LOGGER_processAnotherUri = LoggerFactory.getLogger("${CLASS}.processAnotherUri")

	private static final Pattern ATTVALPAT = ~/^\s*(\w+)\s*=\s*(.*?)\s*($|#)/

	private Helpers() {
		cannotHappen("Class cannot be instantiated");
	}

	/**
	 * Override helper for a "high" and "low" priority value. The highest-priority
	 * one which is not null wins!
	 */

	static override(def high, def low) {
		if (high != null) {
			return high
		}
		else {
			return low
		}
	}

	/**
	 * Override helper for map, for each key that exists in both maps, use override,
	 * otherwise use the entry that exists in either one.
	 */

	static Map overrideMap(Map highMap, Map lowMap) {
		checkNotNull(highMap,'highMap')
		checkNotNull(lowMap,'lowMap')
		Map res = [:]
		highMap.each { k, v -> res[k] = v }
		lowMap.each { k, v ->
			if (!res.containsKey(k)) {
				// does not contain yet --> take over from low map
				res[k] = v
			}
			else {
				// contains already --> take over from low map if current value is null only
				if (res[k] == null) {
					res[k] = v
				}
			}
		}
		return res
	}

	/**
	 * A string indicating a file or resource is given and our mission is to slurp the data into memory!
	 * Or else, throw.
	 */

	static List slurpConfig(String what,String encoding,List msgs) {
		Logger logger = LOGGER_slurpConfig
		checkNotNull(msgs,'msgs')
		checkNotNullAndNotEmpty(what,'configRaw')
		checkNotNullAndNotOnlyWhitespace(encoding,'encoding')
		// don't trim configRaw, one never knows, whitespace may be important
		encoding = encoding.trim()
		List res
		if (what[0] == '^') {
			def fqrn = what.substring(1)
			checkNotNullAndNotEmpty(fqrn,"resourceName with '^' removed")
			msgs << "Reading configuration from fully qualified resource '${fqrn}'. Using encoding ${encoding}"
			ResourceInfo rinfo = new ResourceInfo(fqrn,encoding)
			// the next instruction will throw if the entry does not exist:
			return ResourceHelpGroovy.slurpIntoListOfLines(rinfo)
		}
		else if (what[0] == java.io.File.separator || (java.io.File.separator == '\\' && what =~ /^[A-Z]:/)) {
			// absolute path or absolute path on windows with drive letter
			File configFile = new File(what)
			msgs << "Reading configuration from file given by absolute path '${what}', resolved to '${configFile}'. Using encoding ${encoding}"
			FileInfo finfo = new FileInfo(configFile,encoding)
			// the next instruction will throw if the entry does not exist:
			return ResourceHelpGroovy.slurpIntoListOfLines(finfo)
		}
		else {
			// relative path to home (in Windows, this is a vague concept)
			File configFile = new File(System.getProperty("user.home"),what)
			msgs << "Reading configuration from file given by relative path '${what}', resolved to '${configFile}'. Using encoding ${encoding}"
			FileInfo finfo = new FileInfo(configFile,encoding)
			// the next instruction will throw if the entry does not exist:
			return ResourceHelpGroovy.slurpIntoListOfLines(finfo)
		}
	}

	/**
	 * Slurp a file or resource, throwing if nothing was found or else the content as a list of
	 * string. Messages got to "msgs". The "whatWithEncoding" string make take the encoding with 
	 * "::" appended.
	 */

	static List slurpConfig(String whatWithEncoding, List msgs) {
		checkNotNull(msgs,'msgs')
		checkNotNullAndNotEmpty(whatWithEncoding,'configRawWithEncoding')
		Pattern pat = ~/^(.+?)(::([A-Za-z0-9_-]+))?$/
		Matcher m = (whatWithEncoding =~ pat)
		checkTrue(m.matches(), "Cannot match the passed string '${whatWithEncoding}'. Format should be 'FILENAME(::ENCODING)?'")
		assert m.matches()
		String what = m.group(1)
		String encoding = 'UTF-8'
		String comesFrom = 'is the default'
		if (m.group(2)) {
			encoding = m.group(3)
			comesFrom = 'comes from the passed argument'
		}
		msgs << "Will open file or resource '${what}' using encoding '${encoding}', which ${comesFrom}"
		return slurpConfig(what,encoding,msgs)
	}

	/**
	 * Process another URI (there may be several)
	 */

	static void processAnotherUri(String apparentUri, Map uriMap, List msgs) {
		Logger logger = LOGGER_processAnotherUri
		checkNotNull(apparentUri,'apparentUri')
		checkNotNull(uriMap,'uriMap')
		checkNotNull(msgs,'msgs')
		URI uri
		try {
			uri = new URI(apparentUri)
		}
		catch (Exception exe) {
			instaFail("Unparseable URI '${apparentUri}'")
		}
		URL url
		try {
			url = uri.toURL()
		}
		catch (Exception exe) {
			instaFail("Valid URI but unparseable URL '${apparentUri}'")
		}
		String scheme = uri.getScheme()
		// override semantics: replace any pre-existing entry for that scheme
		if (uriMap[scheme]) {
			msgs << "Found another URI having scheme '${scheme}' -- replacing prior entry '${uriMap[scheme]}' for that scheme"
		}
		uriMap[scheme] = uri // keep the URI nor the URL
	}

	/**
	 * Transform text (a List of Strings that look like KEYWORD = VALUE ) into map.
	 * Text past a "#" is assumed to be commentary.
	 * This is not a general function because it needs to have special knowledge about the "URL"
	 * Should a problem lead to "full failure" or only "partial failure" whereby some values are
	 * filled an others not? The boolean "throwOnLocalProblem" selects...
	 */

	static Map mapifyKeyValueTextForConfigInfo(List text, List msgs, boolean lenient) {
		Logger logger = LOGGER_mapifyKeyValueTextForConfigInfo
		checkNotNull(text,'text')
		checkNotNull(msgs,'msgs')
		// no complex quoting shit for now; if time we can go all "bash escaping" on this later
		Map res = [:]
		res[(ConfigInfo.key_url)] = [:] // pref-fill the values for "URL"
		text.each { String line ->
			if (line =~ /^\s*($|#)/) {
				// msgs << "Skipping line '${line}' which is empty or is a comment"
				return
			}
			Matcher m = (line =~ ATTVALPAT)
			if (m) {
				String key   = m.group(1).toLowerCase()
				String value = m.group(2)
				try {
					switchByKey(key, value, res, msgs, line, lenient)
				}
				catch (Exception exe) {
					if (!lenient) {
						throw exe
					}
					else {
						String txt = "Problem with '${key}' (${exe.getMessage()}) in line '${line}'"
						msgs << txt
					}
				}
			}
			else {
				String txt = "Skipping line '${line}' which could not be properly parsed"
				if (!lenient) {
					instaFail(txt)
				}
				else {
					msgs << txt
				}
			}
		}
		return res
	}
	
	private static void switchByKey(String key, String value, Map res, List msgs, String line, boolean lenient) {
		switch (key) {
			case ConfigInfo.key_url:
			// the next call throws if bad URL
				processAnotherUri(value, res[(ConfigInfo.key_url)], msgs)
				break
			case ConfigInfo.key_credentials:
			// the next call throws if bad credentials
				res[(ConfigInfo.key_credentials)] = Credentials.makeCredentials(value)
				break
			case ConfigInfo.key_secure:
			// FALL-THROUGH
			case ConfigInfo.key_hostnameverify:
			// the next call throws if not found
				res[(key)] = BooleanParser.makeBoolean(value)
				break
			case ConfigInfo.key_service:
			// the next call throws if not found
				res[(ConfigInfo.key_service)] = AtwsName.makeName(value)
				break
			case ConfigInfo.key_procedure:
			// the next call throws if not found
				res[(ConfigInfo.key_procedure)] = AtpName.makeName(value)
				break
			default:
			// the default in particular includes the case key_config
				String txt = "Found unknown key '${key}' in line '${line}' -- skipping that line"
				if (!lenient) {
					instaFail(txt)
				}
				else {
					msgs << txt
				}
		}
	}
}
