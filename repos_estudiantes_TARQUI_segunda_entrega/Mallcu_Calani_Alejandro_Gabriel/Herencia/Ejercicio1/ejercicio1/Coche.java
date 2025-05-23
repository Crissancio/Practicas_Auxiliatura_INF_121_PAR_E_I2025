/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase); // Llama al constructor de Vehiculo
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters
    public int getNumPuertas() {
        return numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    // Setters
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String mostrarInfo() {
        return String.format("%s, Número de Puertas: %d, Tipo de Combustible: %s",
                             super.mostrarInfo(), this.numPuertas, this.tipoCombustible);
    }
}