import React from "react"
import "./ShoppingItem.css"
export default function ShoppingItem(props)
{

    return(
        <div className="item">
             <p>Name: {props.item_Name}</p>
             <p>Cost: {props.item_Cost}</p>
             <p>Quntity: {props.item_q}</p>
        </div>

    )
    
}