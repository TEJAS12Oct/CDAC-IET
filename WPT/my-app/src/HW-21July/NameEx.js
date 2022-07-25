import React from "react";
import { useState } from "react";


export default function NameEx()
{
    let[res,setRes] = useState("");
    
    let[str,setStr] = useState("");

    function f1(event)
    {   
        let str1 = str.toUpperCase();
        setRes(str1); 
    }

    function f2(event)
    {
        let str1 = str.toLowerCase();
        setRes(str1); 
    }

    function f3(event)
    {
        let str1 = str.replace(/\W+(.)/g, function(match, chr)
        {
             return chr.toUpperCase();
        });
        setRes(str1);
    }

    function setValue(event)
    {
        console.log(event.target.value)
        setStr(event.target.value);
    }

    return(
        <div>
            <h3>Enter Text</h3>
            <input type="text" onBlur={setValue}></input>
            <br></br>
           For Upper Case <input type="radio" name="opt" onClick={f1}></input>
           <br></br><br></br>
           For Lower Case <input type="radio" name="opt" onClick={f2}></input>
           
           <br></br><br></br>
           For Camel Case <input type="radio" name="opt" onClick={f3}></input>
           <br></br><br></br>
           <span>  {res}</span>
            

        </div>
    )
}