import React from "react";
import  ReactDOM  from "react-dom";
import { BrowserRouter,Route, Routes } from "react-router-dom";
import ChangeColor from "./Saturday/ChangeColorFromProps"
import Factorial from "./Factorial";
import AppRoute from "./Saturday/AppRoute";
import "./Friday/item.css"
import ShowTable from "./Saturday/ShowTable";
import ShoppingCart from "./Friday/ShoppingCart";
import Counter from "./Sunday/Counter";
import store from "./store/index";
import { Provider } from "react-redux";

export default function AppForRoutes(){
  return(
  < BrowserRouter >
          <Routes>    
          <Route path="/" element={<Provider store={store}><AppRoute></AppRoute></Provider>} >
                <Route path="math/table/:num" element={<ShowTable></ShowTable>} />
                <Route path="math" element={<Factorial  ></Factorial>} />
                <Route path="color" element={ <ChangeColor ></ChangeColor> } />
                <Route path="shopping" element={<ShoppingCart></ShoppingCart>}></Route>
                <Route path="counter" element={<Counter></Counter>}></Route>
            </Route> 
          </Routes>     
    </ BrowserRouter >
 );
      }
 ReactDOM.render(<AppForRoutes/>,document.getElementById('root'))