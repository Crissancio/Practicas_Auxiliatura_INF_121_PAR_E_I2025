package Ejercicio1;


public class Vehiculo1 {
    

    static class Vehiculo {
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

        public String mostrarInfo() {
            return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio base: $" + precioBase;
        }

        public int getAnio() {
            return anio;
        }
    }

    
    static class Coche extends Vehiculo {
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

        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Puertas: " + numPuertas + ", Combustible: " + tipoCombustible;
        }
    }

    
    static class Moto extends Vehiculo {
        private String cilindrada;
        private String tipoMotor;

        public Moto(String marca, String modelo, int anio, double precioBase, String cilindrada, String tipoMotor) {
            super(marca, modelo, anio, precioBase);
            this.cilindrada = cilindrada;
            this.tipoMotor = tipoMotor;
        }

        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Cilindrada: " + cilindrada + ", Motor: " + tipoMotor;
        }
    }

    
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Coche("Toyota", "Corolla", 2025, 25000, 4, "Gasolina"),
            new Coche("Ferrary", "Explorer", 2024, 35000, 5, "Diesel"),
            new Moto("Yamaha", "R3", 2025, 7000, "321cc", "4 tiempos"),
            new Moto("nisan", "CBR600RR", 2023, 12000, "599cc", "4 tiempos")
        };
         System.out.println(" Noemi chino blanco");
        System.out.println(" Información de Vehículos:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.mostrarInfo());
        }

        System.out.println("\n Coches con más de 4 puertas:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche) v).getNumPuertas() > 4) {
                System.out.println(v.mostrarInfo());
            }
        }

        System.out.println("\n Vehículos del año 2025:");
        for (Vehiculo v : vehiculos) {
            if (v.getAnio() == 2025) {
                System.out.println(v.mostrarInfo());
            }
        }
    }
}

