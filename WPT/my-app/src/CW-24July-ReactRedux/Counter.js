import classes from './Counter.module.css';
//import {connect} from "react-redux"
import React from 'react';
import {useSelector,useDispatch } from 'react-redux';

const Counter = ()=>{//({ counter, dispatch }) => {
  const counter = useSelector((state)=>{return state.counter});
  const dispatch= useDispatch()
  const toggleCounterHandler = () => {};

    const incrHandler =()=>{

      dispatch({type:'increment'});

    }

    const decrHandler =()=>{

      dispatch({type:'decrement'});

    }

  return (
   
    <main className={classes.counter}>
      <h1>Redux Counter</h1>
      <div className={classes.value}>{counter}</div>
     <div>
       <button onClick={incrHandler}>increment</button>
       <button onClick={decrHandler}>decrement</button>
     </div>
      <button onClick={toggleCounterHandler}>Toggle Counter</button>
    </main>
  );
};

function mapStateToProps(state) {
  const counter = state.counter;
  return {
    counter
  };
}

//export default connect(mapStateToProps)(Counter);

export default Counter;

