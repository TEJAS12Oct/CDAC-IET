// //1. ----------------------------------
// const obj1={x:1 , y:2};
// const obj2={z:3 , x:5};
// const obj3={...obj1 , ...obj2};
// console.log(obj3);

// //2. -----------------------------------
// const arrvalue=['My' ,'name','is','Tejas'];
// console.log(arrvalue);
// console.log(...arrvalue);

// //3. -------------------------------------
// let arr1=['One',"two"];
// let arr2=[arr1,'Three','Four','Five']
// let arr3=[...arr1,'Three','Four','Five']
// console.log("Without using Spread Oprator ",arr2 , "  Length Of Arr2 ",arr2.length,"  Print",arr2[0][1]);
// console.log("Using Spread Oprator ",arr3, "  Length of Arr3 : ",arr3.length, " Print ",arr3[1]);



let arr4 = [1,2,3]
//let arr5 =arr4;//SHALLO Copy
//copy using spread syntax
let arr5 = [...arr4]; // DEEP COPY

console.log(arr4);
console.log(arr5);

arr4.push(4);
console.log("After pushing : ")
console.log(arr4);
console.log(arr5);
