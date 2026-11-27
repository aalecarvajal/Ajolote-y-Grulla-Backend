package com.generation.ajoloteygrulla.model;

import jakarta.persistence.*;


@Entity
@Table(name="estado_pedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name="nombre", nullable = false, unique = true, length = 50)
    private String nombre;


    public EstadoPedido(){

    }//constructor vacío

    public EstadoPedido(String nombre){
        this.nombre = nombre;
    }//constructor sobrecargado

    public Integer getId() {
        return id;
    }//getId

    public String getNombre() {
        return nombre;
    }//getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre

    @Override
    public String toString() {
        return "EstadoPedido{" +
                "id=" + id + ", nombre='" + nombre + "'}";
    }// toString

}//EstadoPedido
