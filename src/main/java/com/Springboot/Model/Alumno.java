package com.Springboot.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;

    private String nombre;

    private String apellido;


    private String edad;

    @OneToMany(mappedBy = "alumno")
    private List<Profesor> profesor;
}

