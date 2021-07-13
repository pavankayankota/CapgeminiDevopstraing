#! /usr/bin/bash
echo "enter file name"
read file
echo "enter the delimiter"
read deli
IFS="$delim"
while read -r c m d;do
echo "c : $c"
echo "m : $m"
echo "d : $d"
done <"$file"