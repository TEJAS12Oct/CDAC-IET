echo "enter a file name to show content "
read fn


if [ -e $fn ];then
 
if [ -f $fn ];then

echo "THE CONTENT IS ---------------"
cat $fn
fi

if [ -d $fn ];then
   echo " The folder has following content ---------"
   ls $fn
fi


fi

