#!/bin/bash

# Install netcat if it's not already available
if ! which nc > /dev/null; then
    apt-get update
    apt-get install -y netcat
fi

# Check if ActiveMQ is ready
nc -zv localhost 61616
