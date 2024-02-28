import React, { Component } from "react";

export class CounterNew extends Component {
  constructor(props) {
    super(props);
    console.log("constructured fired...");
    this.state = {
      counter: 0,
      x: 1,
      y: "test",
    };
  }
  increment() {
    console.log("increment fired");
    setTimeout(() => {
      console.log("setimeout fired");
      this.setState((prev, props) => ({ counter: prev.counter + 1 }));
    }, 1000);

    console.log("after timeout", this.state);
  }

  render() {
    console.log("Render method fired...");
    this.increment();
    return (
      <div>
        <div>
          <p>the value of {this.state.counter}</p>
        </div>
      </div>
    );
  }
}

export default CounterNew;
