#! /usr/bin/bash

echo "List all the shell scripts contents of the directory"
SHELLSCRIPTS='ls *.sh'
for SCRIPT in $SHELLSCRIPTS; do
view= cat $SCRIPT
echo "File: $SCRIPT - Contents $view"
done
