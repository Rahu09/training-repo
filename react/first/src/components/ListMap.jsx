import React, { Component } from "react";

export default class ListMap extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fruitsArray: ["apple", "orange", "banana"],
      person: [
        { name: "Jhon Doe", age: 30 },
        { name: "Jane Smith", age: 25 },
      ],
    };
  }
  render() {
    const fruits = this.state.fruitsArray.map((itm, k) => (
      <li key={k}>{itm}</li>
    ));

    const personData = this.state.person.map((p, ind) => (
      <tr
        key={ind}
        style={{
          display: "flex",
          flexDirection: "row",
          justifyContent: "space-around",
        }}
      >
        <td>{p.name}</td>
        <td>{p.age}</td>
      </tr>
    ));
    return (
      <>
        <h1>Fruits</h1>
        <div
          style={{
            display: "flex",
            flexDirection: "row",
            justifyContent: "space-around",
          }}
        >
          <ul>{fruits}</ul>
        </div>
        {/* ------------------------------------------------------------------- */}
        <h1>Persons</h1>
        <div
          style={{
            display: "flex",
            flexDirection: "column",
            padding: "10px",
            justifyContent: "space-around",
            width: "100vw",
          }}
        >
          <table>
            <tbody>
              <tr
                style={{
                  display: "flex",
                  flexDirection: "row",
                  justifyContent: "space-around",
                }}
              >
                <td>Name</td>
                <td>Age</td>
              </tr>
              {personData}
            </tbody>
          </table>
        </div>
      </>
    );
  }
}
