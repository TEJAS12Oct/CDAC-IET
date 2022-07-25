import Calculator from "./Calculator"
import { useState } from "react";
import PrimeNumber from "./PrimeNumber";


const PassFunction=(props)=>{
    const [isLoading, setIsLoading] = useState(false)

    function handlerex(event)
    {
        setIsLoading(!isLoading);
        
        console.log(event.target.name,isLoading)
        
       
    }

    return <div>
        <button name="b1" onClick={handlerex}>OK1</button>
       
        {isLoading && <Calculator num1="5" num2="10" op="+" arr={[3,4]}/>}
        {isLoading && <PrimeNumber num1="8"/>}
    </div>
}

export default PassFunction;