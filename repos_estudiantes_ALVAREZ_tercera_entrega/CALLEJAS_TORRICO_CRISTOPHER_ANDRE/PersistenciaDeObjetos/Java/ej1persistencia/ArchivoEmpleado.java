package ej1persistencia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nombreArchivo;
    private List<Empleado> empleados;
    private ObjectMapper mapper = new ObjectMapper();

    public ArchivoEmpleado(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.empleados = cargarEmpleados();
    }

    private List<Empleado> cargarEmpleados() {
        File file = new File(nombreArchivo);
        try {
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return mapper.readValue(file, new TypeReference<List<Empleado>>() {});
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void guardarEmpleados() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(nombreArchivo), empleados);
        } catch (IOException e) {
            System.out.println("Error al guardar empleados: " + e.getMessage());
        }
    }

    public void guardarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        guardarEmpleados();
    }

    public Empleado buscaEmpleado(String nombre) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                return emp;
            }
        }
        return null;
    }

    public Empleado mayorSalario(double sueldo) {
        for (Empleado emp : empleados) {
            if (emp.getSalario() > sueldo) {
                return emp;
            }
        }
        return null;
    }
}
