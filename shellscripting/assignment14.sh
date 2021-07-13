#! /usr/bin/bash

echo "MAIN MENU"

echo "1"
echo "2"
echo "3"
echo "enter choice"
read choice
 case $choice in
 1 )
 echo "good morning" ;;
 2 )
 echo "good afternoon" ;;
 3 )
 echo "good evening" ;;
 * )
 echo "u entered wrong input"
 esac