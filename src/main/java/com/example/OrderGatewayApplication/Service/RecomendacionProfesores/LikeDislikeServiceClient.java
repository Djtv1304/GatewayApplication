package com.example.OrderGatewayApplication.Service.RecomendacionProfesores;

import com.example.OrderGatewayApplication.Document.RecomendacionProfesores.LikeDislike;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "likeDislike-service", url = "http://localhost:8091")
public interface LikeDislikeServiceClient {

    @GetMapping("/recomendacionProfesores/likesDislikes/allByIdProfesor/{idProfesor}")
    List<LikeDislike> getAllLikesDislikesByIdProfesor(@PathVariable String idProfesor);

    @GetMapping("/recomendacionProfesores/likesDislikes/allByUsuarioEstudiante/{usuarioEstudiante}")
    List<LikeDislike> getAllLikesDislikesByUsuarioEstudiante(@PathVariable String usuarioEstudiante);

    @PostMapping("/recomendacionProfesores/likesDislikes")
    LikeDislike saveLikeDislike(@RequestBody LikeDislike likeDislike);

    @DeleteMapping("/recomendacionProfesores/likesDislikes/deleteById/{likeDislikeId}")
    String deleteLikeDislikeById(@PathVariable String likeDislikeId);
}

