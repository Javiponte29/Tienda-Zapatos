package javi.ZapatosReact2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tallas")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idzapatos")
    private Zapato zapato;

    @Column(nullable = false)
    private Integer tallas;

    public Talla() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }

    public Integer getTallas() {
        return tallas;
    }

    public void setTallas(Integer tallas) {
        this.tallas = tallas;
    }

    @Override
    public String toString() {
        return "Talla [id=" + id + ", zapato=" + zapato + ", tallas=" + tallas + "]";
    }

    public Talla(Integer id, Zapato zapato, Integer tallas) {
        this.id = id;
        this.zapato = zapato;
        this.tallas = tallas;
    }

    
}
