package eu.qleap.soapyatc.argproc

import static name.heavycarbon.checks.BasicChecks.*

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Normalize anything that looks like --A=N into --A N
 * and mark everything as being either Option or Value
 * The special case of "--" means that everything after "--" is a value.
 * Hardcoded short option "-h" is "--help" and "-v", "-vv", "-vvv" etc. is "--verbose=[leve]"
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class ArgsPreprocessor {

	private ArgsPreprocessor() {
		cannotHappen("Class cannot be instantiated");
	}

	static List preprocess(String[] args, List msgs) {
		checkNotNull(args,'args')
		checkNotNull(args,'msgs')
		final boolean wasAttached = true
		def res = []
		def errors = []
		def onlyValuesNow = false
		args.each {
			if (onlyValuesNow) {
				res << new Value(it,!wasAttached)
			}
			else {
				if (it == '--') {
					onlyValuesNow = true
				}
				else if (it.startsWith('--')) {
					// "long option"
					def st = it.substring(2)
					def pe = st.indexOf("=")
					if (pe == 0) {
						msgs << "Option '${it}' with unexpected '=' at first character ... skipping this!"
					}
					else if (pe > 0) {
						res << new Option(st.substring(0,pe))
						res << new Value(st.substring(pe+1,st.length()),wasAttached)
					}
					else {
						res << new Option(st)
					}
				}
				else if (it.startsWith('-')) {
					// "short option", we only know "-h" for "help" and "-v", "-vv", "-vvv" etc. for verbosity levels
					def st = it.substring(1)
					if (st == 'h') {
						res << new Option('help')
					}
					/*
					 else if (st =~ /^v+$/) {
					 res << new Option("verbose")
					 // the value is the string representation of the integer giving the number of "v"
					 res << new Value("${st.length()}",wasAttached)
					 }
					 */
					else {
						msgs << "Short option '${it}' not recognized (only know about -h ... skipping this!"
					}
				}
				else {
					// does not look like a short or long option; assume a value
					res << new Value(it,!wasAttached)
				}
			}
		}
		return res
	}
}
