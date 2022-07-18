read -p "enter a string" str

#show each char of the string on new line

num=`echo "$str" | wc -c`
len=$(($num-1))

for (( i=1;i<=len;i++))
do
  ch=`echo "$str" | cut -c $i`
  echo "$ch"
done

#Print the reverse
revstr=""
for (( i=len;i>=1;i--))
do
  ch=`echo "$str" | cut -c $i`
  revstr=$revstr$ch
done
echo "reverse = $revstr"


#print half string in uppercase and half in lowercase





