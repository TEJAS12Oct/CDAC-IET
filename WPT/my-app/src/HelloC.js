import { Component } from "react";
import React from "react";

export default class HelloC extends Component {

    render() {
        return (<p>Hello {this.props.pname}</p>)
    }
}