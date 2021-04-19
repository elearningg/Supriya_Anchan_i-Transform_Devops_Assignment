#!/bin/bash

echo "This are the items in the menu, please select any one"

echo "1. Chocolate candy"
echo "2. Vanilla milkshake"
echo "3. Icecream"

read -p "What would you like to have" choice

case $choice in 
    "1")echo "Your Chocolate candy would be right with you"
    ;;
    "2")echo "Your Vanilla milkshake would be right with you"
    ;;
    "3")echo "Your Icecream would be right with you"
    ;;
