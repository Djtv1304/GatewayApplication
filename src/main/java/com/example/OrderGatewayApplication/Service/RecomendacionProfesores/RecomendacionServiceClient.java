package com.example.OrderGatewayApplication.Service.RecomendacionProfesores;

import com.example.OrderGatewayApplication.Document.RecomendacionProfesores.Recomendacion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "recomendacion-service", url = "http://localhost:8091")
public interface RecomendacionServiceClient {

    @GetMapping("/recomendacionProfesores/recomendaciones/all")
    List<Recomendacion> getAllRecomendaciones();

    @GetMapping("/recomendacionProfesores/recomendaciones/allByIdProfesor/{idProfesor}")
    List<Recomendacion> getAllRecomendacionesByIdProfesor(@PathVariable String idProfesor);

    @GetMapping("/recomendacionProfesores/recomendaciones/allByUsuarioEstudiante/{usuarioEstudiante}")
    List<Recomendacion> getAllRecomendacionesByUsuarioEstudiante(@PathVariable String usuarioEstudiante);

    @PostMapping("/recomendacionProfesores/recomendaciones")
    Recomendacion saveRecomendacion(@RequestBody Recomendacion recomendacionNueva);

    @DeleteMapping("/recomendacionProfesores/recomendaciones/deleteById/{recomendacionId}")
    String deleteRecomendacionById(@PathVariable String recomendacionId);
}

