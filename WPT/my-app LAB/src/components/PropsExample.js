import React from "react";

const PropsExample=(props)=>{
    /* Bussiness Logic*/
    console.log(props);
    const squareResult=props.num1 * props.num1;

    //rendering code
    return <div>
        <h1>Hello World!</h1>
        <p>Square is {squareResult}</p>
    </div>
}

export default PropsExample;