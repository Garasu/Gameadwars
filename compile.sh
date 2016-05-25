#!/bin/bash

javac src/game/Main.java &&

jar -cfm Gameadwars.jar manifest.mf src/Spielfeld/*.class src/controller/*.class src/game/*.class src/window/*.class &&

rm src/Spielfeld/*.class
rm src/game/*.class
rm src/window/*.class
# rm src/controller/*.class
