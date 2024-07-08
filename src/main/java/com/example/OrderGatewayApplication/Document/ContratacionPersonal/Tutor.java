package com.example.OrderGatewayApplication.Document.ContratacionPersonal;

public class Tutor {

    private String id;
    private String usuarioEstudiante;
    private String idProfesor;
    private String fecha_contratacion;
    private String estado;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioEstudiante() {
        return usuarioEstudiante;
    }

    public void setUsuarioEstudiante(String usuarioEstudiante) {
        this.usuarioEstudiante = usuarioEstudiante;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getFechaContratacion() {
        return fecha_contratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fecha_contratacion = fechaContratacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
