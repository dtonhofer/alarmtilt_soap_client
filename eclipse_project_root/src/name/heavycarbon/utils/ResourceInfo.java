package name.heavycarbon.utils;

import static name.heavycarbon.checks.BasicChecks.*;

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 * *****************************************************************************
 * A class used to describe where to find and how to read a text resource
 *
 * 2014.01.22 - Created
 ******************************************************************************/

public class ResourceInfo {

	public final static int DEFAULT_BUFFERED_READER_SIZE = 1024;

	public final String fullyQualifiedResourceName;
	public final String encoding;
	public final int bufferedReaderSize;

	public ResourceInfo(String fullyQualifiedResourceName, String encoding) {
		this(fullyQualifiedResourceName, encoding, DEFAULT_BUFFERED_READER_SIZE);
	}

	public ResourceInfo(String fullyQualifiedResourceName, String encoding, int bufferedReaderSize) {
		checkNotNullAndNotOnlyWhitespace(fullyQualifiedResourceName, "fullyQualifiedResourceName");
		checkNotNullAndNotOnlyWhitespace(encoding, "encoding");
		checkLargerOrEqualToZero(bufferedReaderSize, "bufferedReaderSize");
		this.fullyQualifiedResourceName = fullyQualifiedResourceName;
		this.encoding = encoding.trim();
		this.bufferedReaderSize = bufferedReaderSize;
	}

	public ResourceInfo(Class<?> hookClazz, String nonQualifiedResourceName, String encoding) {
		this(hookClazz, nonQualifiedResourceName, encoding, DEFAULT_BUFFERED_READER_SIZE);
	}

	public ResourceInfo(Class<?> hookClazz, String nonQualifiedResourceName, String encoding, int bufferedReaderSize) {
		this(ResourceHelpJava.fullyQualifyResourceName(hookClazz, nonQualifiedResourceName), encoding, bufferedReaderSize);
	}

	public ResourceInfo(Package packijj, String nonQualifiedResourceName, String encoding) {
		this(packijj, nonQualifiedResourceName, encoding, DEFAULT_BUFFERED_READER_SIZE);
	}

	public ResourceInfo(Package packijj, String nonQualifiedResourceName, String encoding, int bufferedReaderSize) {
		this(ResourceHelpJava.fullyQualifyResourceName(packijj, nonQualifiedResourceName), encoding, bufferedReaderSize);
	}
}
