import React from "react";
import { Component } from "react";

export default class InputExC extends Component {

    constructor() {
        super();
        this.state = { data: "Default", num1: 0, num2: 0 }
        this.handler1 = this.handler1.bind(this)
    }

    //simple function does not get the outer context
    //so it must be bound using the bind function
    handler1(event) {
        this.setState({ data: event.target.value })
    }

    //arrow function gets the outer context of the caller as this
    handler2 = (event) => {
        console.log("handler2 is called")
        this.setState({ data: event.target.value })
    }


    render() {
        return (
            <div>
                Handler1 :<input type="text" onBlur={this.handler1} />
                <p>{this.state.data}</p>
                <p>
                    Handler 2 :<input type="text" onBlur={this.handler2} />
                </p>
            </div>
        )
    }

}