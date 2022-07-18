
echo "enter the path and the folder name separated by space"
read path fname

mkdir $path/$fname

echo "Please whether the $fname folder is created "
ls $path
