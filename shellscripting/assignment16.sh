#! /usr/bin/bash
echo "enter file name :"
read file
 while read -r superhero; do
 echo" superhero name : $superhero"
 done < "$file"