 

echo "Enter a choice: 1)DATE 2)COPY 3)List of directory content 4)Quit "
read choice

case $choice in
1) echo "1/04/2022";;
2) echo "enter file/folder name with path to copy"
   read copy
   echo "enter new file name with address to paste" 
   read paste 
   cp $copy$paste;;
3) ls;;
4) echo;;
esac 
