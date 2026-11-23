package com.ejercicio.parametros.repository;

import com.ejercicio.parametros.Models.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;

public interface ProductoRepository extends JpaSpecificationExecutor<Producto> {


    Page<Producto> findByNombreContainingIgnoreCaseAndPrecioBetween(String nombre, BigDecimal precioMin, BigDecimal precioMax, Pageable pageable);
}
