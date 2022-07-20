import { Component } from "react";
import React from "react";

export default class ShowArray extends Component
{
    render()
    {
        return <div>The array is {this.props.names[1]} 
        <p>The data is {this.props.data.key} and {this.props.data.value}</p>
        <p>The return value of the function is {this.props.maths(5)}</p>
        
        
        </div>
    }
}