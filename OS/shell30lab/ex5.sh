 
echo "Enter two numbers"
read num1 num2
echo "Enter choice for operation: 1.add 2.subtract 3.multiply 4.divide"
read choice

if [ $choice = 1 ]
then 
     echo "Addition is $(($num1+$num2))" 
elif [ $choice = 2 ]
then
     echo "Subtraction is $(($num1-$num2))"
elif [ $choice = 3 ]  
then
     echo "Multiplication is $(($num1* num2))"
elif [ $choice =  4 ]
then
     echo "Division is $(($num1/$num2))"
else
     echo "Invalid choice"

fi 



