package com.example.lojadecarros.service;

import com.example.lojadecarros.persistence.model.Cliente;
import com.example.lojadecarros.persistence.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository ClienteRepository;

    public ClienteService(ClienteRepository ClienteRepository) {
        this.ClienteRepository = ClienteRepository;
    }


    public Cliente salvar(Cliente Cliente) {
        return ClienteRepository.save(Cliente);
    }

    public List<Cliente> mostrar() {
        return ClienteRepository.findAll();
    }

}
