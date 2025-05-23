package Ejercicio1;

public class Ej1 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Mondeo", 2025, 25000, 5, "Diésel");
        Coche coche3 = new Coche("Honda", "Civic", 2024, 22000, 2, "Híbrido");

        Moto moto1 = new Moto("Yamaha", "MT-07", 2025, 9000, 689, "4T");
        Moto moto2 = new Moto("Suzuki", "GSX-R600", 2023, 11000, 599, "4T");

        System.out.println("-------Información de coches:-------");
        coche1.mostrar_info();
        System.out.println();
        coche2.mostrar_info();
        System.out.println();
        coche3.mostrar_info();

        System.out.println("-------Información de motos:-------");
        moto1.mostrar_info();
        System.out.println();
        moto2.mostrar_info();

        System.out.println("-------Coches con más de 4 puertas:-------");
        Coche[] coches = {coche1, coche2, coche3};
        for (Coche coche : coches) {
            if (coche.get_num_puertas() > 4) {
                coche.mostrar_info();
                System.out.println();
            }
        }

        System.out.println("-------Vehículos gestión 2025:-------");
        Vehiculo[] vehiculos = {coche1, coche2, coche3, moto1, moto2};
        for (Vehiculo v : vehiculos) {
            if (v.get_año() == 2025) {
                v.mostrar_info();
                System.out.println();
            }
        }
    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio_base;

    public Vehiculo(String marca, String modelo, int año, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }

    public String get_marca() {
        return marca;
    }

    public void set_marca(String marca) {
        this.marca = marca;
    }

    public String get_modelo() {
        return modelo;
    }

    public void set_modelo(String modelo) {
        this.modelo = modelo;
    }

    public int get_año() {
        return año;
    }

    public void set_año(int año) {
        this.año = año;
    }

    public double get_precio_base() {
        return precio_base;
    }

    public void set_precio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public void mostrar_info() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio Base: " + precio_base);
    }
}

class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, double precio_base, int num_puertas, String tipo_combustible){
        super(marca, modelo, año, precio_base);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
    }

    public int get_num_puertas() {
        return num_puertas;
    }

    public void set_num_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String get_tipo_combustible() {
        return tipo_combustible;
    }

    public void set_tipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Número de puertas: " + num_puertas + ", Tipo de combustible: " + tipo_combustible);
    }
}

class Moto extends Vehiculo {
    private int cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, double precio_base, int cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    public int get_cilindrada() {
        return cilindrada;
    }

    public void set_cilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String get_tipo_motor() {
        return tipo_motor;
    }

    public void setTipoMotor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada + ", Tipo de motor: " + tipo_motor);
    }
}
