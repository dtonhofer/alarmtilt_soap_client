package eu.qleap.soapyatc.config.test

import static groovy.test.GroovyAssert.*
import name.heavycarbon.checks.CheckFailedException

import org.junit.Test

import eu.qleap.soapyatc.config.Credentials

class JUnit_Credentials {

	@Test
	void processCredentials() {
		assertNotNull Credentials.makeCredentials('USERNAME::PASSWORD') == new Credentials('USERNAME','PASSWORD')
		assertNotNull Credentials.makeCredentials(' USERNAME ::   ') == new Credentials('USERNAME','')
		assertNotNull Credentials.makeCredentials(' USERNAME ::   ',false) == new Credentials('USERNAME','   ')
		assertNotNull Credentials.makeCredentials(' USERNAME ::') == new Credentials('USERNAME','')
		assertNotNull Credentials.makeCredentials('david.tonhofer@q-leap.eu::78fdhQX#6//') == new Credentials('david.tonhofer@q-leap.eu','78fdhQX#6//')
		shouldFail CheckFailedException, { Credentials.makeCredentials('::PASSWORD') }
		shouldFail CheckFailedException, { Credentials.makeCredentials('X:Y') }
		shouldFail CheckFailedException, { Credentials.makeCredentials('') }
		shouldFail CheckFailedException, { Credentials.makeCredentials(null) }
	}
}
