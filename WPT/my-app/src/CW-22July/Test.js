import React, { Component } from "react";
//import LifeCycleEx from "./LifeCycleEx";
import LifeCycleFuncEx from "./LifeCycleFuncEx";

export default class Test extends Component {
    constructor() {
        super()
        this.state = { check: false, msg: "hello initially" }
    }

    handler = (event) => {
        // console.log("handler invoked")
        if (event.target.checked === true)
            this.setState({ check: true })
        else
            this.setState({ check: false })
    }

    render() {
        return (
            <div>
                <input type="text" onBlur={(event) => { this.setState({ msg: event.target.value }) }} />
                <input type="checkbox" onClick={this.handler} />
                {this.state.check && <LifeCycleFuncEx message={this.state.msg}></LifeCycleFuncEx>}
            </div>
        )
    }



}
