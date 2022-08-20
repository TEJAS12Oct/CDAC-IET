import React from "react";
import { useState } from "react";
import Factorial from "./Factorial";
import IsPrime from "./IsPrime";

export default function PrimeFact() {
    let [num1, setNum1] = useState(10);
    return (
        <div>
            <input type="number" onBlur={(event) => { setNum1(event.target.value) }}></input>
            <IsPrime num={num1}></IsPrime>
            <Factorial num={num1}></Factorial>
        </div>
    )
}