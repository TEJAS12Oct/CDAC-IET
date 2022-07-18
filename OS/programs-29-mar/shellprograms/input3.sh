echo "enter the folder name to delete"
read fname

rm -r $fname

echo "PLEASE CHECK THE CONTENT AFTER REMOVING $fname"
ls
