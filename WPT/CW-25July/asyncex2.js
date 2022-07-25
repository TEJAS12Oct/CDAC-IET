async function A1()
{
    console.log(1)
    await new Promise((res,rej)=>{ setTimeout(()=>{console.log("promise executed"),res("done!")},1000)})
    console.log(2)
}

let y = A1()
y.then((res)=>{console.log("then",res)})
console.log(y)
