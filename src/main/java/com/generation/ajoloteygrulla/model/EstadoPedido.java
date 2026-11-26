package com.generation.ajoloteygrulla.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="estado_pedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name="nombre", nullable = false, unique = true, length = 50)
    private String nombre;

    //constructor
    public EstadoPedido(){

    }

    public EstadoPedido(String nombre){
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EstadoPedido{" +
                "id=" + id + ", nombre='" + nombre + "'}";
    }// toString

}
