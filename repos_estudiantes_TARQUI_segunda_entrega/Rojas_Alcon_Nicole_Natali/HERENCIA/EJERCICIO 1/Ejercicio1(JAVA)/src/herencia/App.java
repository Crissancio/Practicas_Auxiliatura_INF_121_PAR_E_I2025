package herencia;

public class App {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2023, 22000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "F-150", 2023, 35000, 4, "Gasolina/Diesel");
        Coche coche3 = new Coche("Tesla", "Model Y Standard Range", 2025, 60000, 5, "Electrico");
        Moto moto1 = new Moto("Yamaha", "R3", 2020, 5500, 321, "4 tiempos refrigerado por líquido");
        Moto moto2 = new Moto("Honda", "TMX Supremo", 2025, 1400, 150, "4 tiempos, refrigerado por aire");

        System.out.println("--------COCHE 1--------" + coche1.mostrarInfo());
        System.out.println("--------COCHE 2--------" + coche2.mostrarInfo());
        System.out.println("--------COCHE 3--------" + coche3.mostrarInfo());
        System.out.println("--------MOTO 1--------" + moto1.mostrarInfo());
        System.out.println("--------MOTO 2--------" + moto2.mostrarInfo());

        Coche[] coches = {coche1, coche2, coche3};
        System.out.println("______________________________");
        System.out.println("\nCOCHES CON MAS DE 4 PUERTAS");
        System.out.println("______________________________");
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                System.out.println(coche.mostrarInfo());
            }
        }

        Vehiculo[] vehiculos = {coche1, coche2, coche3, moto1, moto2};
        System.out.println("__________________________");
        System.out.println("\nVEHICULOS DEL AÑO 2025");
        System.out.println("__________________________");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                System.out.println(v.mostrarInfo());
            }
        }
    }
}