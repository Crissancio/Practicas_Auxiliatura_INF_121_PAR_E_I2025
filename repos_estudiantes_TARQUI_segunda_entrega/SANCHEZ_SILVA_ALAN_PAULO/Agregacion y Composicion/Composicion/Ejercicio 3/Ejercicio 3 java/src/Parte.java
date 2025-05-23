public class Parte {
    public String nombre;
    public double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    public String toString() {
        return "---------------Parte---------------\n" +
                "Nombre: " + nombre + "\n" +
                "Peso: " + peso + "\n";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
