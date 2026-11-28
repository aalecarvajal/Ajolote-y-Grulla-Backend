package com.generation.ajoloteygrulla.repository;

import com.generation.ajoloteygrulla.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByCategoriaId(Integer categoriaId);

    List<Producto> findByMarcaId(Integer marcaId);

    List<Producto> findByCategoriaIdAndMarcaId(Integer categoriaId, Integer marcaId);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
