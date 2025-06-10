package persistencia1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

/**
 *
 * @author CINTHIA
 */
public class ArchivoEmpleado {
    private String nombreArchivo;
    private Gson gson = new Gson();

    public ArchivoEmpleado(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void crearArchivo() {
        try (Writer writer = new FileWriter(nombreArchivo)) {
            gson.toJson(new ArrayList<Empleado>(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarEmpleado(Empleado e) {
        List<Empleado> empleados = leerEmpleados();
        empleados.add(e);
        escribirEmpleados(empleados);
    }

    public Empleado buscaEmpleado(String nombre) {
        for (Empleado e : leerEmpleados()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        for (Empleado e : leerEmpleados()) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }

    private List<Empleado> leerEmpleados() {
        try (Reader reader = new FileReader(nombreArchivo)) {
            Type tipoLista = new TypeToken<ArrayList<Empleado>>() {}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void escribirEmpleados(List<Empleado> empleados) {
        try (Writer writer = new FileWriter(nombreArchivo)) {
            gson.toJson(empleados, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
