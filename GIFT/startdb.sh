#!/bin/bash
# Start the Derby server
java -Djava.security.manager= -jar /app/external/derby/derbyrun.jar server start

# Wait a bit to ensure Derby starts up (idk, may need to adjust sleep time)
sleep 5

# Start your Java application
java $JAVA_OPTS -cp $CLASSPATH mil.arl.gift.ums.UMSModule
