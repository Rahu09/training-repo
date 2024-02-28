import React, { Component } from "react";

export class Welcome extends Component {
  // constructor(props) {
  //   super(props);
  // }
  render() {
    return <div>hii from the class component {this.props.title}.</div>;
  }
}
