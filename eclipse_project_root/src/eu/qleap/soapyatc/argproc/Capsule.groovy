package eu.qleap.soapyatc.argproc

import static name.heavycarbon.checks.BasicChecks.*

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Abstract base class of "Option" and "Value" encountered on the command line
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class Capsule {
	
	final String txt // not null
	
	Capsule(String s) {		
		checkNotNull(s) // can be empty and include whitespace
		txt = s
	}
}
