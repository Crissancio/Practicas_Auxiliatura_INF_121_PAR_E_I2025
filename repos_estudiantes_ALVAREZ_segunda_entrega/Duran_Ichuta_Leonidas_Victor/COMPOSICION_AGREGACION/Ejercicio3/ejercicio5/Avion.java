package ejercicio5;

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
        System.out.println("Se agrego '" + parte.getNombre() + "' al avion " + modelo);
    }

    public void mostrarAvion() {
        System.out.println("\n=== Avion " + modelo + " ===");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("\nPartes:");
        for (Parte parte : partes) {
            parte.mostrarInfo();
        }
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
}
