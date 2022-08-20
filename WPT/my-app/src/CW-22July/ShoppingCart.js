import React from "react"
import ShoppingItem from "./ShoppingItem"
import "./ShoppingItem.css"

export default function ShoppingCart() {
    let shopping_list = [
        { id: "p1", item_name: "Jeans", item_Cost: 2000, item_q: 1 },
        { id: "p2", item_name: "Shoes", item_Cost: 3500, item_q: 2 },
        { id: "p3", item_name: "Blazer", item_Cost: 4000, item_q: 3 },
        { id: "p4", item_name: "Jacket", item_Cost: 450, item_q: 4 },
        { id: "p5", item_name: "Shirt", item_Cost: 4500, item_q: 5 },
    ]

    let all_items = shopping_list.map((item) => {
        return <ShoppingItem key={item.id}
            item_Name={item.item_name}
            item_Cost={item.item_Cost}
            item_q={item.item_q}>

        </ShoppingItem>
    });

    return (
        <div>
            {all_items}
        </div>
    )

}