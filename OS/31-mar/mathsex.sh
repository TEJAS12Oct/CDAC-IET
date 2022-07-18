read -p "enter two numbers separated by space" x y
#epr (()) can be used for integer arithmetic, bc can be used for floating point arith

z=`echo "$x + $y" | bc`

echo "z=$z"
