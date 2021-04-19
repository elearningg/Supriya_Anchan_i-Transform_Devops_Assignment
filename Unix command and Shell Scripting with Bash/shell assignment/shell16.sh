#!/bin/bash

i=1
while read line
do
echo "this is line no $i : $line"
let i=i+1
done < heros.txt
#spiderman
#superman
#batman