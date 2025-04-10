package com.Springboot.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estudiante {

    @Id
    private String nombre;

    private int edad;

    @ManyToMany
    @JoinTable
            (name = "datos_proyecto",
            joinColumns = @JoinColumn(name = "estudiante_name"),
            inverseJoinColumns = @JoinColumn(name = "proyecto_name")
    )
    private List<Proyecto> proyectos;

}
