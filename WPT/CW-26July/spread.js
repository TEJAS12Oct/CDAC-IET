/*
const obj1 = { x : 1, y : 2 };
const obj2 = { z : 3 ,x : 5 };

// add members obj1 and obj2  to obj3
const obj3 = {...obj1, ...obj2};

console.log(obj3); 
 */

/*
const arrValue = ['My', 'name', 'is', 'Jack'];

console.log(arrValue);   // ["My", "name", "is", "Jack"]

console.log("hi","everyone")
// the spread operator is laying out all elements in a comma separated format
console.log(...arrValue);  
*/
/*
const arr1 = ['one', 'two'];
//const arr2 = [arr1, 'three', 'four', 'five'];
//console.log("not using spread :",arr2.length , arr2, " print:",arr2[0][1])

const arr2 = [...arr1, 'three', 'four', 'five'];
console.log("using spread :",arr2.length , arr2, " print:",arr2[1])
*/


 
//let arr1 = [ 1, 2, 3];
/*
let arr2 = arr1; //SHALLOW COPY 
console.log(arr1); // [1, 2, 3]
console.log(arr2); // [1, 2, 3]
// append an item to the array
arr1.push(4);
console.log("after adding to arr1..")
console.log(arr1); // [1, 2, 3, 4]
console.log(arr2); // [1, 2, 3, 4]
*/
/*
let arr1 = [ 1, 2, 3];

let arr2 = arr1; //SHALLOW COPY 
// copy using spread syntax
//let arr2 = [...arr1];  //DEEP COPY happens using spread operator 

console.log(arr1); // [1, 2, 3]
console.log(arr2); // [1, 2, 3]

// append an item to the array
arr1.push(4);
console.log("after adding to arr1..")
console.log(arr1); // [1, 2, 3, 4]
console.log(arr2); // [1, 2, 3] */

