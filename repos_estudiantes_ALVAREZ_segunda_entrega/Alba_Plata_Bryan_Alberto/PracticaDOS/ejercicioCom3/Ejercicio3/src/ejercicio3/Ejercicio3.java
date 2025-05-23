/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Usuario
 */
import java.util.*;

class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void mostrar_info() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}

class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        partes = new ArrayList<>();
    }

    public void agregar_parte(Parte p) {
        partes.add(p);
    }

    public void mostrar_avion() {
        System.out.println("Avión Modelo: " + modelo + ", Fabricante: " + fabricante);
        for (Parte p : partes) {
            p.mostrar_info();
        }
    }
}
public class Ejercicio3 {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing");
        avion.agregar_parte(new Parte("Motor", 1500));
        avion.agregar_parte(new Parte("Ala izquierda", 500));
        avion.agregar_parte(new Parte("Tren de aterrizaje", 800));
        avion.mostrar_avion();
    }
    
}
