package ComposicionAgregacion.Ejer3.codigo;

public class Parte {
    public String nombre;
    public double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
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
        System.out.println("Parte: " + this.nombre + ", Peso: " + this.peso);
    }
    public String toString() {
        return String.format(" Parte: [ %s , %s kg ]", this.nombre, this.peso);
    }
    
}
