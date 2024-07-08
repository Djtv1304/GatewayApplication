package com.example.OrderGatewayApplication.Service.ContratacionPersonal;

import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Profesor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "profesor-service-contratacion", url = "http://localhost:8092")
public interface ProfesorServiceClient {

    @GetMapping("/contratacionPersonal/profesores/all")
    List<Profesor> getAllProfesores();

    @PostMapping("/contratacionPersonal/profesores")
    Profesor saveProfesor(@RequestBody Profesor profesorNuevo);

    @DeleteMapping("/contratacionPersonal/profesores/deleteByProfesor")
    String deleteProfesor(@RequestBody Profesor profesorParaEliminar);

    @DeleteMapping("/contratacionPersonal/profesores/deleteByProfesorId/{profesorId}")
    String deleteProfesorById(@PathVariable String profesorId);

    @PutMapping("/contratacionPersonal/profesores/updateEstadoById/{idProfesor}/{estadoNuevo}")
    Profesor updateEstadoProfesorById(@PathVariable String idProfesor, @PathVariable String estadoNuevo);

    @PutMapping("/contratacionPersonal/profesores/updateEsTutorById/{idProfesor}")
    Profesor updateEsTutorProfesorById(@PathVariable String idProfesor, @RequestBody Boolean esTutor);

    @PutMapping("/contratacionPersonal/profesores/updateEstadoByCorreo")
    Profesor updateEstadoProfesorByCorreo(@RequestBody Map<String, String> body);

    @PutMapping("/contratacionPersonal/profesores/updateEsTutorByCorreo")
    Profesor updateEsTutorProfesorByCorreo(@RequestBody Map<String, Object> body);

}
