import React from "react";
import { useSelector } from "react-redux";

export default function Factorial(props)
{
    const counter = useSelector((state)=>{return state.counter});
    let num = counter
    let f=1;
    for(var i=1;i<=num;i++)
    {
        f=f*i;
    }

    return (<div> Factorial of {num} is {f} </div>)

}