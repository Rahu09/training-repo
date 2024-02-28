import React from "react";

var count = 0;
export const Counter = () => {
  count++;
  return <div>Variable Counter: {count}</div>;
};
