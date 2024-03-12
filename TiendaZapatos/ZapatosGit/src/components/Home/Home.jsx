import { Link, NavLink, useParams } from 'react-router-dom';
import { useAuth } from '../../context/authContext';
import './Home.css';
import { useEffect, useState } from 'react';

const Home = () => {

    //const authContext = useContext(context)
    //const {user} = useAuth();
    //console.log(user);

    //const {user} = useAuth();

    const tipo = useParams().tipo;


    const { id } = useParams();

    const [productos, setProductos] = useState([]);

    const [stock, setStock] = useState([]);

    useEffect(() => {
        fetch(`http://localhost:8080/zapato/list`)
        .then(response => response.json())
        .then((result) => {
            setProductos(result);
        });
        console.log(productos);
/*
        fetch(`http://localhost:8080/stock/list`)
        .then(resp => resp.json())
        .then((resul) => {
            setStock(resul);
        });*/
    }, [])


return (
    <body>
    {/*<h1>Welcome {user.email}</h1>*/}
    <header>
        <h2>Yeezy 500</h2>
    <button><NavLink to={"/zapato"}>Zapatos</NavLink></button>
    </header>
    <main>
        {productos.map(producto =>(
                    <div className='prod-home'>
                        <Link to={`/zapato/${producto.id}`}><img src={producto.imagen} alt={producto.modelo} /></Link>
                        <Link className='btn-h' to={`/zapato/${producto.id}`}>Ver Producto</Link>
                    </div>
        ))}
    </main>
    </body>
)};

export default Home;