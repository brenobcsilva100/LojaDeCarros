package com.example.lojadecarros.service;

import com.example.lojadecarros.persistence.model.Carro;
import com.example.lojadecarros.persistence.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro salvar(Carro carro) {
        return carroRepository.save(carro);
    }

    public List<Carro> mostrar() {
        return carroRepository.findAll();
    }
}
