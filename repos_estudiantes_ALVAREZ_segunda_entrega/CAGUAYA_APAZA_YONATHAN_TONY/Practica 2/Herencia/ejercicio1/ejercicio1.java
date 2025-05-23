public class Ejercicio1 {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2020, 18000, 4);
        Moto moto = new Moto("Yamaha", "FZ", 2022, 9500, 250);

        System.out.println("Información del Coche:");
        coche.mostrarInfo();

        System.out.println("\nInformación de la Moto:");
        moto.mostrarInfo();
    }
}

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

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio Base: $" + precioBase);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
}

class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas) {
        super(marca, modelo, anio, precioBase);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
    }
}

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
