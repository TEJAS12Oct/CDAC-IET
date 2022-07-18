read -p "Enter the name of file " file
read -p "Enter the string to be searched " str

echo `grep "$str" $file | wc -l`

echo `grep -v "$str" $file | wc -l`
