

function factorial(num=2)
{
    var fact=1;
    for(i=1;i<=num;i++)
    {
        fact*=i
    }
    console.log("Factorial of",num,"is",fact);
}


factorial();
factorial(5);