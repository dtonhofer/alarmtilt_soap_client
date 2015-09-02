package eu.qleap.soapyatc

import static name.heavycarbon.checks.BasicChecks.*

import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName

import name.heavycarbon.utils.ResourceHelpGroovy

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.bridge.SLF4JBridgeHandler

import uk.org.lidalia.sysoutslf4j.context.SysOutOverSLF4J
import v3.res.soap.webservice.alarmtilt.com.AlarmTILTRestrictedWebService
import v3.res.soap.webservice.alarmtilt.com.AuthParam
import v3.res.soap.webservice.alarmtilt.com.AuthType
import v3.res.soap.webservice.alarmtilt.com.LaunchProcedureParam
import v3.res.soap.webservice.alarmtilt.com.LaunchProcedureResult
import v3.res.soap.webservice.alarmtilt.com.LaunchProcedureResultEnum
import v3.res.soap.webservice.alarmtilt.com.PingServiceResult
import v3.res.soap.webservice.alarmtilt.com.PingServiceResultEnum
import v3.res.soap.webservice.alarmtilt.com.ProcedureVariable
import v3.res.soap.webservice.alarmtilt.com.WsResV3
import eu.qleap.soapyatc.argproc.ArgsProcessor
import eu.qleap.soapyatc.argproc.CaseFile
import eu.qleap.soapyatc.argproc.Value
import eu.qleap.soapyatc.config.ConfigInfo
import eu.qleap.soapyatc.config.Credentials
import eu.qleap.soapyatc.elements.AtpMap
import eu.qleap.soapyatc.elements.AtpName
import eu.qleap.soapyatc.elements.AtwsMap
import eu.qleap.soapyatc.elements.AtwsName

/* 34567890123456789012345678901234567890123456789012345678901234567890123456789
 *******************************************************************************
 * Collect the argument processing tediousness to get it out of Call
 ******************************************************************************/

class ArgumentProcessing {

	private static final String CLASS = ArgumentProcessing.class.name
	private static final Logger LOGGER_processArgs            = LoggerFactory.getLogger("${CLASS}.processArgs")
	private static final Logger LOGGER_alignConfigsByPriority = LoggerFactory.getLogger("${CLASS}.alignConfigByPriority")
	private static final Logger LOGGER_readConfigs            = LoggerFactory.getLogger("${CLASS}.readConfigs")
	private static final Logger LOGGER_mergeConfigs           = LoggerFactory.getLogger("${CLASS}.mergeConfigs")

	/**
	 * The default config is checked but it doesn't exist on the classpath to avoid confusion
	 */

	static final String DEFAULT_CONFIG = '^' + ResourceHelpGroovy.fullyQualifyResourceName(Call.class,'default_config.txt')

	enum TagA {
		result, msgs, tailvalues
	}

	private ArgumentProcessing() {
		cannotHappen("Do not instantiate ${ArgumentProcessing.class.getName()}")
	}

	/**
	 * Generate help text for the command line
	 */

