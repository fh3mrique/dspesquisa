import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import Header from "./components/Header";
import Records from "./pages/Records";

const Rotas = () => {
  return (
    <BrowserRouter>
    <Header/>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/records" element={<Records />} />
      </Routes>
    </BrowserRouter>
  );
}

export default Rotas;