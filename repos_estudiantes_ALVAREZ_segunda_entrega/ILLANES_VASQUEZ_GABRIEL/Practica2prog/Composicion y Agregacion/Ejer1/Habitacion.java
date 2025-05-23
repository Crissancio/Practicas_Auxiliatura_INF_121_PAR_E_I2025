package Com;

public class Habitacion {
    private String nombre, tamaño;

    public Habitacion() {
        this.nombre = "Habitación vacía";
        this.tamaño = "0";
    }

    public Habitacion(String nom, String tam) {
        nombre = nom;
        tamaño = tam;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + " Tamaño: " + tamaño + " m^2");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
