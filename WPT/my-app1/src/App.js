
import './App.css';
import ReduxComponentEx1 from './components/ReduxComponentEx1';
import PropsExample from './components/PropsExample'

import Calculator from './components/Calculator';

import PassFunction from './components/PassFunction'
import LifeCycleEx from './components/LifeCycleEx';
import TimerComponent from './components/TimerComponent';


function App(){
  return <div>
    {
    // <Calculator num1="5" num2="10" op="+" arr={[3,4]}/>
    // <Calculator num1="5" num2="10" op="*" arr={[3,4]}/>
    //<PropsExample num1="564"/>
    // <PassFunction></PassFunction>
    // <LifeCycleEx></LifeCycleEx>
    // <TimerComponent></TimerComponent>
    <div>
    
    <ReduxComponentEx1></ReduxComponentEx1>
   
    </div>
    /*
    <CharCountF>This is a wonderful morning</CharCountF>
    <InputExC></InputExC> 
    <p>4th of Feb(mannually written by me)</p>*/
    /*{ <UpperCase></UpperCase>
    <DateComponent></DateComponent> }*/
    /*{ <BlogPage></BlogPage>
    
     <HttpExample></HttpExample> }*/

   
    /*{ <BlogPage></BlogPage> }*/
    //
    
   
    }
  </div>
  

}

export default App;
