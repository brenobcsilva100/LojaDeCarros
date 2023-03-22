package com.example.lojadecarros.persistence.repository;

import com.example.lojadecarros.persistence.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
