package Herencia;
class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio base: $" + precioBase);
    }

    public int getAnio() {
        return anio;
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

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + numPuertas + ", Combustible: " + tipoCombustible);
    }

    public int getNumPuertas() {
        return numPuertas;
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

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc, Tipo de motor: " + tipoMotor);
    }
}
public class ejercicio1 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
            new Coche("Ford", "Explorer", 2025, 35000, 5, "Híbrido"),
            new Moto("Yamaha", "MT-07", 2024, 8000, 689, "2T"),
            new Moto("Kawasaki", "Ninja", 2025, 12000, 649, "4T")
        };

        System.out.println("\n--- Información de vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println();
        }

        System.out.println("\n--- Coches con más de 4 puertas ---");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche) v).getNumPuertas() > 4) {
                v.mostrarInfo();
                System.out.println();
            }
        }

        System.out.println("\n--- Vehículos del año 2025 ---");
        for (Vehiculo v : vehiculos) {
            if (v.getAnio() == 2025) {
                v.mostrarInfo();
                System.out.println();
            }
        }
    }
}
