/// "NOMBRE: QUENTA MAMANI NICK RANDY"
/// "CI: 10037571"
///
/// "9. Realiza la abstracción de una Computadora"
/// "a) Muestra los componentes principales de la computadora"
/// "b) Muestra el estado de la computadora (encendido o apagado)"
/// "c) Crea una instancia y simula encender y apagar la computadora."

public class Computadora {
    private String marca;
    private String procesador;
    private int memoriaRam;
    private int almacenamiento;
    private boolean estado;

    public Computadora(String marca, String procesador, int memoriaRam, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.estado = false;
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("La computadora esta encendida.");
        } else {
            System.out.println("La computadora ya esta encendida.");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("La computadora esta apagada.");
        } else {
            System.out.println("La computadora ya esta apagada.");
        }
    }

    public void mostrarComponentes() {
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRam + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Estado: " + (estado ? "encendido" : "apagado"));
    }
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Lenovo", "Intel i5", 16, 512);

        System.out.println("Componentes de la computadora:");
        computadora.mostrarComponentes();

        System.out.println("Simulación de estado:");
        computadora.encender();
        computadora.apagar();
        computadora.encender();
    }
}
