package com.ejercicio.parametros.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Producto {

    @Id
    private long id;

    private String nombre;

    private Long precio;


}
