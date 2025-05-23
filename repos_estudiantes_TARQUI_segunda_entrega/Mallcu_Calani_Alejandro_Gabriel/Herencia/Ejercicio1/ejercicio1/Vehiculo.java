/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author USUARIO
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String mostrarInfo() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US); // Para formato $NN,NNN.NN
        return String.format("Marca: %s, Modelo: %s, Año: %d, Precio Base: %s",
                             this.marca, this.modelo, this.anio, currencyFormatter.format(this.precioBase));
    }
}