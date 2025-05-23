package componentes;

public class Computadora {
    private String procesador;
    private int memoriaRAM; 
    private int almacenamiento; 
    private boolean encendida;

    public Computadora(String procesador, int memoriaRAM, int almacenamiento) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.encendida = false; 
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora está apagada.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public void mostrarEstado() {
        String estado = encendida ? "encendida" : "apagada";
        System.out.println("La computadora está " + estado + ".");
    }

    public void mostrarComponentes() {
        System.out.println("Componentes de la computadora:");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }
}

