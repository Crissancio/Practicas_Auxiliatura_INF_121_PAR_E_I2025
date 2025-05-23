//a)
public class Parte {
    private String nombre;
    private double peso; 
    
    public Parte(String n, double p) {
        this.nombre = n;
        this.peso = p;
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
    public void mostrar_info() {
        System.out.println("Parte: " + nombre+", Peso: " + peso + " kg");
    }
}