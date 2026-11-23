package com.ejercicio.parametros.controllers;

import com.ejercicio.parametros.Models.Producto;
import com.ejercicio.parametros.repository.ProductoRepository;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Validated
public class ProductoControlador {

    private ProductoRepository productoRepository;

 @GetMapping()
 public ResponseEntity<Page<Producto>>buscarPorNombreYPrecio(

         @RequestParam(required = false) @DecimalMin("25.0") BigDecimal precioMin,
         @RequestParam(required = false) @DecimalMax("10000.0") BigDecimal precioMax,
         @RequestParam(required = false) String nombreProducto,
         Pageable pageable
         ){
        return ResponseEntity.ok(productoRepository.findByNombreContainingIgnoreCaseAndPrecioBetween(nombreProducto, precioMin, precioMax, pageable));


 }


}
