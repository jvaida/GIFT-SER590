#!/bin/bash

AbsBaseDir="/mil"

# Validate that no spaces are in the path
if [[ "${AbsBaseDir}" = *" "* ]]; then
    echo
    echo "ERROR: The GIFT path '${AbsBaseDir}' contains spaces, which may cause issues with third-party dependencies."
    echo
    exit 1
fi

# Setup JAVA_HOME
JAVA_HOME="/mil/external/jdk-11"
jdkDir="${AbsBaseDir}/external/jdk-11"
jdkDirArchive="${AbsBaseDir}/external/openjdk-11-linux.x64.GIFT.tar.gz"
JAVA_HOME="${jdkDir}"

#Check if the JDK has been extracted
if ! [ -d "${jdkDir}" ] ; then

    if ! [ -f "${jdkDirArchive}" ] ; then
    
        echo "ERROR: Unable to find ${jdkDirArchive}."
	echo "Do you have the GIFT third parties in the ${AbsBaseDir}/external folder?"
	
	exit 1
    fi
    
    cd ${AbsBaseDir}/external
    tar -xvzf ${jdkDirArchive}
    cd "$parent_path"
else
    echo "Found JDK at ${JAVA_HOME}"
fi

export JAVA_HOME

# Setup ANT_HOME
ANT_HOME="/mil/external/ant"
export ANT_HOME
export PATH="${JAVA_HOME}/bin:${ANT_HOME}/bin:${PATH}"

# Verify Ant Installation
echo "Verifying Ant installation at ${ANT_HOME}"
ant -version
if [ $? -ne 0 ]; then
    echo "Failed to verify Ant installation at ${ANT_HOME}"
    exit 1
fi


if [ -d "/mil" ]; then 
    echo "/mil";
fi

if [ -f "/mil/arl/gift/gateway/GatewayModule.class" ]; then 
    echo "gateway module class founddd";
fi

# Now use $1 and $2 to dynamically accept arguments from CMD
echo "Launching the GIFT $2 module with arguments $1 $2..."
ant -f /mil/launch/launchProcess.xml $1 $2

ERROR_CODE=$?
if [ ${ERROR_CODE} != 0 ]; then
    echo "An error occurred while launching the GIFT module with arguments $1 $2. Exiting with error code ${ERROR_CODE}."
    exit ${ERROR_CODE}
fi

# Keep the container running
echo "GIFT $2 module launched successfully with arguments $1 $2. Container will keep running."
tail -f /dev/null  # Prevent the container from exiting