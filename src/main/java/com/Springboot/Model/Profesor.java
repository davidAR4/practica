package com.Springboot.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;

    private String nombre;

    private String apellido;


    private String edad;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;
}
