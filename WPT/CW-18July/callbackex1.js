arr = [12,13,16,45,46,29,28,100]

function evenonly(num)
{
    if(num%2 == 0)  return true;
    else
    return false;
}

//let evenarr = arr.filter(evenonly)  //evenonly is a callback function
let evenarr = arr.filter( (num)=>{if(num%2 == 0)  return true;
    else
    return false;})     //arrow function is a callback function
console.log(evenarr)