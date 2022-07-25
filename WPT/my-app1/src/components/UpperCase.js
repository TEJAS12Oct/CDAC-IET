import React from "react";
import {useState} from "react";
const UpperCase=()=>{
    const [enteredInput,setEnteredInput]=useState();
    const setEnteredInputFunction=(event)=>{
        console.log(event.target.value);
        setEnteredInput(event.target.value.toString());
        

    }
    const setEnteredInputFunctionUpperCase=()=>{
       
        setEnteredInput(enteredInput.toUpperCase());
        

    }
   
    var isEntering=true;
    return <div>
                <input type="text" value={enteredInput} onChange={setEnteredInputFunction}></input>
                
                
                <br></br>
                <button type="button" onClick={setEnteredInputFunctionUpperCase}>Upper Case </button>
                <span>{enteredInput}</span>
                
            </div>

}


export default UpperCase;