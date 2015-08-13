package eu.qleap.soapyatc.config.test

import static groovy.test.GroovyAssert.*

import name.heavycarbon.carpetbag.ResourceHelpGroovy
import name.heavycarbon.checks.CheckFailedException

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.config.Helper

class JUnit_Slurping {

	final static CLASS = JUnit_Slurping.class.name

	@Test
	void slurpExistingResource() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.slurpExistingResource")
		List msgs = []
		def fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_Slurping.class,'Test.txt')
		List file = Helper.slurpConfig("^${fqrn}",'UTF-8',msgs)
		msgs.each { logger.info(it) }
		file.each { logger.info(it) }
		assertEquals( file[0], 'This is just a test file')
		assertEquals( file[1], 'Hello World')
		assertEquals( file[2], 'è')
	}

	@Test
	void tSlurpNonExistingResource() {
		List msgs = []
		def fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_Slurping.class,'Test_Nonexistent.txt')
		shouldFail CheckFailedException, {
			Helper.slurpConfig("^${fqrn}",'UTF-8',msgs)
		}
	}

	@Test
	void slurpExistingResource2() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.slurpExistingResource2")
		List msgs = []
		def fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_Slurping.class,'Test.txt')
		List file = Helper.slurpConfig("^${fqrn}",msgs)
		msgs.each { logger.info(it) }
		file.each { logger.info(it) }
		assertEquals( file[0] , 'This is just a test file' )
		assertEquals( file[1] , 'Hello World')
		assertEquals( file[2] , 'è')
	}

	@Test
	void slurpExistingResource2InISO88591() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.slurpExistingResource2InISO88591")
		List msgs = []
		def fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_Slurping.class,'Test.txt')
		List file = Helper.slurpConfig("^${fqrn}::iso-8859-1",msgs)
		msgs.each { logger.info(it) }
		file.each { logger.info(it) }
		assertEquals(  file[0] , 'This is just a test file')
		assertEquals(  file[1] , 'Hello World')
		assertEquals(  file[2] ,'Ã¨') // this is actually a wrongly read è
	}

	@Test
	void slurpNonExistingResource2InISO88591() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.slurpNonExistingResource2InISO88591")
		List msgs = []
		def fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_Slurping.class,'Test_Nonexistent.txt')
		shouldFail CheckFailedException, {
			Helper.slurpConfig("^${fqrn}::iso-8859-1",msgs)
		}
	}
}
