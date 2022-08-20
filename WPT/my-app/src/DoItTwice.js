import { Component } from 'react'
import React from 'react'

export default class DoItTwice extends Component {
    render() {
        return (<div>{this.props.fun() + " " + this.props.fun()}</div>)
    }

}
