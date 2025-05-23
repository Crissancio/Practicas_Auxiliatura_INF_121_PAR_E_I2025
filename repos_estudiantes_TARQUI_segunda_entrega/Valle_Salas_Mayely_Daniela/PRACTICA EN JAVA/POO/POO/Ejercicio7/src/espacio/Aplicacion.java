package espacio;

class Aplicacion extends Celular{
    private String nombre;
    private int peso; 

    public Aplicacion(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }
}