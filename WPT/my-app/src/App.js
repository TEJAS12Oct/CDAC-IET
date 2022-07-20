import React from 'react';
import './App.css';
import GoodMorning from './GoodMorning';
import GoodBye from './GoodBye';
import Factorial from './Factorial';
import HelloC from './HelloC';
import InputC from './InputC';

//Ting is an alias to normal export Greeting in ./Welcome
//import {Greeting as Ting} from './Welcome';

//Www is an alias to whatever is exported by default in ./Welcome file
//import Www from './Welcome'
import Www, {Greeting } from './Welcome'

function App() 
{
  return (
          <div>
          <GoodMorning></GoodMorning>
          <div>HI</div>
          <div>Hello</div>
          <GoodBye></GoodBye>
    
         
          <HelloC pname="TEJAS"></HelloC>
          <Greeting  personname="prachi"  country="India"></Greeting>
          <Www></Www>
          <InputC></InputC>
          <Factorial num= "10"></Factorial>
          <div className='SomeStyle'>HI</div>
           <div>Hello</div>
           </div>
          )
     
}

export default App;
