echo "enter a number"
read num1

echo "enter another"
read num2

#expr $num1 + $num2

#we are writing the command in a statement
#use the command in back quotes
#z=`expr $num1 + $num2`

z=$(($num1 + $num2))

echo "z=$z"

product=`expr $num1 \* $num2`
echo "product = $product"


