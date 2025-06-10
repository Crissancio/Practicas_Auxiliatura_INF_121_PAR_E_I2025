package Persistencia.ejercicio1.java;
import java.util.ArrayList;

class ArchivoEmpleado {
    String nomA;
    ArrayList<Empleado> empleados;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
        this.empleados = new ArrayList<>();
    }

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
