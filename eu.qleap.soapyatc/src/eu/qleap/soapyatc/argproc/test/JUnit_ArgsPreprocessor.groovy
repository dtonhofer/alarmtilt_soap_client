package eu.qleap.soapyatc.argproc.test

import static groovy.test.GroovyAssert.*

import eu.qleap.soapyatc.argproc.ArgsPreprocessor
import eu.qleap.soapyatc.argproc.Option
import eu.qleap.soapyatc.argproc.Value
import org.junit.Test
import org.slf4j.LoggerFactory

class JUnit_ArgsPreprocessor {

	final static CLASS = JUnit_ArgsPreprocessor.class.name
	final static boolean wasAttached = true
	
	@Test
	void cannotInstantiate() {
		shouldFail { new ArgsPreprocessor() }
	}

	@Test
	void preprocessArgs1() {
		def logger = LoggerFactory.getLogger("${CLASS}.preprocessArgs1")
		List msgs = []
		List arglist = ArgsPreprocessor.preprocess(['--help', '--config'] as String[], msgs)
		assertTrue(msgs.isEmpty())
		List expectedArglist = [
			new Option('help'),
			new Option('config')
		]
		logger.info("arglist = ${arglist}")
		logger.info("expectedArglist = ${expectedArglist}")
		assertEquals(expectedArglist,arglist)
	}

	@Test
	void preprocessArgs2() {
		def logger = LoggerFactory.getLogger("${CLASS}.preprocessArgs2")
		List msgs = []
		List arglist = ArgsPreprocessor.preprocess([
			'--config=677',
			'--alpha=mu',
			'--bravo=',
			'--charlie=   ',
			'--delta',
			'XYZ',
			'--echo',
			'--foxtrott=--golf'] as String[], msgs)
		assertTrue(msgs.isEmpty())
		List expectedArglist = [
			new Option('config'),
			new Value('677',wasAttached),
			new Option('alpha'),
			new Value('mu',wasAttached),
			new Option('bravo'),
			new Value('',wasAttached),
			new Option('charlie'),
			new Value('   ',wasAttached),
			new Option('delta'),
			new Value('XYZ',!wasAttached),
			new Option('echo'),
			new Option('foxtrott'),
			new Value('--golf',wasAttached)
		]
		logger.info("arglist = ${arglist}")
		logger.info("expectedArglist = ${expectedArglist}")
		assertEquals(expectedArglist, arglist)
	}

	@Test
	void preprocessArgs3() {
		def logger = LoggerFactory.getLogger("${CLASS}.preprocessArgs3")
		List msgs = []
		List arglist = ArgsPreprocessor.preprocess([
			'--config=677',
			'--',
			'--bravo=',
			'charlie',
			'',
			'-delta'] as String[], msgs)
		assertTrue(msgs.isEmpty())
		List expectedArglist = [
			new Option('config'),
			new Value('677',wasAttached),
			new Value('--bravo=',!wasAttached),
			new Value('charlie',!wasAttached),
			new Value('',!wasAttached),
			new Value('-delta',!wasAttached),
		]
		logger.info("arglist = ${arglist}")
		logger.info("expectedArglist = ${expectedArglist}")
		assertEquals(expectedArglist, arglist)
	}

	@Test
	void preprocessArgs4() {
		def logger = LoggerFactory.getLogger("${CLASS}.preprocessArgs4")
		List msgs = []
		List arglist = ArgsPreprocessor.preprocess([
			'--config=677',
			'-h',
			'--help',
			'--help=what'] as String[], msgs)
		assertTrue(msgs.isEmpty())
		msgs.each { logger.info(it) }
		List expectedArglist = [
			new Option('config'),
			new Value('677',wasAttached),
			new Option('help'),
			new Option('help'),
			new Option('help'),
			new Value('what',wasAttached)
		]
		logger.info("arglist = ${arglist}")
		logger.info("expectedArglist = ${expectedArglist}")
		assertEquals(expectedArglist, arglist)
	}
}