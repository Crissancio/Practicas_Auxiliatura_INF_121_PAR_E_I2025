package Ejercicio_3P;

public class Cliente {
 int id;
 String nombre;
 int telefono;

 public Cliente(int id, String nombre, int telefono) {
     this.id = id;
     this.nombre = nombre;
     this.telefono = telefono;
 }

 public String toString() {
     return "Cliente: " + nombre + ", ID: " + id + ", Tel: " + telefono;
 }
}
