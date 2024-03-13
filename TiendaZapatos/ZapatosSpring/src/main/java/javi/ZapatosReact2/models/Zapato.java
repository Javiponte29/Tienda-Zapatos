package javi.ZapatosReact2.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import javi.ZapatosReact2.models.enumerated.Tipo;

@Entity
@Table(name = "zapatos")
public class Zapato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "idModelo")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "idTallaColor")
    private TallaColor talla_color;

    @Column(nullable = false)
    private Double precio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Tipo tipo;

    @Column(nullable = false)
    private String imagen;

    @Column(length = 800)
    private String descripcion;

    @OneToMany( mappedBy = "tallas")
    private List<Talla> tallas;





    public Zapato(Integer id, Marca marca, Modelo modelo, TallaColor talla_color, Double precio, Tipo tipo,
            String imagen, String descripcion, List<Talla> tallas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.talla_color = talla_color;
        this.precio = precio;
        this.tipo = tipo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.tallas = tallas;
    }

    public Zapato() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TallaColor getTalla_color() {
        return talla_color;
    }

    public void setTalla_color(TallaColor talla_color) {
        this.talla_color = talla_color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Zapato [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", talla_color=" + talla_color
                + ", precio=" + precio + ", tipo=" + tipo + ", imagen=" + imagen + ", descripcion=" + descripcion
                + ", tallas=" + tallas + "]";
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Talla> getTallas() {
        return tallas;
    }

    public void setTallas(List<Talla> tallas) {
        this.tallas = tallas;
    }

    
}
