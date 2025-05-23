/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;

// Clase Parte
class Parte {
    private String nombre;
    private int peso;

    public Parte(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String mostrarInfo() {
        return "- " + nombre + ": " + peso + " kg";
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }
}

// Clase Avion
class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            System.out.println(parte.mostrarInfo());
        }
    }
}

// Clase principal con el método main
public class Practica {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");

        avion.agregarParte(new Parte("Motor", 3000));
        avion.agregarParte(new Parte("Ala Izquierda", 1500));
        avion.agregarParte(new Parte("Ala Derecha", 1500));
        avion.agregarParte(new Parte("Tren de Aterrizaje", 1200));

        avion.mostrarAvion();
    }
}
