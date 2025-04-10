package com.Springboot.Service;

import com.Springboot.Model.Trabajador;
import com.Springboot.Repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorService {
    @Autowired
    TrabajadorRepository tra;

    public List<Trabajador>buscarPorId(int idTrabajador){
        return tra.buscarPorId(idTrabajador);
    }

    public List<Trabajador>buscarPorNombre(String nombre){
        return tra.buscarPorNombre(nombre);
    }
    public void guardar(Trabajador traba){
        tra.save(traba);
    }
    public List<Trabajador>listarTodo(){
        return tra.findAll();
    }
}
