package com.example.OrderGatewayApplication.Document.Login;

public class User {

    private int id;

    private String usuarioEstudiante;

    private String passwordEstudiante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioEstudiante() {
        return usuarioEstudiante;
    }

    public void setUsuarioEstudiante(String usuarioEstudiante) {
        this.usuarioEstudiante = usuarioEstudiante;
    }

    public String getPasswordEstudiante() {
        return passwordEstudiante;
    }

    public void setPasswordEstudiante(String passwordEstudiante) {
        this.passwordEstudiante = passwordEstudiante;
    }

}
