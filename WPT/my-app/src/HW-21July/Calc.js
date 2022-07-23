import React from "react";

export default function Calc(props)
{
    let num = props.nums;
    let op = props.op;
    let str = ""
    if(op === "plus")
    {
        let res = parseInt(num[0])+parseInt(num[1]);
        str = `${num[0]} + ${num[1]} = ${res}`
    }
    if(op === "minus")
    {
        let res = num[0]-num[1];
        str = `${num[0]} - ${num[1]} = ${res}`
    }
    if(op === "mul")
    {
        let res = num[0]*num[1];
        str = `${num[0]} * ${num[1]} = ${res}`
    }
    if(op === "divide")
    {
        let res = num[0]/num[1];
        str = `${num[0]} / ${num[1]} = ${res}`
    }
    return (<div>{str}</div>)
}