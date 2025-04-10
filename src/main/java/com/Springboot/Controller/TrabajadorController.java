package com.Springboot.Controller;


import com.Springboot.Model.Trabajador;
import com.Springboot.Service.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/trabajador")
public class TrabajadorController {
    @Autowired
    TrabajadorService service;

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("trabajador", service.listarTodo());
        return "Trabajador";
    }
    @GetMapping("/buscar")
    public String buscar(@RequestParam int id, Model model){
        model.addAttribute("trabajador", service.buscarPorId(id));
        return "Trabajador";
    }
    @GetMapping("/nombre")
    public String buscarPorNombre(@RequestParam String nombre, Model modelo){
        modelo.addAttribute("trabajador", service.buscarPorNombre(nombre));
        return "Trabajador";
    }
    @GetMapping("/nuevo")
    public String nuevo(Model modelo){
    modelo.addAttribute("crear", new Trabajador());
    return "nuevo";
    }
    @PostMapping("/guardar")
    public String crear(Trabajador trabajador){
        service.guardar(trabajador);
        return "redirect:/trabajador/listar";
    }
}
