
read -p "enter folder path" folder

echo "the number of contents in the folder are - "
ls $folder | wc -w
