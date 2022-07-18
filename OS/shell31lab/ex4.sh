
read -p "enter a name" str

echo "$str" >> name.data  

cat name.data

echo "Enter sorting choice: 1.Ascending 2.Descending"
read choice

if [ $choice == 1 ]
then 
   echo `sort name.data`
elif [ $choice == 2 ]
then
  echo `sort -r name.data` 
else
  echo "Invalid choice"
fi 

 
