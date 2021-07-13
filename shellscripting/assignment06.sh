#! /usr/bin/bash
n1=2
n2=3
n3=4

echo $(expr $n1 + $n2 ) #5
echo $(expr $n1 + $n2 \* $n3 ) #14
echo $(expr \( $n1 + $n2 \) \* $n3) #20
