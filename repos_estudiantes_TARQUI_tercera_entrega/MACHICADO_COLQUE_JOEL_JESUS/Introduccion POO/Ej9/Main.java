package Ej9;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de computadora
        Computadora miPC = new Computadora("Intel Core i5", 16, 512, "NVIDIA GTX 1660");

        // Mostramos sus componentes
        miPC.mostrarComponentes();

        // Mostramos estado actual
        miPC.mostrarEstado();

        // Encendemos la computadora
        miPC.encender();
        miPC.mostrarEstado();

        // Apagamos la computadora
        miPC.apagar();
        miPC.mostrarEstado();
    }
}