	private static List generateHelpText() {
		// 34567890123456789012345678901234567890123456789012345678901234567890123456789
		List res = []
		res << "--config=CONFIG        : Read configuration from CONFIG. CONFIG can be:"
		res << ""
		res << "                         1) Absolute pathname to a file. CONFIG must"
		res << "                            start with '/' or '\\' or a DOS-style drive"
		res << "                            letter (A:\\)"
		res << "                         2) Resource on classpath. CONFIG must start"
		res << "                            with the caret '^'"
		res << "                         3) Relative patname of a file (relative to the"
		res << "                            home directory of the current user) in all"
		res << "                            other cases"
		res << ""
		res << "                         If not given the (possibly nonexistent) default"
		res << ""
		res << "                         ${DEFAULT_CONFIG}"
		res << ""
		res << "                         is assumed. It's a resource on the classpath."
		res << ""
		res << "                         Several --config may be given. Values found"
		res << "                         in later ones override the values found in"
		res << "                         earlier ones."
		res << ""
		res << "                         If needed, specify character encoding of the"
		res << "                         file by appending the encoding after two ':',"
		res << "                         for example: 'foofile.cfg::UTF-8'."
		res << ""
		res << "--hostnameverify[=Y/N] : Switch HTTPS X.509 hostname verif on/off."
		res << "                         Default is Y (or ON or YES or TRUE/T or 1)."
		res << ""
		res << "--service=SERVICE      : Give name of the remote web service to call."
		res << "                         This is a case-insensitive identifier, not the"
		res << "                         actual service name (see below for list of"
		res << "                         known remote services; a special value that is"
		res << "                         not actually a remote service is 'ping10',"
		res << "                         which performs 10 calls to the 'ping' service)."
		res << ""
		res << "--procedure=PROCEDURE  : If the --service chosen is 'launch', give the"
		res << "                         name of the alerting procedure to launch."
		res << "                         This is a case-insensitive identifier, not the"
		res << "                         actual procedure name (see below for list)."
		res << ""
		res << "--creds=CREDS          : Use credentials string CREDS, which must be of"
		res << "                         the form USER::PASSWORD. Useful to override"
		res << "                         whatever is currently in the config file."
		res << ""
		res << "--case=NUM_CASE_ID     : The numeric id of the WinCC event for which an"
		res << "                         alerting procedure shall be launched."
		res << "                         This overrides 'service' and 'procedure'"
		res << "                         to predefined values!!"
		res << ""
		res << "--casefile=CASEFILE    : A file which contains the mapping between the"
		res << "                         values given for --case and the corresponding"
		res << "                         case-insensitive identifiers of the respective"
		res << "                         alerting procedures to launch."
		res << "                         Must be given if --case is being used."
		res << "                         Same features as for --config apply here."
		res << ""
		res << "--wsdlfile=WSDLFILE    : A file which contains the AlarmTILT WSDL XML."
		res << "                         This must be an actual file, resources are not"
		res << "                         (yet) permitted here."
		res << ""
		res << "                         If this is used, the client will NOT download"
		res << "                         the WSDL file from the AlarmTILT server before"
		res << "                         emitting its webservice request. This is"
		res << "                         probably what you want."
		res << "                         The URLs embedded in the WSDL XML will be used"
		res << "                         to set the location of the AlarmTILT web"
		res << "                         service"
		res << ""
		res << "--url=URL              : An URL pointing to the remote AlarmTILT WSDL"
		res << "                         resource. This should point to the actual"
		res << "                         AlarmTILT server, not to some file on-disk."
		res << ""
		res << "                         Only considered if --wsdlfile is NOT given."
		res << ""
		res << "                         You may give two --url: one for 'http' scheme,"
		res << "                         one for 'https' scheme."
		res << ""
		res << "                         The client will contact the AlarmTILT server"
		res << "                         and download the AlarmTILT WSDL XML using the"
		res << "                         given URL before emitting its webservice request,"
		res << "                         which may mean excessive traffic."
		res << ""
		res << "--secure[=Y/N]         : Select https scheme. If the https scheme is"
		res << "                         not given via either --wsdlfile or --url, fail."
		res << "                         Default is Y (or ON or YES or TRUE/T or 1)."
		res << ""
		res << "                         In case --wsdlfile is used, the URL found under"
		res << "                         service '${Call.SERVICE_NAME_HTTPS.localPart}'"
		res << "                         in the WSDL file is used. The corresponding"
		res << "                         URL for unsecured connection is found under"
		res << "                         service '${Call.SERVICE_NAME_HTTP.localPart}'."
		res << ""
		res << "                         In case --url is used, the URL set up with the"
		res << "                         https scheme is chosen."
		res << ""
		res << "Known --service names are:"
		res << "\n"
		res.addAll(AtwsMap.printOut())
		res << "\n"
		res << "Known --procedure names are:"
		res << "\n"
		res.addAll(AtpMap.printOut())
		return res
	}

	static Map makeArgResult(String[] args) {
		Map  argResult
		List pargsMsgs,tailValues
		PROCESS_ARGS: {
			Map res     = processArgs(args)
			argResult   = res[TagA.result]
			pargsMsgs   = res[TagA.msgs] // no fatal messages
			tailValues  = res[TagA.tailvalues] // some values not associated to options
			assert argResult  != null
			assert pargsMsgs  != null
			assert tailValues != null
		}
		//
		// tail values containing only whitespace are skipped (because the calling bash script may generate those)
		//
		tailValues = tailValues.findAll { Value it -> !it.txt.trim().isEmpty() }
		//
		// If help demanded print and exit
		//
		if (argResult[ArgsProcessor.OPTION_HELP]) {
			generateHelpText().each {
				System.err.println(it)
			}
			System.err.flush()
			System.exit(0)
		}
		//
		// If problem with arguments, throw; processArgs() has already printed error values.
		//
		checkTrue(tailValues.isEmpty(),"Unhandled tail arguments")
		checkTrue(pargsMsgs.isEmpty(),"Some errors encountered during argument handling: ${pargsMsgs.join(',')}")
		return argResult
	}

