console.log('hi')

let interval_id = setInterval(()=>{console.log("periodic job")}  ,  2000)

//clearInterval(interval_id)

 setTimeout(()=>{
    console.log("clearing the interval")
    clearInterval(interval_id)} , 10000) 
console.log("thanks")