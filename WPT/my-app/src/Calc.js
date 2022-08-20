import React from 'react';


export default function Calc(props) {
      let op = props.oop
      //let arr=[10,20]
      //let op='+';
      if (op === '+')
            return (<h1> {props.arr[0]} plus {props.arr[1]}  :{props.arr[0] + props.arr[1]}</h1>)
      if (op === '-')
            return (<h1> {props.arr[0]} Minus {props.arr[1]} :{props.arr[0] - props.arr[1]}</h1>)
      if (op === '*')
            return (<h1> {props.arr[0]} Multiply {props.arr[1]} :{props.arr[0] * props.arr[1]}</h1>)
      if (op === '/')
            return (<h1>{props.arr[0]} Divide {props.arr[1]} :{props.arr[1] / props.arr[0]}</h1>)


}


