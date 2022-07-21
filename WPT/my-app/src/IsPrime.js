import {Component} from "react";
import React from "react";

export default class IsPrime extends Component
{
    
    render()
    {
        let n=this.props.num;

        for(var i=2;i<n;i++)
        {
            if(n%i===0)
            return(<div><h1>{n} is not prime</h1></div>)
        }
        return(<div><h1>{n} is prime</h1></div>)
    }
}
