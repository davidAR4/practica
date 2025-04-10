package com.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Proyecto {
@Id
    private String nombre;
    private String descripcion;

    @ManyToMany(mappedBy = "proyectos")
    private List<Estudiante> estudiantes;
}
