package com.example.lojadecarros.persistence.repository;

import com.example.lojadecarros.persistence.model.Cliente;
import com.example.lojadecarros.persistence.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
