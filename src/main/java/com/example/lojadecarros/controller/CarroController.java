package com.example.lojadecarros.controller;

import com.example.lojadecarros.persistence.model.Carro;
import com.example.lojadecarros.service.CarroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @PostMapping("/salvarCarro")
    private ResponseEntity<Carro> salvarCarros(@RequestBody Carro carro){
        return new ResponseEntity<>(carroService.salvar(carro), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarCarro")
    private ResponseEntity<?> mostrarCarros (){
        return new ResponseEntity<>(carroService.mostrar(), HttpStatus.OK);
    }
}
