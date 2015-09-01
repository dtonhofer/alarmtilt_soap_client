package eu.qleap.soapyatc.argproc

import static name.heavycarbon.checks.BasicChecks.*

import java.util.List;
import java.util.Map;

import name.heavycarbon.utils.BooleanParser;

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import eu.qleap.soapyatc.config.Credentials;
import eu.qleap.soapyatc.config.ConfigInfoHelper;
import eu.qleap.soapyatc.elements.AtpMap;
import eu.qleap.soapyatc.elements.AtpName;
import eu.qleap.soapyatc.elements.AtwsMap;
import eu.qleap.soapyatc.elements.AtwsName;

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Process the arguments found on the command line *
 * 2015.08.11 - First run
 ******************************************************************************/

class ArgsProcessor {

	final static String CLASS = ArgsProcessor.class.name
	final static Logger LOGGER_process = LoggerFactory.getLogger("${CLASS}.process")

	/**
	 * Tags used internally for passing values around
	 */

	final static tag_result        = 'result'
	final static tag_tailvalues    = 'tailvalues'

	final static tag_new_i         = 'new_i'
	final static tag_new_state     = 'new_state'
	final static tag_openoptionstr = 'openoptionstr'

	/**
	 * Options which may be found on the command line
	 * "case" is a shortcut. It expects a numeric id which is then 
	 * mapped to "service=launch" and "procedure=X" where X is
	 * obtained from a lookup table 
	 */

	final static String OPTION_CONFIG     = 'config'
	final static String OPTION_URL        = 'url'
	final static String OPTION_SECURE     = 'secure'
	final static String OPTION_HNV        = 'hostnameverify'
	final static String OPTION_SERVICE    = 'service'
	final static String OPTION_PROCEDURE  = 'procedure'
	final static String OPTION_CREDS      = 'creds'
	final static String OPTION_HELP       = 'help'
	final static String OPTION_CASEID     = 'case'
	final static String OPTION_CASEFILE   = 'casefile'

	/**
	 * States of the argument processor
	 */

	static enum State {
		FRESH, EXPECT_OPTIONAL_BOOLEAN_ARG, EXPECT_ONE_ARG, STOP
	}

	/**
	 * Unreachable constructor
	 */

	private ArgsProcessor() {
		cannotHappen("Class cannot be instantiated");
	}

	/**
	 * Call this with the args passed to main(). May throw.
	 * 
	 * Return these:
	 * 
	 * Under tag_result     : map (see below)
	 * Under tag_tailValues : tail values (list of values found at far end of argument list) 
	 *  
	 * The map under "tag_result" maps OPTION_* keywords to their respective values
	 * 
	 * If the entry exists:
	 * 
	 * OPTION_CONFIG     => list of Strings indicating configuration resources to read, in order of encounter
	 * OPTION_URL        => map mapping the scheme (http/https) to an Uri instance
	 * OPTION_SECURE     => a boolean
	 * OPTION_HNV        => a boolean 
	 * OPTION_SERVICE    => a AtwsName
	 * OPTION_PROCEDURE  => a AtpName
	 * OPTION_CREDS      => a Credentials structure
	 * OPTION_HELP       => a boolean
	 */

	static Map process(String[] args, List msgs) {
		Logger logger = LOGGER_process
		checkNotNull(args, 'args')
		checkNotNull(msgs, 'msgs')
		//
		// Preprocess
		//
		List argList = ArgsPreprocessor.preprocess(args, msgs)
		//
		// Set up:
		// - State of processor
		// - Position in "arglist"
		// - Option string last seen
		//
		State state = State.FRESH
		int i = 0
		String openOptionStr
		List tailValues = []
		Map result = [:]
		while (state != State.STOP) {
			if (State.FRESH == state) {
				if (i >= argList.size()) {
					state = State.STOP
				}
				else {
					def mm = handleFresh(argList[i], i, argList, tailValues, msgs)
					i = mm[(tag_new_i)]
					state = mm[(tag_new_state)]
					openOptionStr = mm[(tag_openoptionstr)]
				}
			}
			else if (State.EXPECT_ONE_ARG == state) {
				if (i >= argList.size()) {
					msgs << "Missing final argument after ${openOptionStr}"
				}
				else {
					def mm = handleExpectOneArg(argList[i], i, result, openOptionStr, msgs)
					i = mm[(tag_new_i)]
					state = mm[(tag_new_state)]
				}
			}
			else if (State.EXPECT_OPTIONAL_BOOLEAN_ARG == state) {
				Capsule arg = null
				if (i < argList.size()) {
					arg = argList[i]
				}
				def mm = handleExpectOptionalBooleanArg(arg, i, result, openOptionStr, msgs)
				i = mm[(tag_new_i)]
				state = mm[(tag_new_state)]
			}
			else {
				cannotHappen("Unhandled state ${state} -- program fix needed")
			}
		}
		assert result != null
		assert tailValues != null
		return [ (tag_result) : result, (tag_tailvalues): tailValues ]
	}

	/**
	 * Check wether only values remain the "arglist", i.e. whether there are no more options,
	 */

	static boolean onlyValuesTillEnd(int i, List arglist) {
		if (i >= arglist.size()) {
			return true
		}
		else if (!(arglist[i] in Value)) {
			return false
		}
		else {
			// a nicely recursive call
			return onlyValuesTillEnd(i+1, arglist)
		}
	}

