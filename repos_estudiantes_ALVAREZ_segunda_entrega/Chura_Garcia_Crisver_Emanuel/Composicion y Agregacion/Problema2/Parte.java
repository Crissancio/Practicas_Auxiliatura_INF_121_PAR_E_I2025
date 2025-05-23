//2. Crea un POO de clases para modelar un avión y sus partes. El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión se destruye, las partes también se destruyen.
//a) Implementa las clases con sus constructores, getters y setters.
public class Parte {
    private String nombre;
    private float peso;

    Parte(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void mostrar_info() {
        System.out.println("Parte: " + getNombre() + " peso: " + getPeso());
    }

}
