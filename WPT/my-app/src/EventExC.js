import React, { Component } from "react";


export default class EventExC extends Component
{

    //the caller is the React Framework and it is calling and passing the event
    handlerex(event)
    {
        if(event.target.name==="b1")
        console.log("HI THERE BUTTON OK1 CLICKED in class")
        if(event.target.name==="b2")
        console.log("HI THERE BUTTON OK2 CLICKED in class")
    }


    //this is called by US so x is passed by US
     handler2(x)
    {
        if(x===1)
        console.log("Button OK3 is clicked")        
        if(x===2)
        console.log("Button OK4 is clicked")        

    }


    render()
    {
        return(
        <div>
            <button name="b1" onClick={this.handlerex}>OK1</button>
            <button name="b2" onClick={this.handlerex}>OK2</button>
            <p>
            {/* WE are registering arrow function for click
            React will call the arrow func when button is clicked */}
            <button name="b3" onClick={(event)=>{ this.handler2(1) }}>OK3</button>
            <button name="b4" onClick={()=>{this.handler2(2)    }}>OK4</button>
            </p>

        </div>)
    }
}