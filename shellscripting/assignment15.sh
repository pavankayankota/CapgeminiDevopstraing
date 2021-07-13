#! /usr/bin/bash

echo " enter the number of times to display the message"
read num
COUNT=1
while [ $COUNT -le $num ]
do

echo "pavankalyan -$COUNT"
  (( COUNT++ ))
  done