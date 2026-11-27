package com.generation.ajoloteygrulla.repository;

import com.generation.ajoloteygrulla.model.MetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago, Integer>{
    Optional<MetodoPago> findByNombre(String nombre);
}
