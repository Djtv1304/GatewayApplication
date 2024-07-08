package com.example.OrderGatewayApplication.Service.ContratacionPersonal;

import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Tutor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "tutor-service", url = "http://localhost:8092")
public interface TutorServiceClient {

    @GetMapping("/contratacionPersonal/tutorias/all")
    List<Tutor> getAllTutorias();

    @GetMapping("/contratacionPersonal/tutorias/allByUsuario/{usuarioEstudiante}")
    List<Tutor> getTutoriasByUsuario(@PathVariable String usuarioEstudiante);

    @GetMapping("/contratacionPersonal/tutorias/allByUsuario/{usuarioEstudiante}/{estado}")
    List<Tutor> getTutoriasByUsuarioAndEstado(@PathVariable String usuarioEstudiante, @PathVariable String estado);

    @GetMapping("/contratacionPersonal/tutorias/allByProfesor/{idProfesor}")
    List<Tutor> getTutoriasByIdProfesor(@PathVariable String idProfesor);

    @PutMapping("/contratacionPersonal/tutorias/updateByUsuarioAndProfesor/{usuarioEstudiante}/{idProfesor}/{estado}")
    Tutor updateByUsuarioEstudianteAndIdProfesor(@PathVariable String usuarioEstudiante, @PathVariable String idProfesor, @PathVariable String estado);

    @PutMapping("/contratacionPersonal/tutorias/updateTutoriaEstadoById/{idTutoria}/{estado}")
    Tutor updateTutoriaEstadoById(@PathVariable String idTutoria, @PathVariable String estado);

    @PostMapping("/contratacionPersonal/tutorias")
    Tutor saveTutoria(@RequestBody Tutor nuevaTutoria);
}

