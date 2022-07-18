read -p "Enter a string" str

num=`echo "$str" | wc -c`

num=$(($num-1))

echo "the length of $str is $num"
