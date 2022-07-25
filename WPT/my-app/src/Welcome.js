
import React from "react"
import ShowArray from "./ShowArray";

export default function Welcome()
{
    let x=300;
    let arr=["TEJAS","SANTOSH","MAYUR","RUCHITA","AARTI"]
    let data={}
    data.key=12;
    data.value="Nashik"

    let square = (x)=>{ return x*x }

    //return ("<div><h1>Welcome</h1></div>");
    return(<div>
        <h1>Welcome {x} {2+3} {3*9-2} {"hello".toUpperCase()}  </h1>
        <ShowArray names={arr} data={data}   maths={square}></ShowArray>
        </div>)
}

//this function is called by the React Framework 
//React Framework reads the attribute personname and adds it to props object
// and it passes the props object here
export function Greeting(props)
{
    return(<p>Namaste..{props.personname}...from ....{props.country}</p>)
}










