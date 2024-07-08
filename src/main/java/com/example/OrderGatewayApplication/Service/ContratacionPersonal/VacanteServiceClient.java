package com.example.OrderGatewayApplication.Service.ContratacionPersonal;

import com.example.OrderGatewayApplication.Document.ContratacionPersonal.Vacante;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "vacante-service", url = "http://localhost:8092")
public interface VacanteServiceClient {

    @GetMapping("/contratacionPersonal/vacante/all")
    List<Vacante> getAllVacantes();

    @GetMapping("/contratacionPersonal/vacante/{vacanteId}")
    Optional<Vacante> getVacanteById(@PathVariable String vacanteId);

    @PostMapping("/contratacionPersonal/vacante")
    Vacante saveVacante(@RequestBody Vacante vacanteNueva);

    @DeleteMapping("/contratacionPersonal/vacante/{vacanteIdToDelete}")
    String deleteVacanteById(@PathVariable String vacanteIdToDelete);
}

