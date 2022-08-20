import React from "react"
import './App.css';
import Comp2 from './Comp2';
function Comp1() {
  return (

    <div className="App">
      
      <select id="dropdown">
        <option>Pune</option>
        <option>NASHIK</option>
        <option>MUMBAI</option>
        <option>THANE</option>
        <option>JALGOAN</option>
      </select>
      
     <Comp2 name></Comp2>

    </div>
  );
}

export default Comp1;
