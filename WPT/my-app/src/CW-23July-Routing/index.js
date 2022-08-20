import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import ChangeColor from "./CW-23July-Routing/ChangeColorFromProps"
import Factorial from "./Factorial";
import AppRoute from "./CW-23July-Routing/AppRoute";
import ShowTable from "./CW-23July-Routing/ShowTable";
import ShoppingCart from "./CW-22July/ShoppingCart";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<AppForRoutes />)

export default function AppForRoutes() {
  return (
    < BrowserRouter >
      <Routes>
        <Route path="/" element={<AppRoute></AppRoute>} >
          <Route path="math/table/:num" element={<ShowTable></ShowTable>} />
          <Route path="math" element={<Factorial  ></Factorial>} />
          <Route path="color" element={<ChangeColor ></ChangeColor>} />
          <Route path="shopping" element={<ShoppingCart></ShoppingCart>}></Route>
        </Route>
      </Routes>
    </ BrowserRouter >
  );
}

// RUN ON SRC INDEX.JS FILE
