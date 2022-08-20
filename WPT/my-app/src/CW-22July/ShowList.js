import React from "react"

export default function ShowList() {
    let arr = ["Salt", "Sugar", "Tea", "Coffee", "Milk"]
    let List_items = arr.map((element, index) => { return <li key={index}>{element}</li> })
    return (
        <div>
            <ol>
                {List_items}
            </ol>
        </div>

    )

}