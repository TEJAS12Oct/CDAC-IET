//Pass a function to another function as a parameter 

var a = function(x,y){
    console.log("sum ",(x+y))
}

function maths(f1)  //receives a function as parameter
{
        f1(3,4); //call 
}

//passing function type variable
maths(a)  //call to maths

//passing fat arrow function
maths((p1,p2)=>{console.log("product",(p1*p2))})

//passing anonymous function
maths(function (a,b){console.log("division remainder",(a%b))})

function difference(r,s)
{
    console.log("difference ",(r-s))
}
//passing named function
maths(difference)



