
echo "Enter a string"
read str

echo "Give your choice 1.show string in uppercase 2.show string in lowercase 3.show as it is"
read choice

if [ $choice == 1 ]
then 
  echo "$str" | tr "[a-z]" "[A-Z]"
elif [ $choice == 2 ]
then 
   echo "$str" | tr [A-Z] [a-z]
elif [ $choice == 3 ]
then 
     echo "$str"
else
      echo "Invalid choice"
fi
