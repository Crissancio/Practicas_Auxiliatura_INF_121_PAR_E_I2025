/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase); // Llama al constructor de Vehiculo
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // Getters
    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    // Setters
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String mostrarInfo() {
        return String.format("%s, Cilindrada: %dcc, Tipo de Motor: %s",
                             super.mostrarInfo(), this.cilindrada, this.tipoMotor);
    }
}