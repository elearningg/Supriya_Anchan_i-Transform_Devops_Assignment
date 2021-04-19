#!/bin/bash






read -p "Enter a number between 1 and 3:" num 
if [[ 0 -lt $num ]]; then



if [[ $num -lt 4 ]]; then 
echo "success"

else
echo "between 1 and 3 goodbyee" 
echo $num > /dev/null
fi
fi 
