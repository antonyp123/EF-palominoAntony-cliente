package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	

}
