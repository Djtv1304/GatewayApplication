package com.example.OrderGatewayApplication.Document.Chat;

public class Notificacion {
    private int usuario1;
    private int usuario2;

    public Notificacion(int usuario1, int usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    public int getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(int usuario1) {
        this.usuario1 = usuario1;
    }

    public int getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(int usuario2) {
        this.usuario2 = usuario2;
    }

}

