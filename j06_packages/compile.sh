# compile.sh
# chmod +x compile.sh (this gives the file executable permission)
# to compile and run: ./compile.sh
mkdir -p bin
javac -d bin *.java **/*.java
java -cp bin Program
