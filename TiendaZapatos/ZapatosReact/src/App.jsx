import './App.css'
import { Routes, Route, Navigate } from 'react-router-dom'
import Home from './components/Home/Home'
import Login from './components/Login/Login';
import AuthProvider from './context/authContext';
import Register from './components/Register/Register';
import NavBar from './components/NavBar/NavBar';
import Productos from './components/Productos/Productos';
import Footer from './components/Footer/Footer';
import Carrito from './components/Carrito/Carrito';
import ProductosDetails from './components/ProductosDetails/index';
import { useEffect, useState } from 'react';


function App() {

  const [productos, setProductos] = useState([]);
  useEffect(() => {
      fetch('http://localhost:8080/zapato/list').
      then(response => response.json()).
      then(data => setPosts(data));
  })

  

  return (
    <div>
    <AuthProvider>
      <NavBar/>
    <Routes>
      <Route path='/' element={<Navigate to={"/home"}/>} />
      <Route path='/home' element={<Home productos={productos.slice(0,5)} />}/>
      <Route path='/zapato' element={<Productos />}/>
      <Route path='/zapato/:id' element={<ProductosDetails />} />
      <Route path='/login' element={<Login />}/>
      <Route path='/register' element={<Register />}/>
      <Route path='/carrito' element={<Carrito />} />
    </Routes>
    <Footer />
    </AuthProvider>
    </div>
  );
}

export default App;
