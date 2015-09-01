package eu.qleap.soapyatc.argproc

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Represents a Value encountered on the command line
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class Value extends Capsule {
	
	final boolean wasAttached // the value comes from "--option=value" string instead of "--option value" string pair
	
	Value(String s, boolean wasAttached) {
		super(s)
		this.wasAttached = wasAttached
	}
	
	boolean equals(Object x) {
		// care about the "was attached" because we actually use it in test cases...
		return (x != null) && (x instanceof Value) && (this.txt == x.txt) && (this.wasAttached == x.wasAttached)
	}
	
	String toString() {
		String u = ''
		if (wasAttached) {
			u = ",wasAttached"
		}
		return "Value(${txt}${u})"
	}
	
}
