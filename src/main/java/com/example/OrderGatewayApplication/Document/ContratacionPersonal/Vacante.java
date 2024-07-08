package com.example.OrderGatewayApplication.Document.ContratacionPersonal;


import java.util.List;

public class Vacante {

    private String id;

    private String titulo;
    private String descripcion;
    private List<String> requisitos;
    private String fecha_publicacion;
    private String estado;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public String getFechaPublicacion() {
        return fecha_publicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fecha_publicacion = fechaPublicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

