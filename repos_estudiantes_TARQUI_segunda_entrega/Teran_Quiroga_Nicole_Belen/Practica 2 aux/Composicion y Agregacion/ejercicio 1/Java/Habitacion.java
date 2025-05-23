public class Habitacion {
    private String nombre;
    private int tamano;

    public Habitacion(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrar_info() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}
