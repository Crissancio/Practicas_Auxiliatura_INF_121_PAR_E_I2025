package Ejercicio2p;


import java.util.ArrayList;

class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String mostrarInfo() {
        return "Parte: " + nombre + ", Peso: " + peso + " kg";
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

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("️ Modelo: " + modelo);
        System.out.println(" Fabricante: " + fabricante);
        System.out.println(" Partes:");
        for (Parte parte : partes) {
            System.out.println("  " + parte.mostrarInfo());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Noemí Chino Blanco");

        Avion avion = new Avion("Amazonas747", "pando");

        avion.agregarParte(new Parte("Motor", 1500));
        avion.agregarParte(new Parte("Alas", 800));
        avion.agregarParte(new Parte(" aterrizaje", 500));

        avion.mostrarAvion();
    }
}

