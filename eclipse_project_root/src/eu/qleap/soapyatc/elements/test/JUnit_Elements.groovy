package eu.qleap.soapyatc.elements.test

import static groovy.test.GroovyAssert.*
import name.heavycarbon.checks.CheckFailedException

import org.junit.Test
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.elements.AtpMap
import eu.qleap.soapyatc.elements.AtpName
import eu.qleap.soapyatc.elements.AtwsMap;
import eu.qleap.soapyatc.elements.AtwsName

class JUnit_Elements {

	private final static String CLASS = JUnit_Elements.class.name

	@Test
	void testMakeWebServiceName() {
		assertNotNull AtwsMap.makeName('  piNG ')
		assertNotNull AtwsMap.makeName('ping')
		assertNotNull AtwsMap.makeName('launch')
		shouldFail CheckFailedException, { AtwsMap.makeName('XXXX') }
		shouldFail CheckFailedException, { AtwsMap.makeName('') }
		shouldFail CheckFailedException, { AtwsMap.makeName(null) }
	}

	@Test
	void testMakeAlarmtiltProcedureName() {
		assertNotNull AtpMap.makeName('cargolux')
		shouldFail CheckFailedException, { AtpMap.makeName('XXXX') }
		shouldFail CheckFailedException, { AtpMap.makeName('') }
		shouldFail CheckFailedException, { AtpMap.makeName(null) }
	}

	@Test
	void testPrinting() {
		def logger = LoggerFactory.getLogger("${CLASS}.testPrinting")
		def out = AtpMap.printOut()
		out.each { logger.info(it) }
	}

	@Test
	void testBadLookupWithoutExceptions() {
		def logger = LoggerFactory.getLogger("${CLASS}.testBadLookupWithoutExceptions")
		assertNull AtpMap.lookup('bad',false,false)
		assertNull AtpMap.lookup('',false,false)
		shouldFail CheckFailedException, {
			AtpMap.lookup(null,false,false)
		}
	}

	void testBadLookupWithExceptions() {
		def logger = LoggerFactory.getLogger("${CLASS}.testBadLookupWithExceptions")
		final boolean throwIfNotFound = true
		final boolean throwIfBadName = true
		shouldFail IllegalArgumentException, {
			AtpMap.lookup('bad',throwIfNotFound,!throwIfBadName)
		}
		shouldFail IllegalArgumentException, {
			AtpMap.lookup('bad',throwIfNotFound,throwIfBadName)
		}
		assertNull AtpMap.lookup('bad',!throwIfNotFound,throwIfBadName)
		shouldFail IllegalArgumentException, {
			AtpMap.lookup('',!throwIfNotFound,throwIfBadName)
		}
		shouldFail IllegalArgumentException, {
			AtpMap.lookup('',throwIfNotFound,throwIfBadName)
		}
		assertNull AtpMap.lookup('',throwIfNotFound,!throwIfBadName)
		shouldFail CheckFailedException, {
			AtpMap.lookup(null,!throwIfNotFound,throwIfBadName)
		}
		shouldFail CheckFailedException, {
			AtpMap.lookup(null,throwIfNotFound,throwIfBadName)
		}
		shouldFail CheckFailedException, {
			AtpMap.lookup(null,throwIfNotFound,!throwIfBadName)
		}
	}

	@Test
	void testGoodLookupsVariousWritingStyle() {
		assertEquals( AtpMap.lookup('ASA').name , new AtpName('asa'))
		assertEquals( AtpMap.lookup(' ASA  ').name , new AtpName('asa'))
		assertEquals( AtpMap.lookup(' AsA  ').name , new AtpName('asa'))
		assertEquals( AtpMap.lookup('asa').name , new AtpName('asa'))
	}

	@Test
	void testAllGoodLookups() {
		assertNotNull AtpMap.lookup('asa')
		assertNotNull AtpMap.lookup('auslauf_a2_a3')
		assertNotNull AtpMap.lookup('einlauf_a2_a3')
		assertNotNull AtpMap.lookup('cargolux')
		assertNotNull AtpMap.lookup('pumpwerk')
		assertNotNull AtpMap.lookup('rub2')
		assertNotNull AtpMap.lookup('8200414_findel')
		assertNotNull AtpMap.lookup('test')
		assertNotNull AtpMap.lookup('winncc_com')
	}
}
