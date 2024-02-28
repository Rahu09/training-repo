import React, { useEffect, useState } from "react";
import BookServices from "../services/BookService";
import { Link, useNavigate } from "react-router-dom";

export const ListBooks = () => {
  const navigate = useNavigate();
  const [books, setBooks] = useState([{}]);

  useEffect(() => {
    BookServices.getAllBooks().then((response) => {
      console.log("this is the response", response);
      setBooks(response);
      console.log("state variable setState changed", books);
    });
  }, []);

  const handleDelete = (e, id) => {
    BookServices.deleteBook(id).then((response) => {
      alert(response.data);
      BookServices.getAllBooks().then((response) => {
        setBooks(response);
      });
    });
  };

  return (
    <div style={{ width: "100vw" }}>
      <div className="container">
        <h2 className="text-center">Books Data</h2>
        <table className="table table-striped">
          <thead>
            <tr>
              <th>ID</th>
              <th>Title</th>
              <th>Discription</th>
              <th>cost</th>
              <th>isbn</th>
              <th>language</th>
              <th>pages</th>
              <th>author</th>
              <th>publication</th>
              <th>book count</th>
              <th>edition</th>
              <th>update book</th>
              <th>delete book</th>
            </tr>
          </thead>
          <tbody>
            {books.map((item, ind) => (
              <tr key={ind}>
                <td>{item.id}</td>
                <td>{item.title}</td>
                <td>{item.description}</td>
                <td>{item.cost}</td>
                <td>{item.isbn}</td>
                <td>{item.language}</td>
                <td>{item.pages}</td>
                <td>{item.authorName}</td>
                <td>{item.publisherName}</td>
                <td>{item.bookCount}</td>
                <td>{item.edition}</td>
                <td>
                  <Link to={"/updateBook/" + item.id}>update</Link>
                </td>
                <td>
                  <button
                    onClick={(e) => {
                      handleDelete(e, item.id);
                    }}
                  >
                    deleteBook
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <button style={{ margin: "20px" }} onClick={() => navigate("/addBook")}>
          add book
        </button>
      </div>
    </div>
  );
};
