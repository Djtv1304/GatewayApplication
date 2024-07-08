package com.example.OrderGatewayApplication.Document.RecomendacionProfesores;

public class Recomendacion {

    private String id;
    private String idProfesor;
    private String usuarioEstudiante;
    private String motivo;
    private String fecha;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getUsuarioEstudiante() {
        return usuarioEstudiante;
    }

    public void setUsuarioEstudiante(String usuarioEstudiante) {
        this.usuarioEstudiante = usuarioEstudiante;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

