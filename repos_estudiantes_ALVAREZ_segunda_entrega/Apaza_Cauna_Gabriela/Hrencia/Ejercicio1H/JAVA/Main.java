
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Ferrari", "F-14", 2022, 25000.00, 4, "Gasolina");
        Coche coche2 = new Coche("Mercedes", "M-M", 2023, 35000.00, 5, "Híbrido");
        Coche coche3 = new Coche("Ford", "Mustang", 2024, 60000.00, 2, "Gasolina");

        Moto moto1 = new Moto("Yamaha", "YZF-R3", 2021, 6000.00, 321, "Gasolina");
        Moto moto2 = new Moto("Harley-Davidson", "Iron 883", 2023, 12000.00, 883, "Gasolina");
        Moto moto3 = new Moto("Kawasaki", "Ninja 400", 2025, 7500.00, 400, "Gasolina");
        System.out.println("/n");
        coche1.mostrarInfo();
        moto1.mostrarInfo();
        
    }
}