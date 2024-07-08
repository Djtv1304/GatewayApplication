package com.example.OrderGatewayApplication.Service.RecomendacionProfesores;

import com.example.OrderGatewayApplication.Document.RecomendacionProfesores.Profesor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "profesor-service-recomendacion", url = "http://localhost:8091")
public interface ProfesorRecomendacionServiceClient {

    @GetMapping("/recomendacionProfesores/docentesRecomendados/all")
    List<Profesor> getAllDocentes();

    @PostMapping("/recomendacionProfesores/docentesRecomendados")
    Profesor saveDocente(@RequestBody Profesor profesorNuevo);

    @DeleteMapping("/recomendacionProfesores/docentesRecomendados/deleteById/{profesorId}")
    String deleteDocenteById(@PathVariable String profesorId);

    @PutMapping("/recomendacionProfesores/docentesRecomendados/updateEstadoById/{idProfesor}/{estadoNuevo}")
    Profesor updateEstadoDocenteById(@PathVariable String idProfesor, @PathVariable String estadoNuevo);

    @PutMapping("/recomendacionProfesores/docentesRecomendados/updateEstadoByCorreo")
    Profesor updateEstadoDocenteByCorreo(@RequestBody Map<String, String> body);
}

