package eu.qleap.soapyatc.config

import static name.heavycarbon.checks.BasicChecks.*
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

	final Map         uriMap          // map scheme (http,https) to java.net.URI instance; always set but maybe empty
	final Boolean     secure          // secure or not? true by default
	final Boolean     hostnameverify  // hostname verification or not? true by default
	final AtwsName    service         // web service to call, "ping" by default
	final AtpName     procedure       // procedure to call if web service = "launch", unset by default
	final Credentials credentials     // credentials, unset by default

	/**
	 * Keywords used in config file or on command line
	 */

	final static String key_config         = 'config' // indicates where to get config from, not stored
	final static String key_url            = 'url' // may appear several times with different schemes
	final static String key_secure         = 'secure'
	final static String key_hostnameverify = 'hostnameverify'
	final static String key_service        = 'service' // web service
	final static String key_procedure      = 'procedure' // alarmtilt procedure
	final static String key_credentials    = 'credentials' // gives USERNAME::PASSWORD, transforemd into "Creds" instance

	/**
	 * Create the "fully default ConfigInfo", which does not contain much
	 */

	ConfigInfo() {
		uriMap         = [:].asImmutable()
		secure         = true
		hostnameverify = true
		service        = AtwsMap.lookup('ping').name
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
		// the next line will throw if there is fishyness
		List text = Helper.slurpConfig(what,msgs)
		// no exception, so we could read something... process it!
		Map map = Helper.mapifyKeyValueTextForConfigInfo(text, msgs, lenient)
		// get stuff from the "map"
		this.uriMap = map[key_url].asImmutable();
		this.secure = map[key_secure]
		this.hostnameverify = map[key_hostnameverify]
		this.service = map[key_service]
		this.procedure = map[key_procedure]
		this.credentials = map[key_credentials]
	}

	/**
	 * Construct from given values
	 */
	
	ConfigInfo(Map uriMap, Boolean secure, Boolean hostnameverify, AtwsName service, AtpName procedure, Credentials credentials) {
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
	}
	
	/**
	 * Merge two "ConfigInfo" into one, one with high, one with low priority.
	 */

	ConfigInfo(ConfigInfo high, ConfigInfo low) {
		checkNotNull(high)
		checkNotNull(low)
		this.uriMap         = Helper.overrideMap(high.uriMap, low.uriMap).asImmutable()
		this.secure         = Helper.override(high.secure, low.secure)
		this.hostnameverify = Helper.override(high.hostnameverify, low.hostnameverify)
		this.service        = Helper.override(high.service, low.service)
		this.procedure      = Helper.override(high.procedure, low.procedure)
		this.credentials    = Helper.override(high.credentials, low.credentials)
		assert this.uriMap != null
	}

	/**
	 * Helper
	 */
	
	String toString() {
		return "uriMap = ${uriMap}, secure = ${secure}, hostnameverify = ${hostnameverify}, service = ${service}, procedure = ${procedure}, credentials = ${credentials?.username}"	
	}
}
