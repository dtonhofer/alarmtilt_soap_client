package eu.qleap.soapyatc.config.test

import static groovy.test.GroovyAssert.*
import name.heavycarbon.checks.CheckFailedException;

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.config.ConfigInfoHelper

class JUnit_ProcessAnotherUri {

	final static CLASS = JUnit_ProcessAnotherUri.class.name

	@Test
	void testProcessAnotherUri1() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.testProcessAnotherUri1")
		Map res = [:]
		List msgs = []
		ConfigInfoHelper.processAnotherUri('https://x.com/hello?wsdl', res, msgs)
		msgs.each { logger.info(it) }
		assertEquals( [ 'https' : new URI('https://x.com/hello?wsdl') ] , res)
	}

	@Test
	void testProcessAnotherUri2() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.testProcessAnotherUri2")
		Map res = [:]
		List msgs = []
		ConfigInfoHelper.processAnotherUri('https://x.com/hello?wsdl', res, msgs)
		ConfigInfoHelper.processAnotherUri('http://y.com/hello?wsdl', res, msgs)
		msgs.each { logger.info(it) }
		assertEquals([ 'https' : new URI('https://x.com/hello?wsdl') , 'http' : new URI('http://y.com/hello?wsdl') ], res)
	}

	@Test
	void testProcessAnotherUri3() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.testProcessAnotherUri3")
		Map res = [:]
		List msgs = []
		ConfigInfoHelper.processAnotherUri('https://x.com/hello?wsdl', res, msgs)
		ConfigInfoHelper.processAnotherUri('https://foo.com/goodby?wsdl', res, msgs)
		msgs.each { logger.info(it) }
		assertEquals(  [ 'https' : new URI('https://foo.com/goodby?wsdl') ], res )
	}

	@Test
	void testProcessAnotherUri4() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.testProcessAnotherUri4")
		Map res = [:]
		List msgs = []
		shouldFail CheckFailedException, {
			ConfigInfoHelper.processAnotherUri('foobar', res, msgs)
		}
	}

	@Test
	void testProcessAnotherUri5() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.testProcessAnotherUri5")
		Map res = [:]
		List msgs = []
		shouldFail CheckFailedException, {
			ConfigInfoHelper.processAnotherUri('urn:foobar', res, msgs)
		}
	}
}

