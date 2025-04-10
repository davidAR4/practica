package com.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Empleado2 {

    @Id
    private String nombre;

    private String apellido;

    @OneToOne
    @JoinColumn(name = "detalle_Empleado")
    private DetalleEmpleado detalleEmpleado;
}
