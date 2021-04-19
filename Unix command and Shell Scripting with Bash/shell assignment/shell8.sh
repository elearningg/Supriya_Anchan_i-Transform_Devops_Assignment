#!/bin/bash

read -p "YourName?:" name
read -p "LastName?:" lname
read -p "AGE?:" age

echo "Greetings $name $lname" 

fage=$(($age+10))
echo "your age in 10 yrs would be" $fage
