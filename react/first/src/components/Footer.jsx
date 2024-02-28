import React from "react";

export const Footer = (props) => {
  // let st  ={ padding: "0px", margin: "0px" };
  return (
    <div
      style={{
        position: "fixed",
        bottom: 0,
        width: "100%",
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignContent: "center",
        color: "wheat",
        backgroundColor: "#1a001a",
      }}
    >
      <h1 style={props.st}>Footer</h1>
      <p style={{ padding: "0px", margin: "0px" }}>
        this is the footer components of this webpage
      </p>
    </div>
  );
};
