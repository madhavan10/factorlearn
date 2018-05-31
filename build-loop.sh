#!/bin/sh
while [ 1 ]; do inotifywait -e MODIFY $(find . -name "*.java"); javac *.java; done
