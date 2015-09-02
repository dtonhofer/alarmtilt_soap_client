package eu.qleap.soapyatc.config.test

import static groovy.test.GroovyAssert.*
import name.heavycarbon.checks.CheckFailedException;
import name.heavycarbon.utils.ResourceHelpGroovy;

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.config.ConfigInfo
import eu.qleap.soapyatc.elements.AtwsMap

class JUnit_ReadConfig {

	final static CLASS = JUnit_ReadConfig.class.name
	final static boolean lenient = true
	
	@Test
	void defaultResource() {
		ConfigInfo ci = new ConfigInfo()
		assertEquals([:],ci.uriMap)
		assertEquals(true,ci.secure)
		assertEquals(true,ci.hostnameverify)
		assertEquals(AtwsMap.makeName('ping'), AtwsMap.makeName(ci.service))
		assertNull(ci.procedure)
		assertNull(ci.credentials)
		assertNull(ci.caseId)
	}
	
	@Test
	void readValidResource1() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readValidResource1")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_1.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, lenient)
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
		assertEquals(5556, ci.caseId)
	}
	
	@Test
	void readValidResource2() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readValidResource2")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_2.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, lenient)
		msgs.each {
			logger.info(it)
		}
		assertEquals(new URI('https://x.y.com/hello2?wsdl'),ci.uriMap['https'])
		assertEquals(false,ci.secure)
		assertNull(ci.hostnameverify)
		assertNull(ci.procedure)
		assertEquals('USERNAME', ci.credentials.username)
		assertEquals('', ci.credentials.password)
		assertNull(ci.caseId)
	}

	@Test
	void readValidResourceWithVariantCasing() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readValidResourceWithVariantCasing")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_variant_casing.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, lenient)
		msgs.each {
			logger.info(it)
		}
		assertEquals(new URI('https://x.y.com/hello1?wsdl'),ci.uriMap['https'])
		assertEquals(new URI('http://a.b.com/hello2?wsdl'),ci.uriMap['http'])
		assertEquals(false,ci.secure)
		assertNull(ci.hostnameverify)
		assertNull(ci.procedure)
		assertEquals('USERNAME', ci.credentials.username)
		assertEquals('HELLO WORLDS', ci.credentials.password)
		assertEquals(444, ci.caseId)
	}

	@Test
	void readEmptyResource() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readEmptyResource")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'valid_config_3.txt')
		ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, lenient)
		msgs.each {
			logger.info(it)
		}
		assertEquals([:],ci.uriMap)
		assertNull(ci.secure)
		assertNull(ci.hostnameverify)
		assertNull(ci.service)
		assertNull(ci.procedure)
		assertNull(ci.credentials)
		assertNull(ci.caseId)
	}

	@Test
	void readLousyResourceNonLeniently() {
		Logger logger = LoggerFactory.getLogger("${CLASS}.readLousyResourceNonLeniently")
		List msgs = []
		String fqrn = ResourceHelpGroovy.fullyQualifyResourceName(JUnit_ReadConfig.class,'lousy_config.txt')
		shouldFail CheckFailedException, {
			ConfigInfo ci = new ConfigInfo("^${fqrn}", msgs, !lenient)			
		}
	}

}
