public class Main {
    static Coche[] coches = new Coche[6];
    static int i = 0;
    static Moto[] motos = new Moto[6];
    static int j = 0;

    public static void main(String[] args) {
        System.out.println(
                "b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info().");

        Coche coche1 = new Coche("BMW", "GTR3", 2005, 85000.0f, 2, "Gasolina");
        Coche coche2 = new Coche("Toyota", "Corolla", 2020, 21000.0f, 4, "Gasolina");
        Coche coche3 = new Coche("Tesla", "Model 5", 2025, 39999.99f, 4, "Eléctrico");
        Coche coche4 = new Coche("Ford", "F-150", 2018, 30000.0f, 4, "Diésel");

        agregaCoche(coche1);
        agregaCoche(coche2);
        agregaCoche(coche3);
        agregaCoche(coche4);

        for (int j = 0; j < i; j++) {
            coches[j].mostrar_info();
        }

        Moto moto1 = new Moto("Yamaha", "YZF-R6", 2021, 12500.0f, 599.0f, "4 tiempos");
        Moto moto2 = new Moto("Honda", "CBR500RF", 2025, 7200.0f, 471.0f, "4 tiempos");
        Moto moto3 = new Moto("Kawasaki", "Ninja ZX-10R", 2022, 16500.0f, 998.0f, "4 tiempos");
        Moto moto4 = new Moto("Ducati", "Monster 797", 2019, 9300.0f, 803.0f, "L-twin");

        agregaMoto(moto1);
        agregaMoto(moto2);
        agregaMoto(moto3);
        agregaMoto(moto4);

        for (int k = 0; k < j; k++) {
            motos[k].mostrar_info();
        }
        System.out.println("--------------");

        System.out.println("c) Mostrar coches con más de 4 puertas:");
        for (int j = 0; j < i; j++) {
            coches[j].mostrarCoche();
        }
        System.out.println("--------------");

        System.out.println("d) Mostrar coches y motos actuales (2025):");
        for (int j = 0; j < i; j++) {
            coches[j].mostrarVehiculoActual();
        }
        for (int i = 0; i < j; i++) {
            motos[i].mostrarVehiculoActual();
        }
    }

    public static void agregaCoche(Coche coche) {
        if (i < coches.length) {
            coches[i++] = coche;
        } else {
            System.out.println("Array coches lleno");
        }
    }

    public static void agregaMoto(Moto moto) {
        if (j < motos.length) {
            motos[j++] = moto;
        } else {
            System.out.println("Array motos lleno");
        }
    }
}
