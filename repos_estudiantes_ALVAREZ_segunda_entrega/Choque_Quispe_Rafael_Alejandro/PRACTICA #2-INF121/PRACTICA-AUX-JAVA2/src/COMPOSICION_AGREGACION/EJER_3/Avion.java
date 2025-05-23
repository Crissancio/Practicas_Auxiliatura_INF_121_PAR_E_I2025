package COMPOSICION_AGREGACION.EJER_3;
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
        System.out.println("=== Avion ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("\n=== Partes del avión ===");
        
        double pesoTotal = 0;
        for (Parte parte : partes) {
            parte.mostrarInfo();
            pesoTotal += parte.getPeso();
            System.out.println("-------------------");
        }
        
        System.out.println("Peso total del avión: " + pesoTotal + " kg");
    }
    public List<Parte> getPartes() {
        return new ArrayList<>(partes);
    }
}