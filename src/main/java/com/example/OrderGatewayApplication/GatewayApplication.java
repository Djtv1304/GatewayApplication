package com.example.OrderGatewayApplication;

import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Profesor;
import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Tutor;
import com.example.OrderGatewayApplication.Document.RecomendacionProfesores.Evaluacion;
import com.example.OrderGatewayApplication.Service.ContratacionPersonal.ProfesorServiceClient;
import com.example.OrderGatewayApplication.Service.ContratacionPersonal.TutorServiceClient;
import com.example.OrderGatewayApplication.Service.RecomendacionProfesores.EvaluacionServiceClient;
import com.example.OrderGatewayApplication.Service.RecomendacionProfesores.LikeDislikeServiceClient;
import com.example.OrderGatewayApplication.Service.RecomendacionProfesores.ProfesorRecomendacionServiceClient;
import com.example.OrderGatewayApplication.Service.RecomendacionProfesores.RecomendacionServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Autowired
	private EvaluacionServiceClient evaluacionServiceClient;

	@Autowired
	private ProfesorServiceClient contratacionPersonalProfesorServiceClient;

	@Autowired
	private TutorServiceClient tutorServiceClient;

	@Autowired
	private ProfesorRecomendacionServiceClient recomendacionProfesoresProfesorServiceClient;

	@Autowired
	private LikeDislikeServiceClient likeDislikeServiceClient;

	@Autowired
	private RecomendacionServiceClient recomendacionServiceClient;

	@GetMapping("/teachersInformation")
	public Map<String, Object> getTeachersInformation() {

		Map<String, Object> response = new HashMap<>();
		response.put("allTeachersInformation", recomendacionProfesoresProfesorServiceClient.getAllDocentes());
		response.put("allTeachersEvaluation", evaluacionServiceClient.getAllEvaluaciones());
		response.put("allTeacherRecommendation", recomendacionServiceClient.getAllRecomendaciones());

		return response;

	}




	@GetMapping("/contratacionPersonal/profesores/all")
	public List<Profesor> getAllProfesores() {
		return contratacionPersonalProfesorServiceClient.getAllProfesores();
	}

	@PutMapping("/contratacionPersonal/profesores/updateEsTuTorById/{idProfesor}")
	public Profesor updateEsTutorProfesorById(@PathVariable String idProfesor, @RequestBody Boolean esTutor) {
		return contratacionPersonalProfesorServiceClient.updateEsTutorProfesorById(idProfesor, esTutor);
	}

	@GetMapping("/contratacionPersonal/tutorias/allByUsuario/{usuarioEstudiante}")
	public List<Tutor> getTutoriasByUsuario(@PathVariable String usuarioEstudiante) {
		return tutorServiceClient.getTutoriasByUsuario(usuarioEstudiante);
	}

	@GetMapping("/recomendacionProfesores/evaluaciones/all")
	public List<Evaluacion> getAllEvaluaciones() {
		return evaluacionServiceClient.getAllEvaluaciones();
	}

}
