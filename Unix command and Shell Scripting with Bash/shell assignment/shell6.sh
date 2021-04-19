#!/bin/bash

first=1
second=2
third=3

#Add two numbers
sum=$(($first + $second))
echo "Sum of first two numbers is" $sum

#Add two numbers and multiply by third
Multiple=$(($sum * $third))
echo "Sum of two numbers and multiplying with the third ans is" $Multiple

grp= expr $first + $second \* $third
echo $grp
