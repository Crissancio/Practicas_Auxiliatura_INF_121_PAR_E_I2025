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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarInfo() {
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

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("\nAvión: " + modelo + " | Fabricante: " + fabricante);
        if (partes.isEmpty()) {
            System.out.println("Sin partes registradas.");
        } else {
            for (Parte p : partes) {
                p.mostrarInfo();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing");
        avion.agregarParte(new Parte("Motor", 1500));
        avion.agregarParte(new Parte("Alas", 800));
        avion.agregarParte(new Parte("Tren de aterrizaje", 300));
        avion.mostrarAvion();
    }
}
