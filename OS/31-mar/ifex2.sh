echo "enter a number"
read num

if [ $num -gt 100 ]
then
    echo "$num is greater than 100"
else
   echo "$num may be less or equal to 100 "
fi
