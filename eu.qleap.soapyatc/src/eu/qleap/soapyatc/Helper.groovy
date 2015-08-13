package eu.qleap.soapyatc

import static name.heavycarbon.checks.BasicChecks.cannotHappen;

import java.security.KeyStore

import javax.net.ssl.HostnameVerifier
import javax.net.ssl.HttpsURLConnection
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSession

import name.heavycarbon.carpetbag.ResourceHelpGroovy

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Code moved from the main class
 *
 * 2015.08.11 - First run
 ******************************************************************************/

class Helper {

	static File KEYSTORE_FILE = new File("/usr/local/java/infrastructure/jdk1.8.0_51/jre/lib/security/cacerts")
	static String KEYSTORE_PW = "changeit" // this is the default pw of the Java keystore

	private Helper() {
		cannotHappen("Class cannot be instantiated");
	}
	
	static void disableHostnameVerifier() {
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				})
	}

	static void setupSslContext() {
		SSLContext sc = SSLContext.getInstance("TLS");
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		KeyStore ks = KeyStore.getInstance("JKS");
		def stream = ResourceHelpGroovy.getStreamFromFile(KEYSTORE_FILE)
		def password = KEYSTORE_PW
		ks.load(stream,password.toCharArray());
		kmf.init(ks, password.toCharArray());
		sc.init(kmf.getKeyManagers(), null, null);
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	}

}
