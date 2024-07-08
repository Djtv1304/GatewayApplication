package com.example.OrderGatewayApplication.Service.RecomendacionProfesores;

import com.example.OrderGatewayApplication.Document.RecomendacionProfesores.Evaluacion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "evaluacion-service", url = "http://localhost:8091")
public interface EvaluacionServiceClient {

    @GetMapping("/recomendacionProfesores/evaluaciones/all")
    List<Evaluacion> getAllEvaluaciones();

    @GetMapping("/recomendacionProfesores/evaluaciones/evaluacionesByProfesor/{idProfesor}")
    List<Evaluacion> getEvaluacionesByProfesor(@PathVariable String idProfesor);

    @GetMapping("/recomendacionProfesores/evaluaciones/evaluacionesByEstudiante/{usuarioEstudiante}")
    List<Evaluacion> getEvaluacionesByEstudiante(@PathVariable String usuarioEstudiante);

    @GetMapping("/recomendacionProfesores/evaluaciones/evaluacionesByEstrellas/{estrellas}")
    List<Evaluacion> getEvaluacionesByEstrellas(@PathVariable int estrellas);

    @PostMapping("/recomendacionProfesores/evaluaciones")
    Evaluacion saveEvaluacion(@RequestBody Evaluacion evaluacionNueva);

    @DeleteMapping("/recomendacionProfesores/evaluaciones/deleteById/{evaluacionId}")
    String deleteEvaluacionById(@PathVariable String evaluacionId);
}

