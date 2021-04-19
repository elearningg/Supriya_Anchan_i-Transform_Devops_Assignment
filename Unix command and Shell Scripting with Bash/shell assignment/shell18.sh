#!/bin/bash
echo "Enter filename"
read filename
if [[ -f "$filename" ]]
then 
while IFS= read -r line 
do
echo "$line"
done < $filename
else
echo "$filename doesn't exist"
fi 
egrep "CPU|Memory|Disk" sample.txt
CPU
Memory
Disk Space
