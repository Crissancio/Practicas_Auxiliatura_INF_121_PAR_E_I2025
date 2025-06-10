import java.util.ArrayList;

class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
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

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrarAvion() {
        System.out.println("Avión modelo: " + modelo + ", Fabricante: " + fabricante);
        for (Parte p : partes) {
            System.out.println(p.mostrarInfo());
        }
    }
}
// SIN GETTERS NI SETTERS
class TestAvion {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing Co.");
        avion.agregarParte(new Parte("Motor", 3000));
        avion.agregarParte(new Parte("Ala Izquierda", 1500));
        avion.agregarParte(new Parte("Tren de Aterrizaje", 800));

        avion.mostrarAvion();
    }
}