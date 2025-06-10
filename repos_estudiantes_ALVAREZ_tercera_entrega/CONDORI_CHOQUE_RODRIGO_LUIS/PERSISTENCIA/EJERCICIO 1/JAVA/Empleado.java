package Ejercicio_1P;

public class Empleado {
 String nombre;
 int id;
 float salario;

 public Empleado(String nombre, int id, float salario) {
     this.nombre = nombre;
     this.id = id;
     this.salario = salario;
 }

 public String toString() {
     return nombre + " - ID: " + id + " - Salario: " + salario;
 }
}
