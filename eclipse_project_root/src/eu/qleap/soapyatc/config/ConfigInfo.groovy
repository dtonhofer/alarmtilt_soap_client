package eu.qleap.soapyatc.config

import static name.heavycarbon.checks.BasicChecks.*
import name.heavycarbon.utils.ResourceHelpGroovy;
import eu.qleap.soapyatc.Call;
import eu.qleap.soapyatc.elements.AtpName
import eu.qleap.soapyatc.elements.AtwsMap
import eu.qleap.soapyatc.elements.AtwsName

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Structure to hold configuration information. The information can come from 
 * hardcoding, one of several configuration files or the command line.
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class ConfigInfo {

	final static CLASS = ConfigInfo.class.name

	/**
	 * Actual data
	 */

	final String      provenance      // indicates where the config comes from; used in debugging
	final Map         uriMap          // map scheme (http,https) to java.net.URI instance; always set but maybe empty
	final Boolean     secure          // secure or not? true by default
	final Boolean     hostnameverify  // hostname verification or not? true by default
	final AtwsName    service         // web service to call, "ping" by default
	final AtpName     procedure       // procedure to call if web service = "launch", unset by default
	final Credentials credentials     // credentials, unset by default
	final Long        caseId          // give a numeric case (comes from WinCC)
	final String      casefile        // name of "case file", possibly with appended encoding

	/**
	 * Keywords used in config file or on command line
	 */

	final static String key_config         = 'config' // indicates where to get config from, not stored
	final static String key_url            = 'url' // may appear several times with different schemes
	final static String key_secure         = 'secure'
	final static String key_hostnameverify = 'hostnameverify'
	final static String key_service        = 'service' // web service
	final static String key_procedure      = 'procedure' // alarmtilt procedure
	final static String key_credentials    = 'credentials' // gives USERNAME::PASSWORD, transformed into "Creds" instance later
	final static String key_caseid         = 'case' // give a numeric case (from WinCC), transformed into valid service/procedure later
	final static String key_casefile       = 'casefile' // indicates where the case mapping comes from

	/**
	 * Create the "fully default ConfigInfo", which does not contain much
	 */

	ConfigInfo() {
		provenance     = 'empty constructor'
		uriMap         = [:].asImmutable()
		secure         = true // there is no reason to not use https by default
		hostnameverify = true // there is no reason to not verify hostname by default
		service        = AtwsMap.makeName('ping') // by default, just "ping" remote server
		casefile       = null
		assert uriMap != null
	}

	/**
	 * Try to construct it directly from a resource or file indicated by "what"
	 * "what" can be:
	 * Absolute or relative file, or '^' followed by a resource name.
	 * The default assumed encoding is UTF-8. To change it, append "::ENCODING" to the "what" string.
	 * If reading fails, an Exception is thrown. In all cases, more information may be found in "msgs"
	 * "lenient" will accept some bad values; "!lenient" will throw
	 */

	ConfigInfo(String what, List msgs, boolean lenient) {
		this.provenance = "slurped from '${what}'"
		// the next line will throw if there is fishyness
		List text = ConfigInfoHelper.slurpConfig(what,msgs)
		// no exception, so we could read something... process it!
		Map map = ConfigInfoHelper.mapifyKeyValueText(text, msgs, lenient)
		// get stuff from the "map"
		this.uriMap = map[key_url].asImmutable()
		this.secure = map[key_secure]
		this.hostnameverify = map[key_hostnameverify]
		this.service = map[key_service]
		this.procedure = map[key_procedure]
		this.credentials = map[key_credentials]
		this.caseId = map[key_caseid]
		this.casefile = map[key_casefile]
	}

	/**
	 * Construct from given values
	 */

	ConfigInfo(Map uriMap, Boolean secure, Boolean hostnameverify, AtwsName service, AtpName procedure, Credentials credentials, Long caseId, String casefile) {
		this.provenance = 'constructed from discrete values (from the command line)'
		Map tmpMap = [:]
		if (uriMap) {
			uriMap.each { k,v -> tmpMap[k] = v }
		}
		this.uriMap = tmpMap.asImmutable()
		this.secure = secure
		this.hostnameverify = hostnameverify
		this.service = service
		this.procedure = procedure
		this.credentials = credentials
		this.caseId = caseId
		this.casefile = casefile
	}

	/**
	 * Merge two "ConfigInfo" into one, one with high, one with low priority.
	 */

	ConfigInfo(ConfigInfo high, ConfigInfo low) {
		checkNotNull(high)
		checkNotNull(low)
		this.uriMap         = ConfigInfoHelper.overrideMap(high.uriMap, low.uriMap).asImmutable()
		this.secure         = ConfigInfoHelper.override(high.secure, low.secure)
		this.hostnameverify = ConfigInfoHelper.override(high.hostnameverify, low.hostnameverify)
		this.credentials    = ConfigInfoHelper.override(high.credentials, low.credentials)
		this.caseId         = ConfigInfoHelper.override(high.caseId, low.caseId)
		this.casefile       = ConfigInfoHelper.override(high.casefile, low.casefile)
		if (this.caseId == null) {
			// only if case id is not set...
			this.service   = ConfigInfoHelper.override(high.service, low.service)
			this.procedure = ConfigInfoHelper.override(high.procedure, low.procedure)
		}
		assert this.uriMap != null
	}

	/**
	 * Helper
	 */

	String toString() {
		// uriMap will write itself quite well; do not print password
		String x = """
provenance     = ${provenance}
uriMap         = ${uriMap}
secure         = ${secure}
hostnameverify = ${hostnameverify}
service        = ${service}
procedure      = ${procedure}
caseId         = ${caseId}
casefile       = ${casefile}
credentials    = ${credentials?.username}::..."""
		return x as String
	}
}
