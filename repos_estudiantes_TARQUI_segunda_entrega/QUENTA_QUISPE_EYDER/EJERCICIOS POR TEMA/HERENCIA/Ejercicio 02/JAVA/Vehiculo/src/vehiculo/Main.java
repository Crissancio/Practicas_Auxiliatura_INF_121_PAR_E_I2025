public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Moto("Yamaha", "R1", 2020, 998),
            new Auto("Toyota", "Corolla", 2021, 4),
            new Camion("Volvo", "FH", 2019, 18000)
        };

        System.out.println("== Información de Vehículos ==");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.mostrarInfo());
        }
    }
}
