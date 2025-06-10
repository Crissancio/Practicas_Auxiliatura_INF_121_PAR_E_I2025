package EJERCICIO1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;
    private ObjectMapper mapper;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
        this.mapper = new ObjectMapper();
    }

    public void crearArchivo() {
        File file = new File(nomA);
        if (!file.exists()) {
            try {
                mapper.writeValue(file, new ArrayList<Empleado>());
                System.out.println("Archivo JSON creado: " + nomA);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> empleados = leerEmpleados();
        empleados.add(e);
        try {
            mapper.writeValue(new File(nomA), empleados);
            System.out.println("Empleado guardado: " + e.nombre);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Empleado buscaEmpleado(String nombre) {
        ArrayList<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.nombre.equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        ArrayList<Empleado> empleados = leerEmpleados();
        Empleado mayor = null;
        for (Empleado e : empleados) {
            if (e.salario > sueldo) {
                if (mayor == null || e.salario > mayor.salario) {
                    mayor = e;
                }
            }
        }
        return mayor;
    }

    private ArrayList<Empleado> leerEmpleados() {
        try {
            File archivo = new File(nomA);
            if (archivo.exists()) {
                return mapper.readValue(archivo, new TypeReference<ArrayList<Empleado>>() {
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
