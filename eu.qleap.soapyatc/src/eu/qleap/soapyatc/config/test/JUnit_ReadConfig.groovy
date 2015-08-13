package eu.qleap.soapyatc.config.test

import static groovy.test.GroovyAssert.*
import name.heavycarbon.carpetbag.ResourceHelpGroovy

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.config.ConfigInfo
import eu.qleap.soapyatc.elements.AtwsMap

class JUnit_ReadConfig {

	final static CLASS = JUnit_ReadConfig.class.name

	@Test
	void defaultResource() {
		ConfigInfo ci = new ConfigInfo()
		assertEquals([:],ci.uriMap)
		assertEquals(true,ci.secure)
		assertEquals(true,ci.hostnameverify)
		assertEquals(AtwsMap.lookup('ping').name, ci.service)
		assertNull(ci.procedure)
		assertNull(ci.credentials)
	}
	
	@Test
	void readValidResource1() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readValidResource1")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_1.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, true)
		msgs.each {
			logger.info(it)
		}
		assertEquals(new URI('http://x.y.com/hello?wsdl'),ci.uriMap['http'])
		assertEquals(new URI('https://x.y.com/hello?wsdl'),ci.uriMap['https'])
		assertEquals(true,ci.secure)
		assertEquals(true,ci.hostnameverify)
		assertEquals('launch',ci.service as String)
		assertEquals('cargolux',ci.procedure as String)
		assertEquals('USERNAME', ci.credentials.username)
		assertEquals('PASSWORD', ci.credentials.password)
	}
	
	@Test
	void readValidResource2() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readValidResource2")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_2.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, true)
		msgs.each {
			logger.info(it)
		}
		assertEquals(new URI('https://x.y.com/hello2?wsdl'),ci.uriMap['https'])
		assertEquals(false,ci.secure)
		assertNull(ci.hostnameverify)
		assertNull(ci.procedure)
		assertEquals('USERNAME', ci.credentials.username)
		assertEquals('', ci.credentials.password)
	}

	@Test
	void readEmptyResource() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readValidResource3")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_3.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, true)
		msgs.each {
			logger.info(it)
		}
		assertEquals([:],ci.uriMap)
		assertNull(ci.secure)
		assertNull(ci.hostnameverify)
		assertNull(ci.service)
		assertNull(ci.procedure)
		assertNull(ci.credentials)
	}

}
