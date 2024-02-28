import React from "react";

export const ParentComponent = (props) => {
  return (
    <div>
      <h2>Parent Component</h2>
      {props.children}
    </div>
  );
};
