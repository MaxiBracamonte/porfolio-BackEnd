
package com.portfolioweb.proyectointegrador.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;    
    private String nombre;
    private String email;
    private String titulo;
    private String descripcion;
    private String imageURL;

    public Usuario() {
    }
        
    public Usuario(Long id, String nombre, String email, String titulo, String descripcion, String imageURL) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imageURL = imageURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    
     /*
    @Override
    public String toString(){
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", titulo='" + titulo + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
    */
    
}

