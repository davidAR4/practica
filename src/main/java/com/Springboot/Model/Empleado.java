package com.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Empleado {
    @Id
    private String nombre;

    private String apellido;

    private int edad;


    @ManyToOne
    @JoinColumn(name = "departamento_id")
     private Departamento departamento;

}
