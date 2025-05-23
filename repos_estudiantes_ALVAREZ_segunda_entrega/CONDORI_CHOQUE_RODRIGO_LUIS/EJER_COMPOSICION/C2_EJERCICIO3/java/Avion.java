package C_2;

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

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Avión: " + modelo + ", Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            parte.mostrarInfo();
        }
    }
}
