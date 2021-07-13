#! /usr/bin/bash
echo "Enter a file to read :"
read file
exec 5<>$file
while read -r superhero; do
echo "superhero name : $superhero"
done <&5
echo "file was read on : 'date' ">&5
exec 5>&-