import React from "react";
import { Component } from "react";

class HttpEx extends Component {
    constructor() {
        super()
        this.state = { name: '', job: '', data: [] }

    }

    //CALLBACK method
    componentDidMount() {
        console.log("here")
        var promise = fetch("https://reqres.in/api/users?page=2", {
            "method": "GET",
        }).then(response => {
            console.log("the first response ", response)
            let x = response.json()   //asynchronous operation
            console.log("after json", x) //x is the Promise
            return x
        }).then(jsonobj => {
            this.setState({
                data: jsonobj.data
            })
        })

        promise.catch(err => {
            console.log(err);
        });

    }

    getData = (e) => {

        var opts = this.state.data.map((obj) => { return <option>{obj.first_name} </option> })
        return opts
    }


    sendData = (e) => {
        fetch("https://reqres.in/api/users", {
            "method": "POST",
            "headers": { 'Content-Type': 'application/json' },
            "body": JSON.stringify({
                name: this.state.name,
                job: this.state.job
            })
        }).then(response => { return response.json() })
            .then(res => { console.log(res) })

        console.log("YOU SHOULD NOT DO THIS.....")
    }



    getDataUsingSimpleJS = (e) => {
        var http = new XMLHttpRequest();
        http.onload = function () {
            alert(http.response)
        }
        http.open('GET', 'http://localhost:8080/book/allbooks/')
        http.send();

    }


    render() {

        return <div><select>
            {this.getData()}
        </select>
            <input type="text" placeholder="enter name" onBlur={(event) => { this.setState({ name: event.target.value }) }} />
            <input type="text" placeholder="enter job" onBlur={(event) => { this.setState({ job: event.target.value }) }} />
            <button onClick={this.sendData}>add</button>
            <button onClick={this.getDataUsingSimpleJS}>get</button>
        </div>
    }
}

export default HttpEx