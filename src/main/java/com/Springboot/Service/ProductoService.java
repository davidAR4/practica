package com.Springboot.Service;

import com.Springboot.Model.Producto;
import com.Springboot.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository repo;

    public List<Producto> buscarPorNombre(String nombre){
        return repo.BuscarPorNombre(nombre);
    }

    public List<Producto>buscarPorPrecio(double precio){
        return repo.buscarPorPrecio(precio);
    }
    public List<Producto>listarProductos(){
       return repo.findAll();
    }
    public void crearProducto(Producto producto){
        repo.save(producto);
    }
}
