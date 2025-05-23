class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Mustang", 2022, 45000, 2, "Gasolina");
        Moto moto1 = new Moto("Honda", "CBR600", 2021, 12000, 600, "4 tiempos");

        System.out.println("Información del coche 1");
        coche1.mostrar_info();

        System.out.println("\nInformación del coche 2");
        coche2.mostrar_info();

        System.out.println("\nInformación de la moto 1");
        moto1.mostrar_info();

        System.out.println("\nCoches con más de 4 puertas");
        Coche[] coches = {coche1, coche2};
        for (Coche c : coches) {
            if (c.getNum_puertas() > 4) {
                c.mostrar_info();
            }
        }

        System.out.println("\nVehículos de gestión 2025");
        Vehiculo[] vehiculos = {coche1, coche2, moto1};
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrar_info();
            }
        }
    }
}