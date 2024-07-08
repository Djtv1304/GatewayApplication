package com.example.OrderGatewayApplication.Document.Chat;

import java.util.Date;

public class MensajeSchema {
    private int usuario1;
    private int usuario2;
    private String mensaje;
    private Date fecha;

    public MensajeSchema(int usuario1, int usuario2, String mensaje) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.mensaje = mensaje;
        this.fecha = new Date();
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
