package eu.qleap.soapyatc.argproc.test

import static groovy.test.GroovyAssert.*
import name.heavycarbon.checks.CheckFailedException
import name.heavycarbon.utils.ResourceHelpGroovy;

import org.junit.Test
import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.argproc.CaseFile;
import eu.qleap.soapyatc.elements.AtpMap;

class JUnit_CaseFileReader {

	final static CLASS = JUnit_CaseFileReader.class.name

	@Test
	void slurpEmptyCaseFile() {
		String casesResource = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_CaseFileReader.class,'cases_empty.txt')
		List msgs = []
		new CaseFile("^${casesResource}",msgs)
	}

	@Test
	void slurpFullCaseFile() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.slurpFullCaseFile")
		String casesResource = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_CaseFileReader.class,'cases_full.txt')
		List msgs = []
		def cf = new CaseFile("^${casesResource}",msgs)
		assertEquals(AtpMap.makeName('asa'), cf.lookup(1))
		assertEquals(AtpMap.makeName('auslauf_a2_a3'), cf.lookup(1103))
		assertEquals(AtpMap.makeName('asa'), cf.lookup(1108))
		assertEquals(AtpMap.makeName('cargolux'), cf.lookup(1303))
		assertEquals(AtpMap.makeName('einlauf_a2_a3'), cf.lookup(1203))
		assertEquals(AtpMap.makeName('pumpwerk'), cf.lookup(1003))
		assertEquals(AtpMap.makeName('rub2'), cf.lookup(1403))
		msgs.each {
			logger.warn("${it}")
		}
		shouldFail CheckFailedException, {
			cf.lookup(100)
		}
	}
}

