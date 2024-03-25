@ECHO OFF

REM This script will convert a protobuf binary log file to a human-readable JSON log.
REM The converted log will be put in output\converted

REM To use, navigate to output\domainSessions and locate the folder(s) that correspond to the domain session of the course.
REM Open the folder(s) and for each binary log file, drag and drop onto this script file or the shortcut script file provided in output\domainSessions.

REM If successful, the converted log will be placed in output\converted.
REM If unsuccessful, the script will inform that the conversion failed.

REM Reasons that the script can fail when launched include:
REM - dragging and dropping non-binary files into the converter
REM - not having the GIFT third parties in the external folder

set BaseDir=%~dp0..\..
set ExternalLibsDir=%BaseDir%\external
set BinDir=%BaseDir%\bin
set OutputDir=%BaseDir%\output\converted

set "JDK_64x_ZIP=%ExternalLibsDir%\openjdk-11.64x.GIFT.zip"
set "JDK_EXTRACT_TO=%ExternalLibsDir%\"
set JDK_64x_HOME=%ExternalLibsDir%\jdk-11

ECHO Checking for Java.

REM check for 64x JDK zip
if exist "%JDK_64x_ZIP%"  (
	set JDK64xZipExists=1
) else if exist "%JDK_64x_HOME%" (
	set JDK64xZipExists=1
) else (
	set JDK64xZipExists=0
)

REM set JDK variables according to which JDK bit version to use
if %JDK64xZipExists% == 1 (
	REM prioritize 64x JDK
	set JDK_HOME=%JDK_64x_HOME%
	set JDK_ZIP=%JDK_64x_ZIP%
)


REM Check for jdk 11 - the installer will not launch unless it is there.
if not exist "%JDK_HOME%" (

	if not exist "%JDK_ZIP%" (
	
		echo ERROR: Unable to find "%JDK_ZIP%".
		echo Do you have the GIFT third parties in the %JDK_EXTRACT_TO% folder?
		
		set ERRORLEVEL=1
		GOTO END
	)
	
	cscript "%JDK_ZIP%" "%JDK_EXTRACT_TO%"
				
	if %ERRORLEVEL% neq 0 (
		echo ERROR: There was a problem extracting %JDK_ZIP%.
		set ERRORLEVEL=1
		GOTO END
	)
	
	if not exist "%JDK_HOME%" (
		echo ERROR: There was a problem extracting %JDK_ZIP% because the folder %JDK_HOME% doesn't exist.
		GOTO END
	)
)

ECHO Use Java at %JDK_HOME%.

set Class="mil.arl.gift.common.logger.ProtobufMessageLogReader"
set ClasspathExtension="%BinDir%\gift-common.jar;%BinDir%\jaxb_generated.jar;%BinDir%\protobuf_generated.jar"

set JavaClasspath="%ExternalLibsDir%\slf4j\*;%ExternalLibsDir%\commons-lang-2.4.jar;%ExternalLibsDir%\commons-cli-1.2.jar;%ExternalLibsDir%\gson-2.3.1.jar;%ExternalLibsDir%\protobuf\bin\protobuf-java-3.7.0.jar;%ExternalLibsDir%\protobuf\bin\protobuf-java-util-3.7.0.jar;%ExternalLibsDir%\vecmath.jar;%ExternalLibsDir%\commons-io-2.3.jar;%BinDir%\gift-common.jar;%BinDir%\jaxb_generated.jar;%BinDir%\protobuf_generated.jar;%ExternalLibsDir%\jsonsimple\json_simple-1.1.jar;%ExternalLibsDir%\jdk-11\jaxb-ri\mod\*;"

if not exist "%OutputDir%" (
	ECHO Creating directory to place output file at %OutputDir%.
    mkdir "%OutputDir%"
)

ECHO Running conversion...

cd "%BaseDir%"
"%JDK_HOME%\bin\java" -classpath %JavaClasspath%;%ClasspathExtension% %Class% "%~1" "%OutputDir%" && (
  echo Done.
) || (
  echo Conversion failed. Please make sure that you drag one or more protobuf binary logs into the script and try again.
)

:END
pause