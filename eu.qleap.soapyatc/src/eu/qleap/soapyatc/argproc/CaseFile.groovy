package eu.qleap.soapyatc.argproc

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher

import eu.qleap.soapyatc.config.ConfigInfoHelper
import eu.qleap.soapyatc.elements.AtpMap;
import eu.qleap.soapyatc.elements.AtpName;
import groovy.transform.Immutable;
import static name.heavycarbon.checks.BasicChecks.*

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * A simple reader of the "case" file, which can be an resource or an actual
 * file.
 *
 * 2015.08.14 - First run
 ******************************************************************************/

class CaseFile {

	private final static CLASS = CaseFile.class.name
	private final static Logger LOGGER_mapifyKeyValueText = LoggerFactory.getLogger("${CLASS}.mapifyKeyValueText")

	private static final Pattern ATTVALPAT = ~/^\s*(\d+)\s*=>\s*(.*?)\s*($|#)/
	
	/**
	 * All the "case file" holds is a mapping of longs to AtpName instances
	 */
	
	final Map map
	
	/**
	 * Build from a known file ("FILE::ENCODING") and put any error messages into "msgs"
	 */
	
	CaseFile(String whatWithEncoding, List msgs) {
		checkNotNull(whatWithEncoding)
		checkNotNull(msgs)
		final lenient = true
		List text = ConfigInfoHelper.slurpConfig(whatWithEncoding, msgs)
		this.map = mapifyKeyValueText(text, msgs, lenient).asImmutable()
	}
	
	/**
	 * Just look up, throwing if not found
	 */
	
	AtpName lookup(long x) {
		def res = map[x]
		checkNotNull(res,'There was nothing in the map stored under value \'{}\'',x)
		return res
	}
	
	/**
	 * Transform text (a List of Strings that look like CASE => PROCEDURE_NAME ) into map.
	 * Text past a "#" is assumed to be commentary. "lenient" says whether a problematic
	 * line should lead to an exception being thrown or not.
	 */

	static Map mapifyKeyValueText(List text, List msgs, boolean lenient) {
		Logger logger = LOGGER_mapifyKeyValueText
		checkNotNull(text,'text')
		checkNotNull(msgs,'msgs')
		Map res = [:]
		text.each { String line ->
			if (line =~ /^\s*($|#)/) {
				// msgs << "Skipping line '${line}' which is empty or is a comment"
				return
			}
			Matcher m = (line =~ ATTVALPAT)
			if (m) {
				String key   = m.group(1)
				String value = m.group(2)
				try {
					long    x = Long.valueOf(key) // will throw on problem
					AtpName n = AtpMap.makeName(value) // will throw on problem
					if (res.containsKey(x)) {
						msgs << "Key ${x} found again, replacing existing value ${res[x]} with ${n}"						
					}
					res[x] = n
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
}
