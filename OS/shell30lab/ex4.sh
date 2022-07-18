
echo "Enter a country  name"
read name

if [ ${name^^} == "INDIAN" ] 
then 
     echo "You are Indian"
else
     echo "You are foreigner"
fi
 
