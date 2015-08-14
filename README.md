# alarmtilt_soap_client
Framework code for the AlarmTILT SOAP Client

For now performs only the "ping" and "launch" web service calls.

License: [MIT License](http://opensource.org/licenses/MIT)

Deployment should really be done using a Gradle or Maven build file, but for now, manual work is required:

![Deployment organization](https://github.com/Q-LEAP/alarmtilt_soap_client/blob/master/doc/Organization.yed.png)

## Notes

+ Runs on Oracle JDK 8 (u51), and uses Groovy 2.4.
+ Is invoked from WinCC via an ANSI C script, but you can also run it from the command line, for example:

```
java.exe 
   -Dlogback.configurationFile=D:\Global\alarmtilt\logback.xml
   -Dcom.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump=true
   -Dcom.sun.xml.internal.ws.transport.http.HttpAdapter.dump=true
   -cp D:\Global\alarmtilt\lib\*
   eu.qleap.soapyatc.Call
   --config D:\Global\alarmtilt\myconfig.txt
   --casefile D:\Global\alarmtilt\casefile.txt
   --case 0
```

+ Definitely consult what `--help` says:

```
--config=CONFIG        : Read configuration from CONFIG. CONFIG can be:
                         - Absolute pathname to a file. CONFIG must
                           start with '/' or '\' or a DOS-style drive
                           letter (A:\),
                         - Resource on the classpath. CONFIG must start
                           with the caret '^',
                         - Relative patname of a file (relative to the
                           home directory of the current user) in all
                           other cases,
                         - If not given, uses ^eu/qleap/soapyatc/default_config.txt.
                         Several 'config' may be given. Later ones
                         override earlier ones (useful for having
                         credentials in separate files for example)
                         If needed, specify encoding of the config file
                         by appending '::UTF-8' for example
--url=URL              : An URL to the WSDL resource
                         You may give two: one for the 'http' scheme,
                         one for the 'https' scheme.
--secure[=Y/N]         : Preferentially select 'https' scheme if
                         available. Default is YES.
--hostnameverify[=Y/N] : Switch SSL hostname verification on/off.
                         Default is YES.
--service=SERVICE      : Give name of the remote web service to call.
                         This is a case-insensitive string id, not the
                         actual service name.
--procedure=PROCEDURE  : If the 'service' chosen is 'launch', give the
                         name of the AlarmTILT alerting procedure to
                         launch.
                         This is a case-insensitive string id, not the
                         actual procedure name.
--creds=CREDS          : Use credentials string CRED, which must be of
                         the form 'USER::PASSWORD'
--case=NUMERIC_CASE_ID : The numeric id from WinCC is passed in.
                         Giving this overrides 'service' and 'procedure'
                         to predefined values.
--casefile=CASEFILE    : Contains the mapping between NUMERIC_CASE_ID
                         and name of procedure to lauch. Must be given
                         if '--case' is used; same format as for CONFIG.
```

## TODO

+ The client downloads the whole WSDL at each activation. This is unnecessary and can be tuned by indicating to the service to get it as a resource instead.
+ There is no script to run the JUnit Runner. Would be nice.
+ Not all execution paths have been tested, for sure.
+ Needs to be further tested on Windows, but I expect not many surprises.
