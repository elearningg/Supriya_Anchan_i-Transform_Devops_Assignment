#!/bin/bash
echo "$((3 * (2 + 1)))"
echo $? # print exit status
date # run date command
rm assign.sh
echo $? # print exit status
((x = 4 * (3 + 1)))
echo "$x"
echo $? # print exit status 
