package eu.qleap.soapyatc.test


import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite.class)
@Suite.SuiteClasses( [ eu.qleap.soapyatc.elements.test.JUnit_Elements.class, 
	eu.qleap.soapyatc.config.test.JUnit_Slurping.class,
	eu.qleap.soapyatc.config.test.JUnit_ProcessAnotherUri.class,
	eu.qleap.soapyatc.config.test.JUnit_Credentials.class,
	eu.qleap.soapyatc.config.test.JUnit_ReadConfig.class,
	eu.qleap.soapyatc.argproc.test.JUnit_ArgsPreprocessor.class,
	eu.qleap.soapyatc.argproc.test.JUnit_CaseFileReader.class
	 ] )
class JUnit_All {

}
