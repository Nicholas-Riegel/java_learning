#!/bin/bash
# Create bin directory if it doesn't exist
mkdir -p bin

# Find all .java files in the root directory and subdirectories
java_files=$(find . -name "*.java")

# Compile all found .java files
javac -d bin $java_files

# Run the main program
java -cp bin Program
# java -cp bin Encapsulation
# java -cp bin StaticBlock
