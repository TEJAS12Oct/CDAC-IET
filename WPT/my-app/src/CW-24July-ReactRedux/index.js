import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import ChangeColor from "./CW-23July-Routing/ChangeColorFromProps"
import Factorial from "./Factorial";
import AppRoute from "./CW-23July-Routing/AppRoute";
import ShowTable from "./CW-23July-Routing/ShowTable";
import ShoppingCart from "./CW-22July/ShoppingCart";
import Counter from "./CW-24July-ReactRedux/Counter";
import store from "./CW-24July-ReactRedux/store/index";;
import { Provider } from "react-redux";

export default function AppForRoutes() {
  return (
    < BrowserRouter >
      <Routes>
        <Route path="/" element={<Provider store={store}><AppRoute></AppRoute></Provider>} >
          <Route path="math/table/:num" element={<ShowTable></ShowTable>} />
          <Route path="math" element={<Factorial  ></Factorial>} />
          <Route path="color" element={<ChangeColor ></ChangeColor>} />
          <Route path="shopping" element={<ShoppingCart></ShoppingCart>}></Route>
          <Route path="counter" element={<Counter></Counter>}></Route>
        </Route>
      </Routes>
    </ BrowserRouter >
  );
}
ReactDOM.render(<AppForRoutes />, document.getElementById('root'))