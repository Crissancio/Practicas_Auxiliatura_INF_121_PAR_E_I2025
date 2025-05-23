package Ejercicio3;

import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {
        Avion avion1 = new Avion("Boeing 747", "Boeing");
        Parte motor = new Parte("Motor", 4000);
        Parte alas = new Parte("Alas", 15000);
        Parte tren_aterrizaje = new Parte("Tren de Aterrizaje", 3000);

        avion1.agregar_parte(motor);
        avion1.agregar_parte(alas);
        avion1.agregar_parte(tren_aterrizaje);

        avion1.mostrar_avion();
    }
}

class Parte {
    private String nombre;
    private int peso;

    public Parte(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int get_peso() {
        return peso;
    }

    public void set_peso(int peso) {
        this.peso = peso;
    }

    public void mostrar_info() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}

class Avion {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public String get_modelo() {
        return modelo;
    }

    public void set_modelo(String modelo) {
        this.modelo = modelo;
    }

    public String get_fabricante() {
        return fabricante;
    }

    public void set_fabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public ArrayList<Parte> get_partes() {
        return partes;
    }

    public void agregar_parte(Parte parte) {
        partes.add(parte);
    }

    public void mostrar_avion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avión:");
        for (Parte parte : partes) {
            parte.mostrar_info();
        }
    }
}
