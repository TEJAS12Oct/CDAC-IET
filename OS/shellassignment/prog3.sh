

echo "Enter file name: "
read fname
echo "1.Date 2.Copy 3.List directory content 4.Quit"

read choice

case $choice in
"1")echo `"$fname" | ls -l` ;;
"2")echo `"$fname" | cp data.sh` ;;
"3")echo `"$fname" | ls` ;;
"4")echo "Quit" ;;
esac
