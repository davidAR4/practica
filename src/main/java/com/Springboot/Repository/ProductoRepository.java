package com.Springboot.Repository;

import com.Springboot.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    @Query("select p from Producto p where p.nombreProducto = :nombreProducto")
    List<Producto>BuscarPorNombre(@Param("nombre_Producto") String nombreProducto);

    @Query("select p from Producto p where p.precio = :precio")
    List<Producto>buscarPorPrecio(@Param("precio") double precio);
}
