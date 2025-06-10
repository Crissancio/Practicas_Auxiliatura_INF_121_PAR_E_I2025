/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio3;

/**
 *
 * @author WINDOWS 11
 */
public class Administrativo {
    private String nombre;
    private int sueldoMes;
    private int diasExtras;
    private int pagoPorDia;

    public Administrativo(String nombre, int sueldoMes, int diasExtras, int pagoPorDia) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.diasExtras = diasExtras;
        this.pagoPorDia = pagoPorDia;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoMes);
        System.out.println("Días extra trabajados: " + diasExtras);
        System.out.println("Pago por día extra: " + pagoPorDia);
    }

    public void mostrar(boolean conTotal) {
        if (conTotal) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo total: " + calcularSueldo(true));
        } else {
            mostrar();
        }
    }

    public int calcularSueldo() {
        return sueldoMes + (diasExtras * pagoPorDia);
    }

    public int calcularSueldo(boolean incluirExtras) {
        if (incluirExtras) {
            return sueldoMes + (diasExtras * pagoPorDia);
        } else {
            return sueldoMes;
        }
    }
}

