package com.example.lojadecarros.service;


import com.example.lojadecarros.persistence.model.Loja;
import com.example.lojadecarros.persistence.repository.LojaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    private final LojaRepository lojaRepository;

    public LojaService(LojaRepository lojaRepository) {
        this.lojaRepository = lojaRepository;
    }


    public Loja salvar(Loja Loja) {
        return lojaRepository.save(Loja);
    }

    public List<Loja> mostrar() {
        return lojaRepository.findAll();
    }
}
