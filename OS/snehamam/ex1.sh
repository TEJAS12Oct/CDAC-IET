echo "Enter a Character: "
read char

ch=$(echo $char | tr "[a-z]" "[A-Z]")
echo "$ch"
if [ $ch = 'A' -o $ch = 'E' -o $ch = 'I' -o $ch = 'o' -o $ch = 'U' ]
then
     echo "Vowel"
else
     echo "Consonent"
fi 

