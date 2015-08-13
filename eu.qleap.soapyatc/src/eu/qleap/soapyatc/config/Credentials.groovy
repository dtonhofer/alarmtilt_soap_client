package eu.qleap.soapyatc.config

import static name.heavycarbon.checks.BasicChecks.*

import java.util.regex.Matcher
import java.util.regex.Pattern

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Structure to hold credentials
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class Credentials {

	final static CLASS = Credentials.class.name
	final static Logger LOGGER_makeCredentials = LoggerFactory.getLogger("${CLASS}.makeCredentials")

	final String username // not null and not empty and trimmed
	final String password // can be anything except null

	Credentials(String username,String password) {
		checkNotNullAndNotOnlyWhitespace(username)
		checkNotNull(password)
		this.username = username.trim()
		this.password = password
	}

	/**
	 * Credentials are "equal" if username and password match. This is used in tests only
	 */

	boolean equals(def o) {
		return o != null && o instanceof Credentials && o.username == username && o.password == password
	}

	/**
	 * Process a string that represents credentials.
	 * The string is of the form USERNAME::PASSWORD (the "::" is the first one found, so USERNAME may not contain
	 * "::", whereas PASSWORD can)
	 * Any withespace "around" USERNAME is dicarded; any whitespace "around" PASSWORD may or may not be discarded
	 * Throws if cannot be created
	 */

	static Credentials makeCredentials(String x, boolean trimPassword) {
		Logger logger = LOGGER_makeCredentials
		checkNotNull(x)
		Pattern pat = ~/^\s*(.+?)\s*::(.*)$/
		Matcher m = (x =~ pat)
		checkTrue(m.matches(), "Cannot build credentials. Format should be 'USERNAME::PASSWORD'")
		assert m.matches()
		String username = m.group(1)
		String password = m.group(2)
		if (trimPassword) {
			password = password.trim()
		}
		assert username.trim() != ''
		return new Credentials(username, password)
	}

	/**
	 * Process a string that represents credentials.
	 * The string is of the form USERNAME::PASSWORD (the "::" is the first one found, so USERNAME may not contain
	 * "::", whereas PASSWORD can)
	 * Any withespace "around" USERNAME and PASSWORD is dicarded
	 */

	static Credentials makeCredentials(String x) {
		return makeCredentials(x, true)
	}
}
