package com.example.OrderGatewayApplication.Controller;

import com.example.OrderGatewayApplication.Document.Chat.MensajeSchema;
import com.example.OrderGatewayApplication.Document.Chat.Notificacion;
import com.example.OrderGatewayApplication.Document.Chat.Respuesta;
import com.example.OrderGatewayApplication.Service.Chat.ChatServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ChatController {

    @Autowired
    ChatServiceClient chatServiceClient;

    @PostMapping("/mensaje")
    public Respuesta enviarMensaje(@RequestBody MensajeSchema nuevoMensaje) {

        return chatServiceClient.enviarMensaje(nuevoMensaje);

    }

    @PostMapping("/notificacions")
    public List<MensajeSchema> enviarNotificacion(@RequestBody Notificacion nuevaNotificacion) {

        return chatServiceClient.enviarNotificacion(nuevaNotificacion);

    }

    @PostMapping("/mensajesBase")
    public List<HashMap<String, Object>> obtenerMensajesBase(@RequestBody HashMap<String, Integer> usuarios) {

        return chatServiceClient.obtenerMensajesBase(usuarios);

    }

}
