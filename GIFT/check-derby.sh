#!/bin/bash

# Install netcat if it's not already available
if ! which nc > /dev/null; then
    apt-get update
    apt-get install -y netcat
fi

# Check if derby server is ready
nc -zv -4 localhost 1527
