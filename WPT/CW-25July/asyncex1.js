
function f1()
{

}

async function f2()
{
   return new Promise((res,rej)=>{ res("done!")})
}
let x = f1()
let y = f2()
   y.then((resolvedval)=>{console.log("in then",resolvedval)})

console.log("simple function returns ",x)
console.log("async function returns ",y)