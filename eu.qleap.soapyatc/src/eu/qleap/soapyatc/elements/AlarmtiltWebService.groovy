package eu.qleap.soapyatc.elements

import org.slf4j.Logger;

import name.heavycarbon.carpetbag.AbstractName;
import static name.heavycarbon.checks.BasicChecks.*;
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Something to name web services that can be invoked on the AlarmTILT soap
 * interface
 *
 * 2015.08.11 - First run
 ******************************************************************************/

/**
 * AtwsName instances are used in naming AlarmTILT web services.
 * To each AtwsName corresponds a lowercase, trimmed and nonempty string.
 * That string is used on the command line to select the corresponding 
 * web service (case is irrelevant)
 */

final class AtwsName extends AbstractName {

	final static CLASS = AtwsName.class.name
	final static Logger LOGGER_makeName = LoggerFactory.getLogger("${CLASS}.makeName")

	AtwsName(String x) {
		super(x)
	}

	/**
	 * Make an AtwsName. Throw if that cannot be done. Always throws if null passed
	 */

	static AtwsName makeName(String name) {
		Logger logger = LOGGER_makeName
		checkNotNull(name, 'name')
		AtwsDesc res = AtwsMap.lookup(name,false,false)
		if (!res) {
			instaFail("Could not transform the string '${name}' into an ${AtwsName.class.getName()}")
		}
		else {
			return res.name
		}
	}

}

/**
 * More information about an "AlarmTILT web service"
 */

final class AtwsDesc {

	final AtwsName name      // not null; our name
	final String   rawName   // not null; this name is communicated to AlarmTILT, already trimmed
	final String   desc      // not null; a human-readable description of the procedure

	AtwsDesc(AtwsName name, String rawName,String desc) {
		checkNotNull(name)
		checkNotNullAndNotOnlyWhitespace(rawName)
		checkNotNull(desc)
		this.name    = name
		this.rawName = rawName.trim()
		this.desc    = desc
	}

}

/**
 * A container class for the map of AtwsName -> AtwsDesc mappings
 */

abstract class AtwsMap {

	static final Map map

	static {
		def list = [
			new AtwsDesc(new AtwsName('ping'),'pingService','Check presence and accessibility of remote server'),
			new AtwsDesc(new AtwsName('launch'),'LaunchProcedure','Launch named alerting procedure'),
		]
		def tmpMap = [:]
		list.each {
			tmpMap[it.name] = it
		}
		map = tmpMap.asImmutable()
	}

	private AtwsMap() {
		cannotHappen("Class cannot be instantiated");
	}

	static List printOut() {
		List res = []
		map.each { AtwsName k, AtwsDesc v ->
			res << "'${k}' ==> Web service with name '${v.name}': ${v.desc}"
		}
		return res
	}

	static AtwsDesc lookup(String x, boolean throwIfNotFound, boolean throwIfBadName) {
		def key
		try {
			key = new AtwsName(x)
		}
		catch (Exception exe) {
			if (throwIfBadName) {
				throw exe
			}
			key = "~NOTHING CORRESPONDS TO THIS~"
		}
		assert key != null
		def res = map[key]
		if (!res && throwIfNotFound) {
			instaFail("Did not find an entry corresponding to passed string '${x}'")
		}
		return res
	}

	static AtwsDesc lookup(String x) {
		return lookup(x,true,true)
	}

}
