public class Main {

    static class Vehiculo {
        String marca, modelo;
        int anio;
        double precioBase;

        Vehiculo(String marca, String modelo, int anio, double precioBase) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.precioBase = precioBase;
        }

        void mostrarInfo() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio Base: $" + precioBase);
        }
    }

    static class Coche extends Vehiculo {
        int numPuertas;
        String tipoCombustible;

        Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
            super(marca, modelo, anio, precioBase);
            this.numPuertas = numPuertas;
            this.tipoCombustible = tipoCombustible;
        }

        @Override
        void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Puertas: " + numPuertas + ", Combustible: " + tipoCombustible);
        }
    }

    static class Moto extends Vehiculo {
        int cilindrada;
        String tipoMotor;

        Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
            super(marca, modelo, anio, precioBase);
            this.cilindrada = cilindrada;
            this.tipoMotor = tipoMotor;
        }

        @Override
        void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Cilindrada: " + cilindrada + "cc, Tipo de Motor: " + tipoMotor);
        }
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina");
        Moto moto1 = new Moto("Yamaha", "R1", 2021, 15000, 1000, "4 tiempos");

        coche1.mostrarInfo();
        System.out.println("---");
        moto1.mostrarInfo();
    }
}
