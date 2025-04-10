package com.Springboot.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nombre", length = 30, nullable = false)
    public String nombre;

    @Column(name = "apellido", length = 30, nullable = false)
    public String apellido;

    @Column(name = "correo", length = 30, nullable = false)
    public String correo;

}
