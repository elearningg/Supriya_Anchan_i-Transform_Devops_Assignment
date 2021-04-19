#!/usr/bin/env bash
#Create a script to demonstrate the visibility of variables and when they are available within a script and its functions. Define a global variable, a function that defines a local variable and then display both BEFORE calling the function, call the function, then display both AFTER calling the function.

var1=1
var2=2
test() {
local var1=3
var2=4
echo "$var1,$var2"
}

echo "$var1,$var2"
test
echo "$var1,$var2"
