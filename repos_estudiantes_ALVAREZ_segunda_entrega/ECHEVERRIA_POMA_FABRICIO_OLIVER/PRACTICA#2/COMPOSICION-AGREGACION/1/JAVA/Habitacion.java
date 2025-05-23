public class Habitacion {
    private String nombre;
    private float tamaño;

    public Habitacion(String nombre, float tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    //A
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + ", Tamaño: " + tamaño + " m²");
    }
}