function funfactory(num)
{
    if(num==0)
    {
        return((abc)=>{console.log("function at 0 index: " + abc);});
    }
    if(num==1)
    {
        return((t,s)=>{console.log(t*s)});
    }
    if(num==2)
    {
        return ((x)=>{console.log("Cube is: " + (x*x*x))});
    }
    else
    console.log("Change the Number");
}

funfactory(0)(10);
funfactory(1)(5,10);
funfactory(2)(10);
//funfactory(3)(10);

// Run = node Q6FunctionFactory.js