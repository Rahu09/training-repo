import React, { useState } from "react";
import BookServices from "../services/BookService";
import { useParams, useNavigate } from "react-router-dom";

export const AddBook = () => {
  const { bookId } = useParams();
  const navigate = useNavigate();

  const [formData, setFormData] = useState({
    title: "",
    description: "",
    cost: 0.0,
    isbn: "",
    language: "",
    pages: 0,
    author: "",
    publication: "",
    bookNo: 0,
    edition: "",
    imageURL: "",
  });

  const handleSubmit = () => {
    console.log(typeof bookId, bookId);
    const requestData = {
      title: formData.title,
      isbn: formData.isbn,
      authorName: formData.author,
      publisherName: formData.publication,
      edition: formData.edition,
      description: formData.description,
      language: formData.language,
      pages: formData.pages,
      cost: formData.cost,
      bookCount: formData.bookNo,
      imageURL: formData.imageURL,
    };
    BookServices.addBook(requestData)
      .then(() => {
        console.log(requestData);
        alert("done");
      })
      .then(() => {
        navigate("/");
      });
  };

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
        minHeight: "83vh",
      }}
    >
      <div
        style={{
          width: "70%",
          border: "3px solid #2b3035",
          padding: "40px",
          borderRadius: "25px",
        }}
      >
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>Title:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.title}
            onChange={(e) => {
              setFormData({ ...formData, title: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>Discription:</h6>
          <textarea
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.description}
            onChange={(e) => {
              setFormData({ ...formData, description: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>cost:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.cost}
            onChange={(e) => {
              setFormData({ ...formData, cost: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>isbn:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.isbn}
            onChange={(e) => {
              setFormData({ ...formData, isbn: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>language:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.language}
            onChange={(e) => {
              setFormData({ ...formData, language: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>pages:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.pages}
            onChange={(e) => {
              setFormData({ ...formData, pages: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>author:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.author}
            onChange={(e) => {
              setFormData({ ...formData, author: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>publication:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.publication}
            onChange={(e) => {
              setFormData({ ...formData, publication: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>bookNo:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.bookNo}
            onChange={(e) => {
              setFormData({ ...formData, bookNo: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>imageUrl:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.imageURL}
            onChange={(e) => {
              setFormData({ ...formData, imageURL: e.target.value });
            }}
          />
        </div>
        <div
          className="mb-3"
          style={{
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <h6 style={{ fontSize: "20px", margin: "0px" }}>edition:</h6>
          <input
            className="form-control"
            style={{ width: "70%", height: "30px", borderColor: "#2b3035" }}
            value={formData.edition}
            onChange={(e) => {
              setFormData({ ...formData, edition: e.target.value });
            }}
          />
        </div>

        <button className="btn btn-dark" onClick={handleSubmit}>
          Submit
        </button>
      </div>
    </div>
  );
};
