import React, { Component } from "react";

export class Todo extends Component {
  constructor(props) {
    console.log("inside input constructur");
    super(props);
    this.state = {
      list: ["this is first task"],
      textbox: "",
    };
  }

  render() {
    const inputHandler = (e) => {
      console.log("typing task");
      let text = e.target.value;
      this.setState({ textbox: text });
      console.log("state variable changed", this.state);
    };

    const addTodo = (e) => {
      console.log("adding todo");
      let tempList = this.state.list;
      tempList.push(this.state.textbox);
      this.setState({ list: tempList });
      console.log("state variable changed", this.state);
    };

    const removeItem = (e, ind) => {
      console.log("removing item");
      let tempList = this.state.list;
      tempList.splice(ind, 1);
      this.setState({ list: tempList });
      console.log("state variable changed", this.state);
    };

    return (
      <div>
        <h2>please add the todo</h2>
        <input
          style={{
            border: "2px solid #8f00b3",
            borderRadius: "10px",
            height: "30px",
            width: "70%",
            backgroundColor: "#ffccff",
            fontSize: "15px",
            paddingLeft: "15px",
          }}
          type="text"
          onChange={inputHandler}
        />
        <button
          style={{
            backgroundColor: "#8f00b3",
            border: "5px solid #8f00b3",
            borderRadius: "20px",
            color: "white",
            height: "30px",
            margin: "10px",
            fontSize: "15px",
          }}
          onClick={addTodo}
        >
          add todo
        </button>
        <br />
        <div>
          {this.state.list.map((ele, ind) => (
            <div
              key={ind}
              style={{
                display: "flex",
                flexDirection: "row",
                justifyContent: "space-between",
                margin: "20px",
                border: "2px solid #d633ff",
                borderRadius: "20px",
              }}
            >
              <p
                style={{
                  fontSize: "20px",
                  paddingLeft: "30px",
                  margin: "10px",
                }}
              >
                {ele}
              </p>
              <button
                style={{
                  backgroundColor: "#8f00b3",
                  border: "5px solid #8f00b3",
                  borderRadius: "20px",
                  color: "white",
                  height: "30px",
                  margin: "10px",
                }}
                onClick={(e) => removeItem(e, ind)}
              >
                remove
              </button>
            </div>
          ))}
        </div>
      </div>
    );
  }
}

export default Todo;
