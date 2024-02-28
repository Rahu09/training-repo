import React, { Component } from "react";
import axios from "axios";

export default class AJAXComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      data: [],
      config: {
        headers: {
          Authorization: `Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0aXdhcmlyYWh1bDA4MDlAZ21haWwuY29tIiwiaWF0IjoxNzA5MDE1MDQzLCJleHAiOjE3MDkxMDE0NDN9.iqVS1xNBX9vu4o3idjKJMtk5P6R4UhVSqbfXAu8i6Ws`,
        },
      },
    };
  }
  componentDidMount() {
    console.log("component did mount triggered");
    axios
      .get("http://localhost:8080/api/v1/book/books", this.state.config)
      .then((response) => {
        console.log("this is the response", response.data);
        this.setState({ data: response.data });
        console.log("state variable setState changed", this.state);
      })
      .catch((error) => {
        console.log(error);
      });
  }
  render() {
    const handleDelete = (e, id) => {
      axios
        .delete(
          `http://localhost:8080/api/v1/book/deletebook/${id}`,
          this.state.config
        )
        .then((response) => {
          alert(response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    };
    return (
      <>
        <table
          style={{
            textAlign: "left",
            // display: "flex",
            // flexDirection: "column",
          }}
        >
          <thead>
            <tr
              style={{
                // display: "flex",
                // gap: "10px",
                // justifyContent: "space-between",
                backgroundColor: "#e600e6",
                // width: "98vw",
              }}
            >
              <td>ID</td>
              <td>Title</td>
              <td>Discription</td>
              <td style={{ width: "70px" }}>cost</td>
              <td>isbn</td>
              <td style={{ width: "100px" }}>language</td>
              <td style={{ width: "100px" }}>pages</td>
              <td>author</td>
              <td>publication</td>
              <td>book count</td>
              <td>edition</td>
              <td>delete book</td>
            </tr>
          </thead>
          <tbody>
            {this.state.data.map((item, ind) => (
              <tr
                key={ind}
                // style={{
                //   display: "flex",
                //   gap: "10px",
                //   justifyContent: "space-between",
                //   width: "98vw",
                // }}
              >
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
                  <button onClick={(e) => handleDelete(e, item.id)}>
                    delete book
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </>
    );
  }
}
