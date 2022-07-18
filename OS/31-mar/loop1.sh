#print numbers from 1 to 10
echo "USING TRADITIONAL FOR LOOP  ..."
for (( i=1;i<11;i++ ))
do
  echo "$i"
done

echo "USING WHILE LOOP ...."

x=1
while [ $x -lt 11 ];do
   echo "$x"
   #x=$(($x+1))
   x=`expr $x + 1`
done

echo "USING UNTIL  LOOP....."
y=1
until [ $y -gt 11 ]
do
   echo "$y"
   y=$(($y+1))
done

echo "USING  SHELL SCRIPTS FOR LOOP...."

#for d in 1 2 3 4 5 6 7 8 9 10
for d in {1..10}
do
  echo "$d"
done


for f in rose lily jasmine lotus zendu mogara jaswandi dhotra
do
  echo "$f"
done














