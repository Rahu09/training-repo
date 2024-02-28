import "./App.css";
import React from "react";
import { ListBooks } from "./components/ListBooks";
import "bootstrap/dist/css/bootstrap.min.css";
import { Header } from "./components/Header";
import { Footer } from "./components/Footer";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { BookUpdate } from "./components/BookUpdate";
import { AddBook } from "./components/AddBook";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Header />
        <Routes>
          <Route path="/" element={<ListBooks />} />
          <Route path="/updateBook/:bookId" element={<BookUpdate />} />
          <Route path="/addBook" element={<AddBook />} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
