package com.example.OrderGatewayApplication.Controller;

import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Tutor;
import com.example.OrderGatewayApplication.Service.ContratacionPersonal.ProfesorServiceClient;
import com.example.OrderGatewayApplication.Service.ContratacionPersonal.TutorServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ContratacionController {

    @Autowired
    private TutorServiceClient tutorServiceClient;

    @Autowired
    private ProfesorServiceClient contratacionPersonalProfesorServiceClient;

    @GetMapping("/tutoresInformation")
    public Map<String, Object> getTutoresInformation() {

        Map<String, Object> response = new HashMap<>();
        response.put("allTutoresInformation", contratacionPersonalProfesorServiceClient.getAllProfesores());
        response.put("allTutorias", tutorServiceClient.getAllTutorias());

        return response;

    }

    @PostMapping("/contratacionPersonal/tutorias")
    public Tutor saveTutoria(@RequestBody Tutor nuevaTutoria) {

        return tutorServiceClient.saveTutoria(nuevaTutoria);

    }

    @GetMapping("/contratacionPersonal/tutorias/allByUsuario/{usuarioEstudiante}/{estado}")
    public List<Tutor> getTutoriasByUsuarioAndEstado(@PathVariable String usuarioEstudiante, @PathVariable String estado) {
        return tutorServiceClient.getTutoriasByUsuarioAndEstado(usuarioEstudiante, estado);
    }

    @PutMapping("/contratacionPersonal/tutorias/updateTutoriaEstadoById/{idTutoria}/{estado}")
    public Tutor updateTutoriaEstadoById(@PathVariable String idTutoria, @PathVariable String estado) {
        return tutorServiceClient.updateTutoriaEstadoById(idTutoria, estado);
    }

}
