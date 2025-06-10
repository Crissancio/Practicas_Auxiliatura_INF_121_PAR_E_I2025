package Ej9;

public class Computadora {
    private String cpu;
    private int ramGB;
    private int almacenamientoGB;
    private String gpu;
    private boolean encendida;

    public Computadora(String cpu, int ramGB, int almacenamientoGB, String gpu) {
        this.cpu = cpu;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
        this.gpu = gpu;
        this.encendida = false;
    }

    public void mostrarComponentes() {
        System.out.println("----- Componentes de la Computadora -----");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Almacenamiento: " + almacenamientoGB + " GB");
        System.out.println("GPU: " + gpu);
        System.out.println("-----------------------------------------");
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println("Estado: Encendida");
        } else {
            System.out.println("Estado: Apagada");
        }
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se ha encendido correctamente.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora se ha apagado correctamente.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }
}
