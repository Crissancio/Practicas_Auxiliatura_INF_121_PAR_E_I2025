public class Parte {
    private String nombre;
    private float peso;

    public Parte(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("  Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}
