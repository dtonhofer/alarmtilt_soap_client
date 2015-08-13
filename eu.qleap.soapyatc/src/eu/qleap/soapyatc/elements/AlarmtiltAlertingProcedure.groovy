package eu.qleap.soapyatc.elements

import org.slf4j.Logger;

import static name.heavycarbon.checks.BasicChecks.*
import name.heavycarbon.carpetbag.AbstractName

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Something to name "AlarmTILT alerting procedures"
 * To every AlarmtiltProcedureName corresponds a lowercase, trimmed and
 * nonempty string.
 *
 * 2015.08.11 - First run
 ******************************************************************************/

/**
 * The (typed) string is used on the command line to select alerting procedures
 * (case is irrelevant)
 */

final class AtpName extends AbstractName {

	final static CLASS = AtpName.class.name
	final static Logger LOGGER_makeName = LoggerFactory.getLogger("${CLASS}.makeName")

	AtpName(String x) {
		super(x)
	}

	/**
	 * Make an AtpName. Always throws if null passed. Throws if not found.
	 */

	static AtpName makeName(String name) {
		Logger logger = LOGGER_makeName
		checkNotNull(name)
		AtpDesc res = AtpMap.lookup(name,false,false)
		if (!res) {
			instaFail("Could not transform the string '${name}' into an ${AtpName.class.getName()}")
		}
		else {
			return res.name
		}
	}
}

/**
 * More information about an "AlarmTILT alerting procedure"
 */

final class AtpDesc {

	final AtpName name      // not null; our name
	final String  rawName   // not null; this name is communicated to AlarmTILT, already trimmed
	final String  desc      // not null; a human-readable description of the procedure

	AtpDesc(AtpName name, String rawName,String desc) {
		checkNotNull(name)
		checkNotNullAndNotOnlyWhitespace(rawName)
		checkNotNull(desc)
		this.name    = name
		this.rawName = rawName.trim()
		this.desc    = desc
	}

}

/**
 * A container class for the map of AtpName -> AtpDesc mappings
 */

class AtpMap {

	static final Map map

	static {
		def list = [
			new AtpDesc(new AtpName('asa'),'ASA','no further description'),
			new AtpDesc(new AtpName('auslauf_a2_a3'),'Auslauf A2/A3','no further description'),
			new AtpDesc(new AtpName('einlauf_a2_a3'),'Einlauf A2/A3','no further description'),
			new AtpDesc(new AtpName('cargolux'),'CARGOLUX','no further description'),
			new AtpDesc(new AtpName('pumpwerk'),'Pumpwerk','no further description'),
			new AtpDesc(new AtpName('rub2'),'RUB2','no further description'),
			new AtpDesc(new AtpName('8200414_findel'),'8200414 Findel','no further description'),
			new AtpDesc(new AtpName('test'),'Test','no further description'),
			new AtpDesc(new AtpName('winncc_com'),'WinCC_Com','no further description')
		]
		def tmpMap = [:]
		list.each {
			tmpMap[it.name] = it
		}
		map = tmpMap.asImmutable()
	}

	private AtpMap() {
		cannotHappen("Class cannot be instantiated");
	}

	static List printOut() {
		List res = []
		map.each { AtpName k, AtpDesc v ->
			res << "'${k}' ==> Alerting procedure with name '${v.rawName}': ${v.desc}"
		}
		return res
	}

	/**
	 * Lookup; Always throws if null is passed
	 */

	static AtpDesc lookup(String x, boolean throwIfNotFound, boolean throwIfBadName) {
		checkNotNull(x)
		def key
		try {
			key = new AtpName(x)
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

	static AtpDesc lookup(String x) {
		return lookup(x,true,true)
	}
}
