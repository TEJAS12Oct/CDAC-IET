import React from "react"

export default function EventTestEx()
{

//this is called by React framework , so event is passed by React
    function handlerex(event)
    {
        console.log(event.target.name)
   
        if(event.target.name==="b1")
        console.log("HI THERE BUTTON OK1 CLICKED ")
        if(event.target.name==="b2")
        console.log("HI THERE BUTTON OK2 CLICKED ")      
    }

//this is called by US so x is passed by US
    function handler2(x)
    {
        if(x===1)
        console.log("Button OK3 is clicked")        
        if(x===2)
        console.log("Button OK4 is clicked")        

    }

    return(
        <div>
            <button name="b1" onClick={handlerex}>OK1</button>
            <button name="b2" onClick={handlerex}>OK2</button>
            <p>
            {/* WE are registering arrow function for click
            React will call the arrow func when button is clicked */}
            <button name="b3" onClick={(event)=>{ handler2(1) }}>OK3</button>
            <button name="b4" onClick={()=>{handler2(2)    }}>OK4</button>
            </p>

        </div>
    )
}