import './ProductosDetails.css';
import { useAuth } from '../../context/authContext';
import { useEffect, useState } from 'react';
import { useParams, NavLink } from 'react-router-dom';

const ProductosDetails = () => {
    const [producto, setProducto] = useState({});

    const [tallas, setTallas] = useState([]);

    const { id } = useParams();
    //const [loading, setLoading] = useState(false);

    useEffect(() => {
        /*
        fetch(`http://localhost:8080/zapato/{id}`)
        .then(response => response.json())
        .then((result) => {
            setProductos(result);
        });*/
        fetch(`http://localhost:8080/zapato/${id}`)
        .then(response => response.json())
        .then(data => setProducto(data));

        /*fetch(`http://localhost:8080/zapato/tallas`)
        .then(resp => resp.json())
        .then(data => setTallas(data));*/
    }, [id]);

    /*
    if (loading) {
        return <h2>Loading...</h2>
    } else if (
        zapato &&
        Object.keys(zapato).length === 0 &&
        Object.getPrototypeOf(zapato) === Object.prototype
    ) {
        return <h2>No hay zapatos con el id: {zapId}</h2>
    }*/

    return (
        <div>
        <div className='productoin'>
            <div>
                <img src={producto.imagen} alt={producto.modelo && producto.modelo.nombre} />
            </div>
            <div>
                <h2>{producto.marca && producto.marca.nombre}</h2>
                <h3>{producto.tipo} {producto.modelo && producto.modelo.nombre}</h3>
                <h4>Descripción:</h4>
                <p>{producto.descripcion}</p>
                <NavLink to={'carrito'}>Añadir al carrito</NavLink>
            </div>
        </div>
    </div>
    );
};

export default ProductosDetails;