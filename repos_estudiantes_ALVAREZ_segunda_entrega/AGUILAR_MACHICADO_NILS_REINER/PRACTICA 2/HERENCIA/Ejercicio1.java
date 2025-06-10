class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public int getAnio() {
        return anio;
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio Base: " + precioBase;
    }
}

class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String toString() {
        return super.toString() + ", Puertas: " + numPuertas + ", Combustible: " + tipoCombustible;
    }
}

class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + ", Tipo Motor: " + tipoMotor;
    }
}

class TestVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[] {
            new Coche("Toyota", "Corolla", 2025, 15000, 4, "Gasolina"),
            new Coche("Ford", "Explorer", 2024, 20000, 5, "Diésel"),
            new Moto("Honda", "CB500", 2025, 8000, 500, "4 tiempos"),
            new Moto("Yamaha", "R15", 2023, 6000, 155, "2 tiempos")
        };

        System.out.println("--- Todos los Vehículos ---");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        System.out.println("\n--- Coches con más de 4 puertas ---");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche)v).getNumPuertas() > 4) {
                System.out.println(v);
            }
        }

        System.out.println("\n--- Vehículos del año 2025 ---");
        for (Vehiculo v : vehiculos) {
            if (v.getAnio() == 2025) {
                System.out.println(v);
            }
        }
    }
}