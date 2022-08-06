function increment(x)
{
    x++;
}

function change(arr)  //copy of reference, ONLY one array
{
    arr[0]="universal";
}

function changestr(str)
{
    str=str+str;
}

var p=10;
increment(p);
console.log("after incr ",p) //pass by value

a =[12,13,14,15]
change(a)  // the reference of the array is passed 
for(var i=0;i<a.length;i++)
{
    console.log(a[i])
}

s="hi"
changestr(s)  //string s is immutable
console.log("new string = ",s)


function changeObj(obj) //reference is received , ONLY one object
{
    obj.name="modified"
}

var o ={'name':'prachi', 'age':'10'}
changeObj(o) //reference is passed
console.log(o.name,o.age)




// run = node paramPass.js


