import { useEffect, useState } from 'react';
import './Productos.css';
import { Link, NavLink, useLocation, useParams, useSearchParams } from 'react-router-dom';
import { Firestore, collection, doc, getDoc, getDocs, getFirestore } from 'firebase/firestore';
import { db } from '../../firebase/config';
import { useAuth } from '../../context/authContext';

const Productos = () => {

    //const {user} = useAuth();

    
    const [productos, setProductos] = useState([]);

    const [titulo, setTitulo] = useState("Zapatos");

    const tipo = useParams().tipo;


    const { id } = useParams();
    /*
    const [searchParams] = useSearchParams();

    const id = +searchParams.get('id');*/
/*
    useEffect(() => {

        const productosRef = collection(db, "Zapatos");

        getDocs(productosRef).then((resp) => {

            console.log(
                resp.docs.map((doc) => {
                    return { ...doc.data(), id: doc.id }
                })
            )
        })

    }, [tipo]);*/

    //const [producto, setProducto] = useState([]);

    //const {prod} = useParams();

    useEffect(() => {
        fetch(`http://localhost:8080/zapato/list`)
        .then(response => response.json())
        .then((result) => {
            setProductos(result);
        });
        console.log(productos);
    }, [])

    return (
        <div className='listar'>
            {/*<h1>Welcome {user.emial}</h1>
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Precio</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                <tbody>
                    {productos.map(producto =>(
                        <tr key={producto.id}>
                            <td>{producto.id}</td>
                            <td>{producto.marca.nombre}</td>
                            <td>{producto.modelo.nombre}</td>
                            <td>{producto.precio}</td>
                            <td>{producto.tipo}</td>
                        </tr>
                    ))}
                </tbody>
            </table>*/}
            {productos.map(producto =>(
                        <div className='productos' key={producto.id}>
                                <div className='nombre'>
                                    <div>
                                    <Link to={`/zapato/${producto.id}`}><img src={producto.imagen} alt={producto.modelo.nombre} /></Link>
                                    </div>
                                    <div className='mp'>
                                        <div className='marca'>
                                            <h3>{producto.marca.nombre}  {producto.modelo.nombre}</h3>
                                            <h3></h3>
                                        </div>
                                        <div>
                                            <h4>{producto.precio}€</h4>
                                        </div>
                                    </div>
                                </div>
                                {/*<NavLink to={`/zapato/${id}`}>Ver</NavLink>*/}
                                <Link className='detail-btn' to={`/zapato/${producto.id}`}>Ver</Link>
                        </div>
                        
                    ))}
            
        </div>
    );
};

export default Productos;