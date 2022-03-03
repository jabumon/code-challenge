#!/bin/bash

if [ "$#" -ne 3 ]; then
  echo "Illegal number of parameters"
  echo "Usage is: ./fraction.sh [fraction1] [operation: + - x /] [fraction2]"
  exit 0
fi

java -jar target/code-challenge-0.0.1.jar "$1" "$2" "$3"
