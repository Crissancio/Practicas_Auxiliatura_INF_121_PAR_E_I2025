/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionComp;
import java.util.ArrayList;
/**
 *
 * @author Renzo
 */
public class Avion {
   private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // Método para agregar una parte
    public void agregarParte(Parte parte) {
        if (parte != null) {
            partes.add(parte);
        }
    }

    // Método para mostrar información del avión
    public void mostrarAvion() {
        System.out.println("Modelo del avión: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avión:");
        for (Parte p : partes) {
            p.mostrarInfo();
        }
    }
}

