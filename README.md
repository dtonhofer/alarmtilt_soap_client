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
   --case 1
```

The invocation in the running setup is a multistep process:

![Invocation](https://github.com/Q-LEAP/alarmtilt_soap_client/blob/master/doc/AlarmTILT_principle.yed.png)

+ Consult what `--help` says:

```
--config=CONFIG        : Read configuration from CONFIG. CONFIG can be:

                         1) Absolute pathname to a file. CONFIG must
                            start with '/' or '\' or a DOS-style drive
                            letter (A:\)
                         2) Resource on classpath. CONFIG must start
                            with the caret '^'
                         3) Relative patname of a file (relative to the
                            home directory of the current user) in all
                            other cases

                         If not given the (possibly nonexistent) default

                         ^eu/qleap/soapyatc/default_config.txt

                         is assumed. It's a resource on the classpath.

                         Several --config may be given. Values found
                         in later ones override the values found in
                         earlier ones.

                         If needed, specify character encoding of the
                         file by appending the encoding after two ':',
                         for example: 'foofile.cfg::UTF-8'.

--hostnameverify[=Y/N] : Switch HTTPS X.509 hostname verif on/off.
                         Default is Y (or ON or YES or TRUE/T or 1).

--service=SERVICE      : Give name of the remote web service to call.
                         This is a case-insensitive identifier, not the
                         actual service name (see below for list of
                         known remote services)

--procedure=PROCEDURE  : If the --service chosen is 'launch', give the
                         name of the alerting procedure to launch.
                         This is a case-insensitive identifier, not the
                         actual procedure name (see below for list).

--creds=CREDS          : Use credentials string CREDS, which must be of
                         the form USER::PASSWORD. Useful to override
                         whatever is currently in the config file.

--case=NUM_CASE_ID     : The numeric id of the WinCC event for which an
                         alerting procedure shall be launched.
                         This overrides 'service' and 'procedure'
                         to predefined values!!

--casefile=CASEFILE    : A file which contains the mapping between the
                         values given for --case and the corresponding
                         case-insensitive identifiers of the respective
                         alerting procedures to launch.
                         Must be given if --case is being used.
                         Same features as for --config apply here.

--wsdlfile=WSDLFILE    : A file which contains the AlarmTILT WSDL XML.
                         This must be an actual file, resources are not
                         (yet) permitted here.

                         If this is used, the client will NOT download
                         the WSDL file from the AlarmTILT server before
                         emitting its webservice request. This is
                         probably what you want.
                         The URLs embedded in the WSDL XML will be used
                         to set the location of the AlarmTILT web
                         service

--url=URL              : An URL pointing to the remote AlarmTILT WSDL
                         resource. This should point to the actual
                         AlarmTILT server, not to some file on-disk.

                         Only considered if --wsdlfile is NOT given.

                         You may give two --url: one for 'http' scheme,
                         one for 'https' scheme.

                         The client will contact the AlarmTILT server
                         and download the AlarmTILT WSDL XML using the
                         given URL before emitting its webservice request,
                         which may mean excessive traffic.

--secure[=Y/N]         : Select https scheme. If the https scheme is
                         not given via either --wsdlfile or --url, fail.
                         Default is Y (or ON or YES or TRUE/T or 1).

                         In case --wsdlfile is used, the URL found under
                         service 'ws-res-v3-secured'
                         in the WSDL file is used. The corresponding
                         URL for unsecured connection is found under
                         service 'ws-res-v3'.

                         In case --url is used, the URL set up with the
                         https scheme is chosen.

```

## TODO

+ There is no script to run the JUnit Runner. Would be nice.
+ Not all execution paths have been tested, for sure.
+ Needs to be further tested on Windows, but I expect not many surprises.
