import React from "react";
import { useState } from "react";
import Calc from "./Calc";


export default function CalcInput() {
    let [num1, setNum1] = useState(0);
    let [num2, setNum2] = useState(0);
    let [op, setOp] = useState("");

    return (
        <div>
            <input type="number" onBlur={(event) => { setNum1(event.target.value) }}></input>
            <input type="number" onBlur={(event) => { setNum2(event.target.value) }}></input>
            <select onClick={(event) => { setOp(event.target.value) }}>
                <option value="plus">Plus</option>
                <option value="minus">Minus</option>
                <option value="mul">Multiply</option>
                <option value="divide">Divide</option>
            </select>
            <Calc nums={[num1, num2]} op={op}></Calc>
        </div>
    )
}