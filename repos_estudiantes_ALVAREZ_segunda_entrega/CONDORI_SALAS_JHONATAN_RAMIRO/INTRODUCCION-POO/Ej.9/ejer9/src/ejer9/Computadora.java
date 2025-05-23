package ejer9;

public class Computadora {
    
    private String marca;
    private String modelo;
    private String procesador;
    private int memoriaRAM;
    private boolean encendido;

    public Computadora(String marca, String modelo, String procesador, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.encendido = false; 
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("La computadora está apagada.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public void mostrarEstado() {
        if (encendido) {
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora está apagada.");
        }
    }

    public void mostrarComponentes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + "GB");
    }
    public static void main(String[] args) {
        Computadora miComputadora = new Computadora("HP", "Pavilion 15", "Intel i7", 16);

        System.out.println("Componentes de la computadora:");
        miComputadora.mostrarComponentes();

        System.out.println("\nEstado inicial de la computadora:");
        miComputadora.mostrarEstado();

        System.out.println("\nEncendiendo la computadora...");
        miComputadora.encender();

        miComputadora.mostrarEstado();

        System.out.println("\nApagando la computadora...");
        miComputadora.apagar();

        miComputadora.mostrarEstado();
    }
}
