import React from "react";

export default function Factorial(props) {
    let num = props.num
    let f = 1;
    for (var i = 1; i <= num; i++) {
        f = f * i;
    }

    return (<div> Factorial of {num} is {f} </div>)

}