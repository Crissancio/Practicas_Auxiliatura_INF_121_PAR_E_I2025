package Herencia;
import java.util.ArrayList;

public class AppCoche {

    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<>();
        ArrayList<Moto> listaMotos = new ArrayList<>();

        Coche c1 = new Coche("Toyota", "Corolla", 2023, 15000, 4, "Gasolina");
        Coche c2 = new Coche("Ford", "Focus", 2025, 18000, 5, "Diesel");
        Moto m1 = new Moto("Yamaha", "R1", 2025, 12000, "1000cc", "4 tiempos");
        Moto m2 = new Moto("Honda", "CBR500", 2023, 9000, "500cc", "2 tiempos");

        listaCoches.add(c1);
        listaCoches.add(c2);
        listaMotos.add(m1);
        listaMotos.add(m2);

        mostrarCochesConMasDe4Puertas(listaCoches);
        mostrarMotosDel2025(listaMotos);
    }

    public static void mostrarCochesConMasDe4Puertas(ArrayList<Coche> lista) {
        System.out.println("=== COCHES CON MÁS DE 4 PUERTAS ===");
        for (Coche c : lista) {
            if (c.getNumerodepuertas() > 4) {
                System.out.println(c.mostrar_info());
            }
        }
    }

    public static void mostrarMotosDel2025(ArrayList<Moto> lista) {
        System.out.println("=== MOTOS DEL AÑO 2025 ===");
        for (Moto m : lista) {
            if (m.getAño() == 2025) {
                System.out.println(m.mostrar_info());
            }
        }
    }
}
