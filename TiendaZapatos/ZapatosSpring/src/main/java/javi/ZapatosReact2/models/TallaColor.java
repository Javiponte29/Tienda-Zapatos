package javi.ZapatosReact2.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tallacolor")
public class TallaColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer talla;

    @Column(nullable = false, length = 45)
    private String color;

    @Column(nullable = false)
    private Integer stock;

    

    public TallaColor(Integer id, Integer talla, String color, Integer stock) {
        this.id = id;
        this.talla = talla;
        this.color = color;
        this.stock = stock;
    }

    public TallaColor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Talla_Color [id=" + id + ", talla=" + talla + ", color=" + color + ", stock=" + stock + "]";
    }

    
}

