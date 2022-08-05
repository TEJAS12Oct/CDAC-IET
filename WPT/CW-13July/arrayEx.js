var d = []  //size and type of the array is not fixed
// console.log("Length : ",d.length) //0

// d.push(12)
// console.log(d.length,d)
// d.push("golden")
// console.log(d.length,d)
// d.pop();
// console.log(d.length,d)
d.push(13,20,24,10,15,16)
//console.log(d.length,d)

// var cutout = d.slice(0,3)
// console.log("SLICE ",cutout, "original",d) //Slice cut element => start print from 3

//splice for deleting elements
// var c2 = d.splice(3,2)  //start from index 3 and delete only 2
// console.log("SPLICE ",c2," original:",d)

//c2 =d.splice(0,1,"Tejas") // 0th element is replaced by "Tejas"
//c2 =d.splice(0,0,"Tejas") // 0th element is inserted "Tejas"
//console.log("SPLICE ",c2," original:",d)

//d.forEach((e)=>{console.log(e)})

// d.reverse().pop()
// console.log(d)

// d.sort((a,b)=> a-b) //shorthand if no curly brackets then return the value
// console.log("asc :",d)
// d.sort( (a,b)=>{return b-a} )  //descending
// console.log("desc", d)

// var o1 = {"name":"dddd","age":12}
// var o2 = {"name":"yyyy","age":9}
// var o3 = {"name":"xxx","age":30}
// var o4 = {"name":"ppp","age":20}
// var o5 = {"name":"qqq","age":17}
// arr=[]
// arr.push(o1,o2,o3,o4,o5)
// arr.sort((a,b)=>{return a.age-b.age}) //sort by age
// console.log("sort by age",arr)

// arr.sort((a,b)=>{return a.name.localeCompare(b.name)}) //sort by age
// console.log("sort by name",arr)


var nums = [1,2,3,4]

//square array  
var squarearr = nums.map((e)=>{return (e*e)})
console.log("num :",nums)
console.log("square :",squarearr)

var colors = ['red','green','blue','yellow','black','white',
             'turquiose','pink','golden','grey']
var newarr = colors.filter((e)=>{ return e.length <5});
console.log("newarr",newarr ," \n original:",colors)


// @param callbackfn — A function that accepts up to three arguments. 
// The map method calls the callbackfn function one 
// time for each element in the array.

// @param thisArg — An object to which the 
// this keyword can refer in the callbackfn function. 
// If thisArg is omitted, undefined is used as the this value.

// Run => node arrayEx.js

