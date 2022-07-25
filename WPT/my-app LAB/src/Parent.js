import { useState } from "react";
import Child from "./Child";


export default function Parent()
{
    let [data,setData] = useState(0)

    function F1(v)
    {
        setData(v);
    }

    return(
        <div>
            <Child num="5" tellme={F1}></Child>
            <p>
                Child Sent me this {data}
            </p>
        </div>
    );
}