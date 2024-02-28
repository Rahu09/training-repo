import React, { Component } from "react";

export class MyHandlerClass extends Component {
  render() {
    const myHandler = () => {
      console.log("event handler method fired.");
      alert("this is event handler demo.");
    };
    return (
      <div>
        <button onClick={myHandler}>button</button>
      </div>
    );
  }
}
