/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.net.api;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.MessageProducer;

import org.apache.activemq.ActiveMQMessageConsumer;
import org.apache.activemq.command.ActiveMQDestination;

/**
 * A client that connects to an ActiveMQ message queue.
 *
 * @author jleonard
 */
public class QueueMessageClient extends MessageClient {

    /**
     * Class constructor - set the connection URL to a specified value
     *
     * @param connectionUrl The URL of the message broker to connect to. If null
     *        the default will be used.
     * @param subjectName The name of the JMS subject to interact with
     * @param clearQueueOnStartup whether or not to clean the queue of any
     *        preexisting messages upon connecting to it.
     */
    public QueueMessageClient(String connectionUrl, String subjectName, boolean clearQueueOnStartup) {
        super(connectionUrl, subjectName, clearQueueOnStartup);
    }

    /**
     * Finalizes a connection to a queue.
     */
    @Override
    protected void completeConnection() throws JMSException {

        activeMQDestination = (ActiveMQDestination) getBrokerSession().createQueue(getSubjectName());

        MessageProducer brokerProducer = getBrokerSession().createProducer(activeMQDestination);
        brokerProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
        setMessageProducer(brokerProducer);

        if (isConsumer()) {

            ActiveMQMessageConsumer brokerConsumer = (ActiveMQMessageConsumer) getBrokerSession().createConsumer(activeMQDestination);
            setMessageConsumer(brokerConsumer);
        }
    }
}