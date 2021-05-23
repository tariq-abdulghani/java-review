#!/bin/bash
javac -d dist src/abdulghani/tariq/Car.java

javac -d dist -cp ./src src/abdulghani/tariq/Main.java

java -cp ./dist abdulghani/tariq/Main