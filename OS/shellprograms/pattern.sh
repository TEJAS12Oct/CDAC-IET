
echo "Enter the number" 
read num
 
i=1
while [ $i -le $num ]
 
do
       j=1
     while [ $j -le $i ]
do
     echo -n "$i"

     j=$(($j+1))
done
     echo
      i=$(($i+1))
done
 
