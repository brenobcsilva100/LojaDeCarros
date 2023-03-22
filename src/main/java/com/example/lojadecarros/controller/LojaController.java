package com.example.lojadecarros.controller;

import com.example.lojadecarros.persistence.model.Loja;
import com.example.lojadecarros.service.LojaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LojaController {

    private final LojaService lojaService;

    public LojaController(LojaService lojaService) {
        this.lojaService = lojaService;
    }

    @PostMapping("/salvarLoja")
    private ResponseEntity<Loja> salvarLoja(@RequestBody Loja loja){
        return new ResponseEntity<>(lojaService.salvar(loja), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarLoja")
    private ResponseEntity<?> mostrarLoja (){
        return new ResponseEntity<>(lojaService.mostrar(),
                HttpStatus.OK);
    }
}
