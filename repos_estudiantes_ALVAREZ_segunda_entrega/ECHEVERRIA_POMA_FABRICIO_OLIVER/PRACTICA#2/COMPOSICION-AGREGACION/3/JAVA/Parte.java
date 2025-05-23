public class Parte {
    private String nombre;
    private float peso;

    public Parte(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    //A
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + ", Peso: " + peso + " kg");
    }
}