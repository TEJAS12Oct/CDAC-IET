
read -p "enter a number: " num

i=1
until [ $i -gt $num ]
do
    j=1
    until [ $j -gt $i ]
    do
       echo -n "$i"
       j=$(( $j+1 ))
    done
    echo
    i=$(( $i+1 ))
done 
