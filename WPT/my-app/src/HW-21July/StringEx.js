import React from "react";
import { useState } from "react";


export default function StringEx()
{
    let[half,setHalf] = useState("");
    let[revs,setRevs] = useState("");
    let[vow,setVow] = useState("");
    let[str,setStr] = useState("");

    function f1(event)
    {
        if(event.target.checked)
        {
            let str1 = str.slice(0, str.length/2)
            setHalf(str1);
        }
        else
        {
            setHalf("");
        }   
    }

    function f2(event)
    {
        if(event.target.checked)
        {
            let str1 = "";
            for (var i = str.length - 1; i >= 0; i--) { 
                str1 += str[i]; 
            }
            setRevs(str1);
        }
        else
        {
            setRevs("");
        }
    }

    function f3(event)
    {
        if(event.target.checked)
        {
            let cnt = str.match(/[aeiou]/gi).length;
            setVow(cnt);
        }
        else
        {
            setVow("");
        }
            
    }

    function setValue(event)
    {
        setStr(event.target.value);
    }

    return(
        <div>
            <h3>Enter Text</h3>
            <input type="text" onBlur={setValue}></input>
            <br></br>
           For Half String <input type="checkbox" name="hal" onClick={f1}></input>
           <span>  {half}</span>
           <br></br><br></br>
           For Reverse String <input type="checkbox" name="rev" onClick={f2}></input>
           <span>  {revs}</span>
           <br></br><br></br>
           For Number of Vowels <input type="checkbox" name="vowel" onClick={f3}></input>
           <span>  {vow}</span>
            

        </div>
    )
}