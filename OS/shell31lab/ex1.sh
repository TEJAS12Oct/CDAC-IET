
read -p "Enter a string " str

num=`echo "$str" | wc -c` 

num=$(($num-1))

echo "The length of $str is $num "
 
