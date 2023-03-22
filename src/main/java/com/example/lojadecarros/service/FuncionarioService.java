package com.example.lojadecarros.service;

import com.example.lojadecarros.persistence.model.Carro;
import com.example.lojadecarros.persistence.model.Funcionario;
import com.example.lojadecarros.persistence.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }


    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> mostrar() {
        return funcionarioRepository.findAll();
    }

}
