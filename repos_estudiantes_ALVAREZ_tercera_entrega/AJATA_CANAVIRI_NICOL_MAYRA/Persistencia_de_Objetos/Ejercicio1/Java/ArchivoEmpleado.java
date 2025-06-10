package Persistencia_de_Objetos.Ejercicio1.Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nomArchivo;

    public ArchivoEmpleado(String nomArchivo) {
        this.nomArchivo = nomArchivo;
        crearArchivo(); 
    }

    private void crearArchivo() {
        File file = new File(nomArchivo);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Archivo '" + nomArchivo + "' creado exitosamente");
                } else {
                    System.err.println("No se pudo crear el archivo '" + nomArchivo );
                }
            } catch (IOException e) {
                System.err.println("Error al crear el archivo '" + nomArchivo + "': " + e.getMessage());
            }
        } else {
            System.out.println("Archivo '" + nomArchivo + "' ya existe");
        }
    }

    // a) 
    public void guardarEmpleado(Empleado e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomArchivo, true))) {
            writer.write(e.toString());
            writer.newLine(); 
            System.out.println("Empleado '" + e.getNombre() + "' guardado exitosamente en '" + nomArchivo );
        } catch (IOException error) {
            System.err.println("Error al guardar empleado en '" + nomArchivo + "': " + error.getMessage());
        }
    }

    private List<Empleado> cargarTodosEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Empleado empleado = Empleado.fromString(linea);
                if (empleado != null) {
                    empleados.add(empleado);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo '" + nomArchivo + "': " + e.getMessage());
        }
        return empleados;
    }

    // b) 
    public Empleado buscaEmpleado(String nombreBuscar) {
        List<Empleado> empleados = cargarTodosEmpleados();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombreBuscar)) { 
                return empleado;
            }
        }
        return null; 
    }

    // c)
    public Empleado mayorSalario(float sueldoMinimo) {
        List<Empleado> empleados = cargarTodosEmpleados();
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > sueldoMinimo) {
                return empleado;
            }
        }
        return null; 
    }

    public void limpiarArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomArchivo))) {
            writer.write(""); 
            System.out.println("Contenido del archivo '" + nomArchivo + "' limpiado.");
        } catch (IOException e) {
            System.err.println("Error al limpiar el archivo '" + nomArchivo + "': " + e.getMessage());
        }
    }
}