	private static Map processArgs(String[] args) {
		Logger logger = LOGGER_processArgs
		List msgs = []
		Map mm          = ArgsProcessor.process(args, msgs)
		Map result      = mm[ArgsProcessor.tag_result]
		List tailValues = mm[ArgsProcessor.tag_tailvalues]
		assert result != null
		assert tailValues != null
		//
		// If there is anything in "msgs" or "tail values", caller will exit!
		//
		if (msgs) {
			msgs.each { logger.error("Message from cmdline arg processing: ${it}") }
		}
		if (tailValues) {
			tailValues.each { logger.error("Unused tail value in arguments: '${it.txt}'") }
		}
		if (logger.isDebugEnabled()) {
			result.each { k, v -> logger.debug("Command line argument: ${k} --> ${v}") }
			tailValues.each { logger.debug("Command line tail value: '${it.txt}'") }
		}
		return [ (TagA.result) : result, (TagA.msgs) : msgs, (TagA.tailvalues) : tailValues ]
	}

	static List alignConfigsByPriority(Map argResult) {
		Logger logger = LOGGER_alignConfigsByPriority
		//
		// Read configuration by priority
		//
		List readThese = [DEFAULT_CONFIG]
		if (argResult[ArgsProcessor.OPTION_CONFIG]) {
			readThese.addAll(argResult[ArgsProcessor.OPTION_CONFIG])
		}
		if (logger.isDebugEnabled()) {
			logger.debug("The following configuration will be read in order: ${readThese}")
		}
		//
		// Align ConfigInfo instances by priority
		// 1) Default from the empty constructor
		// 2) Those read in, in order
		// 3) The one built from the command line arguments
		//
		List configList = [new ConfigInfo()]
		configList.addAll(readConfigs(readThese))
		configList << new
				ConfigInfo(
				argResult[ArgsProcessor.OPTION_URL],
				argResult[ArgsProcessor.OPTION_SECURE],
				argResult[ArgsProcessor.OPTION_HNV],
				argResult[ArgsProcessor.OPTION_SERVICE],
				argResult[ArgsProcessor.OPTION_PROCEDURE],
				argResult[ArgsProcessor.OPTION_CREDS],
				argResult[ArgsProcessor.OPTION_CASEID],
				argResult[ArgsProcessor.OPTION_CASEFILE],
				argResult[ArgsProcessor.OPTION_WSDLFILE])
		if (logger.isDebugEnabled()) {
			configList.eachWithIndex { ConfigInfo ci, int idx -> logger.debug("ConfigInfo ${idx}\n${ci.toString(2)}") }
		}
		return configList
	}

	private static List readConfigs(List configNames) {
		Logger logger = LOGGER_readConfigs
		checkNotNull(configNames, 'configNames')
		final boolean lenient = true
		List res = []
		configNames.each { String what ->
			try {
				List msgs = []
				res << new ConfigInfo(what, msgs, lenient)
				msgs.each {
					logger.warn("${it}")
				}
			}
			catch (Exception exe) {
				// do not print the whole stacktrace, just warn....
				logger.warn("Failure reading config '${what}'.\n${exe.message}")
			}
		}
		return res
	}

	private static ConfigInfo mergeConfigs(List configList) {
		Logger logger = LOGGER_mergeConfigs
		checkNotNullAndNotEmpty(configList,'configList')
		ConfigInfo current = configList[0]
		for (int i=1; i< configList.size(); i++) {
			ConfigInfo highPrio = configList[i]
			current = new ConfigInfo(highPrio, current)
		}
		if (logger.isDebugEnabled()) {
			logger.debug("Resulting merged configuration:\n${current.toString(2)}")
		}
		return current
	}
}
