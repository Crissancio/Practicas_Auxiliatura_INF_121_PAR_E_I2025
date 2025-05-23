package Ejercicio3;

import java.util.ArrayList;

public class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    // a) Constructor y lista partes inicializada
    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    // a) Método agregar_parte
    public void agregarParte(Parte p) {
        partes.add(p);
    }

    // a) Método mostrar_avion
    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte p : partes) {
            p.mostrarInfo();
        }
    }
}
