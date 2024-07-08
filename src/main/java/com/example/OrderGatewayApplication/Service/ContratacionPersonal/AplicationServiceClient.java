package com.example.OrderGatewayApplication.Service.ContratacionPersonal;

import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Aplicacion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "aplicacion-service", url = "http://localhost:8092")
public interface AplicationServiceClient {

    @GetMapping("/contratacionPersonal/aplicaciones/all")
    List<Aplicacion> getAllAplicaciones();

    @GetMapping("/contratacionPersonal/aplicaciones/{idProfesor}")
    List<Aplicacion> getAllByIdProfesor(@PathVariable String idProfesor);

    @GetMapping("/contratacionPersonal/aplicaciones/allByEstado/{estado}")
    List<Aplicacion> getAllByEstado(@PathVariable String estado);

    @PostMapping("/contratacionPersonal/aplicaciones")
    Aplicacion saveAplicacion(@RequestBody Aplicacion nuevaAplicacion);

    @PutMapping("/contratacionPersonal/aplicaciones/updateEstadoAplicacion/{idAplicacion}/{nuevoEstado}")
    Aplicacion updateEstadoAplicacionById(@PathVariable String idAplicacion, @PathVariable String nuevoEstado);

}

