package com.example.lojadecarros.controller;

import com.example.lojadecarros.persistence.model.Cliente;
import com.example.lojadecarros.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private final ClienteService ClienteService;

    public ClienteController(ClienteService ClienteService) {
        this.ClienteService = ClienteService;
    }

    @PostMapping("/salvarCliente")
    private ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente Cliente){
        return new ResponseEntity<>(ClienteService.salvar(Cliente), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarCliente")
    private ResponseEntity<?> mostrarClientes (){
        return new ResponseEntity<>(ClienteService.mostrar(), HttpStatus.OK);
    }
}
