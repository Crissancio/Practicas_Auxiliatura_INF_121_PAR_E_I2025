/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio5;

/**
 *
 * @author WINDOWS 11
 */

public class Aula {
    String nombre;
    int capacidad;
    int nroPupitres;

    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }

    public void mostrar() {
        System.out.println("Aula:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nroPupitres);
    }

    public int cantidadMuebles() {
        return nroPupitres;
    }
}
