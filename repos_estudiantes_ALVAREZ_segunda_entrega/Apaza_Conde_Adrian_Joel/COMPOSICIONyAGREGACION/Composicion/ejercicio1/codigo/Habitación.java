// a)
public class Habitación {
    private String nombre;
    private double tamaño; 
    
    public Habitación (String n, double t) {
        this.nombre = n;
        this.tamaño = t;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getTamaño() {
        return tamaño;
    }
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    public void mostrar_info() {
        System.out.println("habitación: " + nombre);
        System.out.println("tamaño: " + tamaño + " m²");
    }
}