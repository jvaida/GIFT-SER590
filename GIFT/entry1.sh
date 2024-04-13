
#!/bin/bash

# Java command with classpath and system properties as specified
java \
-Djava.awt.headless=true \
-Dcom.sun.management.jmxremote.port=7004 \
-Dcom.sun.management.jmxremote.rmi.port=7004 \
-Dcom.sun.management.jmxremote.authenticate=false \
-Dcom.sun.management.jmxremote.ssl=false \
-Djava.rmi.server.hostname=localhost \
-Xmx1024m \
-Dgift.os.family="UNIX" \
-Xdebug \
-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=*:50004 \
-classpath "external/slf4j/*:external/*:external/activemq/activemq-all-5.18.3.jar:external/hibernate/*:external/jsonsimple/json_simple-1.1.jar:external/db-derby-10.15.2.0-bin/lib/derbyclient.jar:bin/gift-common.jar:external/rapidminer/lib/*:external/rapidminer/lib/plugins/rmx_weka-5.3.1.jar:external/apache-xmlrpc-3.1.3/lib/*:external/nuxeo/*:bin/jaxb_generated.jar:bin/protobuf_generated.jar:external/protobuf/bin/*:external/jdk-11/jaxb-ri/mod/*:external/zip4j-1.3.2/zip4j-1.3.2.jar:bin/json_generated.jar:external/emotiv/*:bin/gift-sensor.jar:external/jnect/*:external/jnect:external/vecmath.jar:external/jdk-11/jaxb-ri/mod/*" \
-Djava.library.path="external:external/emotiv:external/jnect" \
-Djava.io.tmpdir="/temp" \
mil.arl.gift.sensor.SensorModule