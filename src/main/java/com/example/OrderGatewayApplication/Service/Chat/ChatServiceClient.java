package com.example.OrderGatewayApplication.Service.Chat;

import com.example.OrderGatewayApplication.Document.Chat.MensajeSchema;
import com.example.OrderGatewayApplication.Document.Chat.Notificacion;
import com.example.OrderGatewayApplication.Document.Chat.Respuesta;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

@FeignClient(name = "chat-service", url = "http://localhost:8080")
public interface ChatServiceClient {

    @PostMapping("/mensaje")
    Respuesta enviarMensaje(@RequestBody MensajeSchema nuevoMensaje);

    @PostMapping("/notificacions")
    List<MensajeSchema> enviarNotificacion(@RequestBody Notificacion nuevaNotificacion);

    @PostMapping("/mensajesBase")
    List<HashMap<String, Object>> obtenerMensajesBase(@RequestBody HashMap<String, Integer> usuarios);


}
