import React from "react";

export const DemoEventHandler = () => {
  function myHandler() {
    console.log("event handler method fired.");
    alert("this is event handler demo.");
  }

  return (
    <div>
      <h1>Event handler using inline function</h1>
      <button onClick={myHandler}>click me!</button>
    </div>
  );
};
