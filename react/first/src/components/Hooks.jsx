import React, { Component } from "react";

export default class Hooks extends Component {
  constructor(props) {
    super(props);
    this.state = { hello: "World!" };
  }

  componentDidMount() {
    console.log("componentDidMount()");
  }

  shouldComponentUpdate(nextProps, nextState) {
    console.log("shouldComponentUpdate()");
    return true;
  }

  getSnapshotBeforeUpdate(prevProps, prevState) {
    console.log("inside componentWillUpdate");
    return null;
  }

  componentDidUpdate() {
    console.log("componentDidUpdate()");
  }

  componentWillUnmount() {
    console.log("component will unmount");
  }

  render() {
    const changeState = () => {
      this.setState({ hello: "Geek!" });
    };
    return (
      <div>
        <h1>
          GeeksForGeeks.org, Hello
          {this.state.hello}
        </h1>
        <h2>
          <button onClick={changeState}>press</button>
        </h2>
      </div>
    );
  }
}
