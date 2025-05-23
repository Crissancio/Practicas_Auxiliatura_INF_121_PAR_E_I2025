package Herencia;
import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<Coche> coches = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();

        coches.add(new Coche("Toyota", "Corolla", 2025, 15000, 4, "Gasolina"));
        coches.add(new Coche("Ford", "Mondeo", 2023, 18000, 5, "Diesel"));
        motos.add(new Moto("Yamaha", "R3", 2025, 8000, 321, "2T"));
        mostrarVehiculos(coches, motos);
        Coche4Puertas(coches);
    }
    public static void mostrarVehiculos(List<Coche> coches, List<Moto> motos) {
        System.out.println("COCHES Y MOTOS - Gestión 2025");
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getAño() == 2025) {
                coches.get(i).mostrarInfo();
            }
        }
        for (int i = 0; i < motos.size(); i++) {
            if (motos.get(i).getAño() == 2025) {
                motos.get(i).mostrarInfo();
            }
        }
    }
    public static void Coche4Puertas(List<Coche> coches) {
        System.out.println("\nCOCHES CON MÁS DE 4 PUERTAS:");
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getNumPuertas() > 4) {
                coches.get(i).mostrarInfo();
            }
        }
    }
}