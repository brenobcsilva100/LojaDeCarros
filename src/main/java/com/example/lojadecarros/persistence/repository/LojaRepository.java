package com.example.lojadecarros.persistence.repository;

import com.example.lojadecarros.persistence.model.Carro;
import com.example.lojadecarros.persistence.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {
}
