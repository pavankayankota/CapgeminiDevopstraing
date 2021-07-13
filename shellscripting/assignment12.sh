#! /usr/bin/bash

echo " enter a number between 1 and 3"
read value
if [ $value -eq 1 ] 2>/dev/null;
then
   echo "you entres 1"
   elif [ $value -eq 2 ] 2>/dev/null;
   then
   echo "you entered 2"
   elif [ $value -eq 3 ] 2>/dev/null;
   then
   echo "you entered 3"
   else
   echo "your are failed to follow the instructions"
   fi