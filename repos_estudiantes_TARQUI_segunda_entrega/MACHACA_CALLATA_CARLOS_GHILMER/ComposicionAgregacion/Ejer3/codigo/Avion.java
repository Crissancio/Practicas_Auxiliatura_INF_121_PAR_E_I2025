package ComposicionAgregacion.Ejer3.codigo;

import java.util.ArrayList;

public class Avion {
    public String modelo;
    public String fabricante;
    public ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<Parte>();
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

    public ArrayList<Parte> getPartes() {
        return partes;
    }
    public void addParte(Parte parte) {
        this.partes.add(parte);
    }

    public void agregarParte(Parte parte) {
        this.partes.add(parte);
    }
    public void mostrar_info() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            System.out.println(parte.toString());
        }
    }

  
}
