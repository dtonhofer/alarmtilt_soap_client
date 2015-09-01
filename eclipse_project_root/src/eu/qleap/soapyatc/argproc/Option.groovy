package eu.qleap.soapyatc.argproc

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Represents an Option encountered on the command line
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class Option extends Capsule {
	
	Option(String s) {
		super(s)
	}
	
	boolean equals(Object x) {
		return (x != null) && (x instanceof Option) && (this.txt == x.txt)
	}
	
	String toString() {
		return "Option(${txt})"
	}
	
}
