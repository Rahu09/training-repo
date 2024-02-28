import React, { Component } from "react";

export class CounterClass extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
      checked: false,
      text: "",
    };
  }

  render() {
    const increment = () => {
      this.setState((prev, props) => ({ counter: prev.counter + 1 }));
    };

    const decrement = () => {
      this.setState((prev, props) => ({ counter: prev.counter - 1 }));
    };

    const handleChange = () => {
      this.setState((prev, prop) => ({ checked: !prev.checked }));
    };

    const handleTextChange = (e) => {
      this.setState((prev, prop) => ({ text: e.target.value }));
    };

    console.log(this.state);
    return (
      <div>
        <h3>Counter Button</h3>
        <button onClick={increment}>+</button>
        <button onClick={decrement}>-</button>
        <p>{this.state.counter}</p>
        <br />
        {/* ------------------------------------------------------------ */}
        <h3>Checkbox</h3>
        <input
          type="checkbox"
          checked={this.state.checked}
          onChange={handleChange}
        />
        <p>checkbox is checked {this.state.checked ? "true" : "false"}</p>
        <br />
        {/* ------------------------------------------------------------ */}
        <h3>Type your input here</h3>
        <input
          type="text"
          value={this.state.text}
          onChange={handleTextChange}
        />
        <p>you have typed {this.state.text}</p>
      </div>
    );
  }
}

export default CounterClass;
