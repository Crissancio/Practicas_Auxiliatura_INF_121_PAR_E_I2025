package Ejercicio2;

import java.util.ArrayList;

public class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public void agregarParte(String nombre, double peso) {
        Parte parte = new Parte(nombre, peso);
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
        System.out.println("Información de las Partes:");
        for (Parte parte : partes) {
            parte.mostrar_info();
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
