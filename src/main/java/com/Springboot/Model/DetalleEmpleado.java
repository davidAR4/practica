package com.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class DetalleEmpleado {
    @Id
    private String direccion;

    private String telefono;

    @OneToOne(mappedBy = "detalleEmpleado")
    private Empleado2 empleado;

}
