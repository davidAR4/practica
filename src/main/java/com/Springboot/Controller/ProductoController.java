package com.Springboot.Controller;

import com.Springboot.Model.Producto;
import com.Springboot.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public String listarTodo(Model modelo){
        modelo.addAttribute("producto",productoService.listarProductos());
        return "lista";
    }
    @GetMapping("/nombre")
    public String buscarPorNombre(@RequestParam String nombre, Model modelo){
        modelo.addAttribute("producto",productoService.buscarPorNombre(nombre));
        return "lista";
    }
    @GetMapping("/precio")
    public String BuscarPorPrecio(@RequestParam double precio, Model modelo){
        modelo.addAttribute("producto", productoService.buscarPorPrecio(precio));
        return "lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model modelo){
        modelo.addAttribute("crear", new Producto());
        return "nuevoProducto";
    }
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Producto producto)
    {
        productoService.crearProducto(producto);
        return "redirect:/productos/listar";
    }

}
