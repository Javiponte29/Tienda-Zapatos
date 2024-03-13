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
        const confirmation = window.confirm('¿Estás seguro de que quieres eliminar este producto del carrito?');
        if (confirmation) {
            const updatedCart = cart.filter(item => item.id !== productId);
            setCart(updatedCart);
            localStorage.setItem('cart', JSON.stringify(updatedCart));
        }
    };

    return (
        <div className='cart'>
            {cart.length === 0 ? (
                <h2>Tu carrito está vacío</h2>
            ) : (
                <div className='prod-car'>
                    {cart.map(item => (
                        <div key={item.id}>
                            <div>
                                <img src={item.imagen} alt={item.modelo && item.modelo.nombre} />
                            </div>
                            <div>
                                <p className='pm'>{item.marca && item.marca.nombre}</p>
                                <p>{item.tipo} {item.modelo && item.modelo.nombre}</p>
                                <button onClick={() => removeFromCart(item.id)}>Eliminar del carrito</button>
                            </div>
                        </div>
                    ))}
                </div>
            )}
        </div>
    );
};

export default Carrito;