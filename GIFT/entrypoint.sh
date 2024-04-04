#!/bin/bash

# Assuming the working directory is already set to /app in the Dockerfile
AbsBaseDir="/opt"  # Update this if your base directory is different

# Validate that no spaces are in the path
if [[ "${AbsBaseDir}" = *" "* ]]; then
    echo
    echo "ERROR: The GIFT path '${AbsBaseDir}' contains spaces, which may cause issues with third-party dependencies."
    echo
    exit 1
fi

# Setup JAVA_HOME
JAVA_HOME="/opt/external/jdk-11"  # Adjust this path if your Java installation is located elsewhere
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
ANT_HOME="/opt/external/ant"
export ANT_HOME
export PATH="${JAVA_HOME}/bin:${ANT_HOME}/bin:${PATH}"

# Verify Ant Installation
echo "Verifying Ant installation at ${ANT_HOME}"
ant -version
if [ $? -ne 0 ]; then
    echo "Failed to verify Ant installation at ${ANT_HOME}"
    exit 1
fi

# Proceed to launch the gateway module using Ant
echo "Launching the GIFT Gateway module..."
ant -f /app/launchProcess.xml start gateway

# Handle the script's exit based on Ant's execution result
ERROR_CODE=$?
if [ ${ERROR_CODE} != 0 ]; then
    echo "An error occurred while launching the GIFT Gateway module. Exiting with error code ${ERROR_CODE}."
    exit ${ERROR_CODE}
fi

# Keep the container running
echo "GIFT Gateway module launched successfully. Container will keep running."
tail -f /dev/null  # Prevent the container from exiting
