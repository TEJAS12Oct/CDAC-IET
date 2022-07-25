import React, { useEffect, useState } from "react";


export default function LifeCycleFuncEx(props)
{
         let [data,setData] = useState(0);

         useEffect(()=>{
            console.log("useeffect called -component mounted")
         } , [])

         useEffect(()=>{
            
            return ()=>{console.log("useeffect called -component Unmounted")}
         } , [])

         useEffect(()=>{
           
            console.log("updated...",props.message,data)
           
         } , [props.message,data])


        return(<div>
            <button onClick={()=>{setData(data+1)}}>change data</button>
            <p>
                LifeCycleEx  Seen  {props.message}
            </p>
        </div>)
    

}