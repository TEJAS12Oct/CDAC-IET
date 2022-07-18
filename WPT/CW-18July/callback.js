console.log("1")


setTimeout(()=>{
    console.log("THis job is done after specified time")
},5000)  //the arrow function is a asynchronous callback function 

//new Array("this job").forEach((e)=>{console.log(e)}); //arrow function is synchronous callback

console.log("3")
