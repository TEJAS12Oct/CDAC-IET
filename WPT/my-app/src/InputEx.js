import React from "react";
import { useState } from "react";

export default function InputEx() {
    //let data="Default"
    let [data, setData] = useState("Default") //hook works for function components only
    function handler1(event) {
        // console.log("u entered ",event.target.value)
        //data = event.target.value
        setData(event.target.value)  //when we call this func the page is RERENDERED
        console.log("data value is :", data)
    }
    return (
        <div>
            <input type="text" onBlur={handler1} />
            <p>{data}</p>
        </div>
    )
}