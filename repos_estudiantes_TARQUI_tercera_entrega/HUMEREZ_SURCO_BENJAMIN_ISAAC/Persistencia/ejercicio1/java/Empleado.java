package Persistencia.ejercicio1.java;

class Empleado {
    String nombre;
    int edad;
    float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario;
    }
}
