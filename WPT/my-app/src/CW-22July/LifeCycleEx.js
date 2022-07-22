import React, { Component } from "react";

export default class LifeCycleEx extends Component
{

    constructor()
    {
        super()
        this.state={data:1}
        console.log("Component instantiated")
    }

    componentDidMount()
    {
        console.log("component mounted")
    }

    componentDidUpdate(prevProps,prevState)  //React framework supplies the previus value
    {
        console.log("updated props=",prevProps," prevState=",prevState)
    }

    componentWillUnmount()
    {
        console.log("component unmounted ")
    }


    render()
    {
        return(<div>
            <button onClick={()=>{this.setState({data:this.state.data+1})}}>change data</button>
            <p>
                LifeCycleEx  Seen  {this.props.message}
            </p>
        </div>)
    }




}