	/**
	 * Handle an element when in state "FRESH"; this must be an option or, if a value, 
	 * there must only be values left till end.
	 */

	static handleFresh(Capsule arg, int i, List arglist, List tailValues, List msgs) {
		def state
		def openOptionStr
		if (arg in Option) {
			String argTxt = arg.txt.toLowerCase()
			if (argTxt in [
				OPTION_CONFIG,
				OPTION_URL,
				OPTION_SERVICE,
				OPTION_PROCEDURE,
				OPTION_CREDS,
				OPTION_CASEID,
				OPTION_CASEFILE
			]) {
				openOptionStr = argTxt
				state = State.EXPECT_ONE_ARG
				i++
			}
			else if (argTxt in [
				OPTION_HELP,
				OPTION_SECURE,
				OPTION_HNV
			]) {
				openOptionStr = argTxt
				state = State.EXPECT_OPTIONAL_BOOLEAN_ARG
				i++
			}
			else {
				msgs << "Unknown option '--${argTxt}' -- skipping this"
				state = State.FRESH
				i++
			}
		}
		else if (arg in Value) {
			if (onlyValuesTillEnd(i+1, arglist)) {
				tailValues << arg
				state = State.FRESH
				i++
			}
			else {
				msgs << "Unusable value '${arg.txt}' -- skipping this"
				state = State.FRESH
				i++
			}
		}
		else {
			cannotHappen("Unhandled class ${arg.getClass().getName()} -- program fix needed")
		}
		return [
			(tag_new_state) : state,
			(tag_new_i) : i ,
			(tag_openoptionstr) : openOptionStr
		]
	}

	/**
	 * Handle an element when in state "EXPECT_ONE_ARG"; a single value must be encountered;
	 * the option string to which this value belongs is passed
	 */

	static handleExpectOneArg(Capsule arg, int i, Map result, String optionStr, List msgs) {
		def state
		if (arg in Option) {
			msgs << "Expected argument to '--${optionStr}'; found option '--${arg.txt}' instead; disregarding the '--${optionStr}'"
			state = State.FRESH
		}
		else if (arg in Value) {
			//
			// At this point, we know "too much" about the options, but for now we can live with that
			// Exceptions may be thrown, catch at the end and proceed
			//
			try {
				String argTxt = arg.txt // keep case!!
				if (optionStr == OPTION_CONFIG) {
					if (result[OPTION_CONFIG]) {
						// non-empty list already exists, just add to it
						result[OPTION_CONFIG] << argTxt
					}
					else {
						// empty list or list does not exist, create a new one
						result[OPTION_CONFIG] = [argTxt]
					}
				}
				else if (optionStr == OPTION_URL) {
					// make sure there is at least an empty map
					Map uriMap = result[OPTION_URL]
					if (!uriMap) {
						uriMap = [:]
					}
					result[OPTION_URL] = uriMap
					// integrate the new URI into the uriMap, which may fail
					ConfigInfoHelper.processAnotherUri(argTxt, uriMap, msgs)
				}
				else if (optionStr == OPTION_SERVICE) {
					// possibly override an existing value (if this is a name, otherwise exception)
					result[OPTION_SERVICE] = AtwsMap.makeName(argTxt)
				}
				else if (optionStr == OPTION_PROCEDURE) {
					// possibly override an existing value (if this is a name, otherwise exception)
					result[OPTION_PROCEDURE] = AtpMap.makeName(argTxt)
				}
				else if (optionStr == OPTION_CREDS) {
					// possibly override an existing value( (if this are valid credentials, otherwise exception)
					result[OPTION_CREDS] = Credentials.makeCredentials(argTxt)
				}
				else if (optionStr == OPTION_CASEID) {
					// possibly override an existing value (if this is a long, otherwise exception)
					result[OPTION_CASEID] = Long.valueOf(argTxt)
				}
				else if (optionStr == OPTION_CASEFILE) {
					// indicates a "case file"; do not do anything with this string as we may not need it
					result[OPTION_CASEFILE] = argTxt
				}
				else {
					cannotHappen("Unhandled case '${optionStr}' -- need a program fix");
				}
			}
			catch (Exception exe) {
				//
				// Just ignore this problem and feed "msgs". If there is anything in "msgs", main() will exit with error
				//
				msgs << exe.getMessage()
			}
			state = State.FRESH
			i++
		}
		else {
			cannotHappen("Unhandled class ${arg.getClass().getName()} -- need a program fix")
		}
		return [
			(tag_new_state) : state,
			(tag_new_i) : i
		]
	}

	/**
	 * Handle an optional boolean argument
	 */

	static handleExpectOptionalBooleanArg(Capsule arg, int i, Map result, String optionStr, List msgs) {
		def state
		if (arg == null || arg in Option) {
			// seems that no value was given; assume YES
			result[optionStr]=true
			state = State.FRESH
			i++
		}
		else if (arg in Value) {
			try {
				boolean b = BooleanParser.makeBoolean(arg.txt)
				result[optionStr]=b
			}
			catch (Exception exe) {
				//
				// Just ignore this problem and feed "msgs". If there is anything in "msgs", main() will exit with error
				//
				msgs << "Unusable value '${arg.txt}' (expected a boolean, but this ain't one) -- skipping this"
			}
			state = State.FRESH
			i++
		}
		else {
			cannotHappen("Unhandled type ${arg.getClass().getName()} -- need a program fix")
		}
		return [
			(tag_new_state) : state,
			(tag_new_i) : i
		]
	}
}

