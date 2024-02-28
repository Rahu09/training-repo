import React from "react";

export const Contact = (props) => {
  console.log(typeof props);
  console.log(props);
  console.log(typeof props.name);
  console.log(typeof props.age);

  return (
    <>
      <h1>{props.name.toUpperCase()} form</h1>
      <label htmlFor="email">Email</label>
      <br />
      <input className="message" name="email" type="text" />
      <br />

      <label htmlFor="message">Message</label>
      <br />
      <textarea
        className="message"
        name="message"
        id="message"
        cols="50"
        rows="10"
      ></textarea>
      <br />
      <button>submit</button>
      <hr />
    </>
  );
};
