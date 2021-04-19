#!/bin/bash






LIST=$(ls *.sh)

for i in $LIST
do



itr=$( cat $i )
echo " THE CONTENT OF $i are:"
echo $itr
done 
