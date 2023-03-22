package com.example.lojadecarros.controller;

import com.example.lojadecarros.persistence.model.Carro;
import com.example.lojadecarros.persistence.model.Funcionario;
import com.example.lojadecarros.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping("/salvarFuncionario")
    private ResponseEntity<Funcionario> salvarFuncionario(@RequestBody Funcionario funcionario){
        return new ResponseEntity<>(funcionarioService.salvar(funcionario), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarFuncionario")
    private ResponseEntity<?> mostrarFuncionarios (){
        return new ResponseEntity<>(funcionarioService.mostrar(), HttpStatus.OK);
    }
}
