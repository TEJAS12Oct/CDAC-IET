import { Link, Outlet } from "react-router-dom"
//import "../Friday/item.css"
import React from "react"

function AppRoute() {
    let x = 67
    return (<div>
        <nav>
            <ul>
                <li><Link to="/color" > Colored TEXT</Link></li>
                <li><Link to="/math"  > Factorial</Link></li>
                <li><Link to={`/math/table/${x}`} > Table</Link></li>
                <li><Link to="/shopping">Buying</Link></li>
            </ul>

        </nav>
        <div className="item">
            <Outlet></Outlet>  {/* the component will be rendered here*/}
        </div>

        <div>
            THIS IS END
        </div>
    </div>)
}

export default AppRoute