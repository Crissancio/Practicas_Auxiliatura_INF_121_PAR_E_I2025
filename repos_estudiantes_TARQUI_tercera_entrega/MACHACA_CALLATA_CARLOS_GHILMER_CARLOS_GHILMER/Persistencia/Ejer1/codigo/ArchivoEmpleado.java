
package Persistencia.Ejer1.codigo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;
    ArrayList<Empleado> empleados;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
        this.empleados = new ArrayList<>();
    }
    public void crearArchivo() {
        try {
            File archivo = new File(nomA);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo.");
            e.printStackTrace();
        }
    }
    public void guardarEmpleado(Empleado e){
        empleados.add(e);
    }
    public Empleado buscaEmpleado(String n) {
        for(Empleado e : empleados) {
            if(e.getNombre().equals(n)) return e;
        }
        return null;
    }
     public Empleado mayorSalario(float sueldo) {
        Empleado mayor = null;
        for (Empleado e : empleados) {
            if (e.getSalario() > sueldo) {
                if (mayor == null || e.getSalario() > mayor.getSalario()) {
                    mayor = e;
                }
            }
        }
        return mayor;
    }

}