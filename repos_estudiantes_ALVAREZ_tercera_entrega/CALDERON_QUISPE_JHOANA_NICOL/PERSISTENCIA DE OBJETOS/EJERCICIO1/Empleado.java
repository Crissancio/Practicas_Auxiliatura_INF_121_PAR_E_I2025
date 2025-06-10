package EJERCICIO1;

public class Empleado {
    public String nombre;
    public int edad;
    public float salario;

    public Empleado() {
        // Constructor vacío requerido por Jackson
    }

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado nombre=" + nombre + ", edad=" + edad + ", salario=" + salario;
    }
}
