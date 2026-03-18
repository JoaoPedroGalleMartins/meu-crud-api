package com.example.PrimeiraAPI.repository;

import com.example.PrimeiraAPI.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reposityprodutos extends JpaRepository<Produtos, Integer> {
}
