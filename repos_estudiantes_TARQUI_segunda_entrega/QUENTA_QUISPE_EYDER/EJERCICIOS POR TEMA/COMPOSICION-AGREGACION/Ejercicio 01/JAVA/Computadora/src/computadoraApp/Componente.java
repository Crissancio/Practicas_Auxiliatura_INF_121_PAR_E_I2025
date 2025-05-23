public class Componente {
    private String nombre;
    private String tipo;

    public Componente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String mostrarInfo() {
        return tipo + ": " + nombre;
    }
}