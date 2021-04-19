#!/usr/bin/env bash
#Write a script that takes a single command line parameter intended to be the user's first name. Prompt the user for their age and read that into a variable. Using the appropriate method to make that command line parameter visible to a function, pass the age captured to the function and display a message to the user addressing them by name and confirming their age, add a calculation of their age in number of days.
 
echo "enter your age"
read age

prompt () {
local message="Hey $1 your age is $age and your are $(($age * 365 )) days old"
echo $message
}

msg=$(prompt $1)
echo "$msg"