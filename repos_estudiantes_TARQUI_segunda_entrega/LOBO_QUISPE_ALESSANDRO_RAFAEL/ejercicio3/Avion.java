
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
        System.out.println("Partes del avion:");
        for (Parte p : partes) {
            p.mostrarInfo();
        }
       }
    }
    