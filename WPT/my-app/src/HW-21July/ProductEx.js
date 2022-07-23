import React from "react";
import { useState } from "react";

export default function ProductEx()
{
    let[id1,setId1] = useState(0);
    let[name1,setName1] = useState("");
    let[cost1,setCost1] = useState(0);
    let[productArr,setPooductArr] = useState([]);

    function handler()
    {
        let product = {id:{id1},name:{name1},cost:{cost1}}

        setPooductArr(existingItems => {
          return [product, ...existingItems]
        })

        console.log(productArr.map((p)=>{return p}));
    }

    return(
        <div>
            Enter Id <input type="number" onBlur={(event)=>{setId1(event.target.value)}}></input><br></br><br></br>
            Enter Name <input type="text" onBlur={(event)=>{setName1(event.target.value)}}></input><br></br><br></br>
            Enter Cost <input type="number" onBlur={(event)=>{setCost1(event.target.value)}}></input><br></br><br></br>
            <button onClick={handler}>Add</button>
            
        </div>
    )
}

/*
<span>{productArr.map(function(p){
                return(<li>{p.id}, {p.name}, {p.cost}</li>)
            })}</span>
*/