import './Carrito.css';

import './Carrito.css';
import { useState, useEffect } from 'react';

const Carrito = () => {
    const [cart, setCart] = useState([]);

    useEffect(() => {
        const savedCart = JSON.parse(localStorage.getItem('cart')) || [];
        setCart(savedCart);
    }, []);

    const removeFromCart = (productId) => {
        const updatedCart = cart.filter(item => item.id !== productId);
        setCart(updatedCart);
        localStorage.setItem('cart', JSON.stringify(updatedCart));
    };

    return (
        <div>
            <h1>Carrito de Compras</h1>
            {cart.length === 0 ? (
                <p>El carrito está vacío</p>
            ) : (
                <ul>
                    {cart.map(item => (
                        <li key={item.id}>
                            <div>
                                <img src={item.imagen} alt={item.modelo && item.modelo.nombre} />
                            </div>
                            <div>
                                <h2>{item.marca && item.marca.nombre}</h2>
                                <h3>{item.tipo} {item.modelo && item.modelo.nombre}</h3>
                                <button onClick={() => removeFromCart(item.id)}>Eliminar del carrito</button>
                            </div>
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
};

export default Carrito;