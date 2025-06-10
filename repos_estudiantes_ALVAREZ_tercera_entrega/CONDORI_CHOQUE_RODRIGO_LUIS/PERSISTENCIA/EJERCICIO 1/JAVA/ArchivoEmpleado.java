package Ejercicio_1P;
import java.util.ArrayList;

public class ArchivoEmpleado {
 String nomA;
 private ArrayList<Empleado> empleados = new ArrayList<>();

 public void guardarEmpleado(Empleado e) {
     empleados.add(e);
 }

 public Empleado buscaEmpleado(String n) {
     for (Empleado e : empleados) {
         if (e.nombre.equals(n)) return e;
     }
     return null;
 }

 public Empleado mayorSalario(float sueldo) {
     for (Empleado e : empleados) {
         if (e.salario > sueldo) return e;
     }
     return null;
 }
}

