 
echo "Enter the path and folder name to delete"

read path fname


rm -r $path/$fname 


echo "check content after removing $fname"

ls
