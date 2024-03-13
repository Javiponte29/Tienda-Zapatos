import './ProductosDetails.css';
import { useAuth } from '../../context/authContext';
import { useEffect, useState } from 'react';
import { useParams, NavLink, Link} from 'react-router-dom';

const ProductosDetails = () => {
    const [producto, setProducto] = useState({});

    const [tallas, setTallas] = useState([]);

    const { id } = useParams();

    const {user} = useAuth();

    const [productoAñadido, setProductoAñadido] = useState(false);

    useEffect(() => {

        fetch(`http://localhost:8080/zapato/${id}`)
        .then(response => response.json())
        .then(data => setProducto(data));
    }, [id]);

    const addToCart = () => {
        const existingCart = JSON.parse(localStorage.getItem('cart')) || [];
        const updatedCart = [...existingCart, producto];
        localStorage.setItem('cart', JSON.stringify(updatedCart));
        setProductoAñadido(true);
    };

    setTimeout(() => {
        setProductoAñadido(false);
    }, 2000);


    return (
        <div>
            
            <div className='productoin'>
            <div>
                <img src={producto.imagen} alt={producto.modelo && producto.modelo.nombre} />
            </div>
            <div>
                <h2>{producto.marca && producto.marca.nombre}</h2>
                    <h3>{producto.tipo} {producto.modelo && producto.modelo.nombre}</h3>
                    <h4>Talla: {producto.talla_color && producto.talla_color.talla}</h4>
                    <h4>Stock: {producto.talla_color && producto.talla_color.stock}</h4>
                <h4>Color: {producto.talla_color && producto.talla_color.color}</h4>
                <h4>Descripción:</h4>
                <p>{producto.descripcion}</p>
                <button onClick={addToCart}>Añadir al carrito</button>
                {productoAñadido && <h5 className='prodAdd'>Producto añadido</h5>}
            </div>
        </div>
    </div>
    );
};

export default ProductosDetails;