package Ejercicio3;

import java.util.ArrayList;

public class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String mo, String fa) {
        this.modelo = mo;
        this.fabricante = fa;
        this.partes = new ArrayList<>();
    }

    public void agregar_parte(Parte parte) {
        partes.add(parte);
    }

    public void mostrar_avion() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Partes del avion:");
        for (Parte p : partes) {
            p.mostrar_info();
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }
}