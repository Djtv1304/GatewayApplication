package com.example.OrderGatewayApplication.Document.RecomendacionProfesores;

public class LikeDislike {

    private String id;
    private String idProfesor;
    private String usuarioEstudiante;
    private boolean like;

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

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}

