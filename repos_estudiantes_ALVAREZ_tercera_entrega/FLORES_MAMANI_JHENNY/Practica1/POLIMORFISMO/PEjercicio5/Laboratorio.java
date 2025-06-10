/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio5;

/**
 *
 * @author WINDOWS 11
 */
public class Laboratorio {
    String nombre;
    int capacidad;
    int nroMesas;
    int nroSillas;

    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }

    public void mostrar() {
        System.out.println("Laboratorio:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
}
