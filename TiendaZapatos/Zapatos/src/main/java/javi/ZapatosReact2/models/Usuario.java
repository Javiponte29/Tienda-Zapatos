package javi.ZapatosReact2.models;


import java.security.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String nombre;

    @Column(nullable = false, length = 45)
    private String apellidos;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(nullable = false)
    private Timestamp fechaNac;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(name = "carrito",
                joinColumns = @JoinColumn(name = "idusuarios"),
                inverseJoinColumns = @JoinColumn(name = "idZapatos"))
    private List<Zapato> zapatos;

    

    public Usuario(Integer id, String nombre, String apellidos, String email, Timestamp fechaNac, String password,
            List<Zapato> zapatos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNac = fechaNac;
        this.password = password;
        this.zapatos = zapatos;
    }

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Timestamp fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
                + ", fechaNac=" + fechaNac + ", password=" + password + "]";
    }

    public List<Zapato> getZapatos() {
        return zapatos;
    }

    public void setZapatos(List<Zapato> zapatos) {
        this.zapatos = zapatos;
    }

    
}
