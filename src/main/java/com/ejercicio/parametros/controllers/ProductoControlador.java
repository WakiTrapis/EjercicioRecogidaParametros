package com.ejercicio.parametros.controllers;

import com.ejercicio.parametros.Models.Producto;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.math.BigDecimal;

@RestController
@Validated
public class ProductoControlador {

 @GetMapping()
 public ResponseEntity<Page<Producto>>buscarPorNombreYPrecio(

         @RequestParam(required = false) @DecimalMin("25.0")BigDecimal precioMin,
         @RequestParam(required = false) @DecimalMax("10000.0") BigDecimal precioMax,
         @RequestParam(required = false) String nombreProducto,
         @PageableDefault(size = 10) Pageable pageable) {





 }


}
