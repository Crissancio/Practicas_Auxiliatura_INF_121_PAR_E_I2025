package ComposicionyAgregacion.ejercicio3.java;

import java.util.ArrayList;
import java.util.List;

class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    
    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public List<Parte> getPartes() {
        return partes;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void agregarParte(Parte parte) {
        this.partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            parte.mostrarInfo();
        }
    }
}