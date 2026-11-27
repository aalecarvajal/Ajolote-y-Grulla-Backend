package com.generation.ajoloteygrulla.model;

import jakarta.persistence.*;

@Entity
@Table(name="metodos_pago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name="nombre", nullable = false, unique = true, length = 100)
    private String nombre;

    public MetodoPago(){

    }//constructor vacío

    public MetodoPago(String nombre){
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
        return "MetodoPago{" +
                "id=" + id + ", nombre='" + nombre + "'}";
    }// toString
}//MetodosPago

