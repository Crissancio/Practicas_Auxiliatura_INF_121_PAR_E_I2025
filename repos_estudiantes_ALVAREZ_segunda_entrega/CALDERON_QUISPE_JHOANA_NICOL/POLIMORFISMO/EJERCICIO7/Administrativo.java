package EJERCICIO7;

public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public boolean sueldoEsIgual(float x) {
        return sueldoMes == x;
    }

    public void mostrar() {
        System.out.println("Administrativo: " + nombre + ", Cargo: " + cargo + ", Sueldo: " + sueldoMes);
    }
}
