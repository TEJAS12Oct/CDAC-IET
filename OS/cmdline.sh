 
#command line argument  
# $ = meta charachter , $1 = positional parameteri
echo "you entered $1 $2 $3 $4 on command"

#$# = number of command line arguments
echo "you entered $# args on command line"

while [ $# -gt 0 ]
do
  echo "$1"
  shift
done
