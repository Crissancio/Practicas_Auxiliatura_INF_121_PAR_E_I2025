
package Ejercicio3;

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

    public void agregar_parte(Parte parte) {
        partes.add(parte);
    }

    public void mostrar_avion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avión:");
        for (Parte p : partes) {
            p.mostrar_info();
        }
    }

    // Getters y Setters
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

    public List<Parte> getPartes() {
        return partes;
    }
}
