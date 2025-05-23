package comp;

//a) Implementa la clase Universidad con su constructor, getters y setters.

import java.util.ArrayList;
import java.util.List;

public class Universidad {
 private String nombre;
 private List<Estudiante> estudiantes;

 public Universidad(String nombre) {
     this.nombre = nombre;
     this.estudiantes = new ArrayList<>();
 }

 // Getters y setters para nombre
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public void agregarEstudiante(Estudiante estudiante) {
     estudiantes.add(estudiante);
 }

 public void mostrarUniversidad() {
     System.out.println("Universidad: " + nombre);
     System.out.println("Estudiantes:");
     for (Estudiante est : estudiantes) {
         est.mostrarInfo();
     }
 }
}
