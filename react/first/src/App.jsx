import "./App.css";
import AJAXComponent from "./components/AJAXComponent";
import { Footer } from "./components/Footer";
import { Header } from "./components/Header";
import Hooks from "./components/Hooks";
// import { ParentComponent } from "./components/ParentComponent";
import Todo from "./components/Todo";
// import ListMap from "./components/ListMap";
// import CounterClass from "./components/CounterClass";
import { Contact } from "./components/Contact";
import { DemoEventHandler } from "./components/DemoEventHandler";
import CounterNew from "./components/CounterNew";
// import { MyHandlerClass } from "./components/MyHandlerClass";
// import { Welcome } from "./components/Welcome";
import { BrowserRouter, Route, Link, Routes } from "react-router-dom";

const App = () => {
  return (
    <div className="App" style={{ marginBottom: "100px" }}>
      {/* <Contact name={"Student"} age={19} />
      <Contact name={"Teacher"} age={32} />
      <Welcome title={"rahul"} />
      <CounterNew />
      <DemoEventHandler />
      <MyHandlerClass />
      <CounterClass />
      <ListMap />
      <ParentComponent>
        <Todo />
        <br />
        <p>this is inside a ParentComponent element</p>
        <br />
        this is a string value
        <br />
        this is a number {42}
        <br />
        {[<p key="1">child1</p>, <p key="2">child2</p>, <p key="2">child3</p>]}
      </ParentComponent>
      <Hooks />
      <AJAXComponent /> */}
      <BrowserRouter>
        <ul style={{ display: "flex", justifyContent: "space-around" }}>
          <li>
            <Link to="/hooks">Hooks Demo</Link>
          </li>
          <li>
            <Link to="/todos">Todo Demo</Link>
          </li>
          <li>
            <Link to="/axios">Axios Demo</Link>
          </li>
          <li>
            <Link to="/counter">Counter app</Link>
          </li>
          <li>
            <Link to="/event">Event Handler Demo</Link>
          </li>
          <li>
            <Link to="/contact">Contact demo</Link>
          </li>
        </ul>
        <Header />
        <Routes>
          <Route path="/hooks" element={<Hooks />} />
          <Route path="/todos" element={<Todo />} />
          <Route path="/axios" element={<AJAXComponent />} />
          <Route path="/counter" element={<CounterNew />} />
          <Route path="/event" element={<DemoEventHandler />} />
          <Route
            path="/contact"
            element={<Contact name={"Student"} age={19} />}
          />
        </Routes>
      </BrowserRouter>
      <Footer st={{ padding: "0px", margin: "0px" }} />
    </div>
  );
};

export default App;
