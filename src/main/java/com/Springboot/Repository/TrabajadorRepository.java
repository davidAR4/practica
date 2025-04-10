package com.Springboot.Repository;

import com.Springboot.Model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {
    @Query("select e from Trabajador e where e.id = :id")
    List<Trabajador>buscarPorId(@Param("id") int id);

    @Query("select e from Trabajador e where e.nombre = :nombre")
    List<Trabajador>buscarPorNombre(@Param("nombre")String nombre);
}
