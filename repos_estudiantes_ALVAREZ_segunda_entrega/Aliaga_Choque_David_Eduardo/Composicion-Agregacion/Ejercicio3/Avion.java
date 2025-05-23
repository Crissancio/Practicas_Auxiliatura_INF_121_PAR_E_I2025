package Ejercicio3;

import java.util.ArrayList;

public class Avion {
    public String modelo;
    public String fabricante;
    public ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Modelo del avion: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avion:");
        for (Parte parte : partes) {
            parte.mostrarInfo();
        }
    }

    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing");

        Parte parte1 = new Parte("Motor", 2000);
        Parte parte2 = new Parte("Alas", 1500);
        Parte parte3 = new Parte("Tren de aterrizaje", 800);
        Parte parte4 = new Parte("Cabina", 1200);

        avion.agregarParte(parte1);
        avion.agregarParte(parte2);
        avion.agregarParte(parte3);
        avion.agregarParte(parte4);

        avion.mostrarAvion();
    }

    
}
