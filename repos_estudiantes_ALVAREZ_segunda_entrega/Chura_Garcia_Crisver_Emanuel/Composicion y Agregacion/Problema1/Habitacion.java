//1.Sean las siguientes clases:
//a) Implementa las clases con sus constructores, getters y setters.
public class Habitacion {
    private String nombre;
    private float tamaño;

    Habitacion(String nombre, float tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamañO() {
        return this.tamaño;
    }

    public void setTamañO(float tamaño) {
        this.tamaño = tamaño;
    }

    public void mostrar_info() {
        System.out.println("Habitacion: " + getNombre() + " tamaño: " + getTamañO());
    }
}