import React from "react";

export const Footer = () => {
  return (
    <div>
      <footer
        style={{
          display: "flex",
          flexDirection: "column",
          backgroundColor: "#2b3035",
          color: "white",
          padding: "10px",
        }}
      >
        <span>All rights reserved. @rahuCompany 2024</span>
        <span>Code licensed MIT, docs CC BY 3.0.</span>
      </footer>
    </div>
  );
};
