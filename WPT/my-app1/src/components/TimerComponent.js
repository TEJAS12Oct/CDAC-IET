import { useState,useEffect  } from "react";

const TimerComponent=()=>{
    let [isVisible,setIsVisible]=useState(false);
    let [counter,setCounter]=useState(1);
    let [isActive,setIsActive]=useState(false);

    const toggleVisibility=()=>{
        setIsVisible(!isVisible)
    }

  
       
    const toggleTimer=()=>{
        setIsActive(!isActive);
    }
        useEffect(() => {
            let interval = null;
            if (isActive) {
              interval = setInterval(() => {
                setCounter(counter => counter + 1);
              }, 1000);
            } else if (!isActive && counter !== 0) {
              clearInterval(interval);
            }
            return () => clearInterval(interval);
          }, [isActive, counter]);
    
    
   

    return <div>
        Timer-Component<br></br>
        <button type="button" onClick={toggleVisibility}>Toggle Visibility</button><br></br>
        {isVisible && <button type="button" onClick={toggleTimer}>Start</button>}
        {isVisible && <p>{counter}</p>}
       
    </div>
}

export default TimerComponent;