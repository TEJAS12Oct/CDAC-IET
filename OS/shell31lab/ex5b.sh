
echo "Enter a number: "
read a

x=1
while [ $x -lt $(( $a+1 )) ]
do
     i=1
     while [ $i -lt $(( $x+1 )) ]
     do
        echo -n "$a"
        i=`expr $i + 1`
    done 
    echo 
    x=`expr $x + 1`
done
