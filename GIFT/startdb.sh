#!/bin/bash

# Define a function to check if Derby server starts successfully
function check_derby_server() {
    echo "Checking if Derby server is up..."

    if timeout 5 bash -c "cat < /dev/null > /dev/tcp/localhost/1527"; then
        echo "Derby server is up and running."
    else
        echo "Derby server failed to start."
        exit 1
    fi
}

# Set the environment variables needed by the Derby start script
export DERBY_HOME="/app/external/db-derby-10.15.2.0-bin"
export DERBY_LIB="$DERBY_HOME/lib"

# Start the Derby server using the command extracted from the original script
echo "Starting Derby server..."
exec "$JAVA_HOME/bin/java" -Djava.security.manager -Djava.security.policy="/app/derby.policy" $DERBY_OPTS "-Dderby.system.home=$DERBY_HOME/../../data" -Dderby.storage.useDefaultFilePermissions=true -classpath "$CLASSPATH" org.apache.derby.drda.NetworkServerControl start &

# Wait a bit to ensure Derby starts up (adjust sleep time as necessary)
sleep 10

# Check if Derby server started successfully
check_derby_server

# Start your Java application
echo "Starting UMSModule..."
java $JAVA_OPTS -cp $CLASSPATH mil.arl.gift.ums.UMSModule


if [ $? -ne 0 ]; then
    echo "UMSModule failed to start."
    exit 1
else
    echo "UMSModule is running."
fi
