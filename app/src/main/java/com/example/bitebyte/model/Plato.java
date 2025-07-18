package com.example.bitebyte.model;

import java.io.Serializable;

public class Plato implements Serializable {
    private String nombre;
    private String descripcion;
    private double precio;
    private String comentario;

    public Plato() {}

    public Plato(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Plato(String nombre, String descripcion, double precio, String comentario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.comentario = comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
