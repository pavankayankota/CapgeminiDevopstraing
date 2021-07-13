#! /usr/bin/bash
SERVERLIST=("pavan" "kalyan" "kota" "sanju" )
COUNT=0
for INDEX in ${SERVERLIST[@]}; do
echo "server name : ${SERVERLIST[COUNT]}"
 (( COUNT++ ))
done