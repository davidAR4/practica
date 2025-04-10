package com.Springboot.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetalleProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idDetalleProducto;

    @Column(name = "descripcion")
    public String descripcion;

    @OneToOne
    @JoinColumn(name = "producto_id")
     private Producto producto;
}
