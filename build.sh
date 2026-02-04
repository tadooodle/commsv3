#!/bin/bash

echo "======================================="
echo "Hide Commands Mod - Build Script"
echo "======================================="
echo ""

echo "Checking Java version..."
java -version
echo ""

echo "Building mod..."
./gradlew clean build

if [ $? -eq 0 ]; then
    echo ""
    echo "======================================="
    echo "Build successful!"
    echo "======================================="
    echo ""
    echo "Die fertige .jar Datei findest du in:"
    echo "build/libs/hidecommands-1.0.0.jar"
    echo ""
    echo "Kopiere diese Datei in deinen .minecraft/mods/ Ordner"
    echo ""
else
    echo ""
    echo "======================================="
    echo "Build fehlgeschlagen!"
    echo "======================================="
    echo "Überprüfe die Fehlermeldungen oben."
fi
