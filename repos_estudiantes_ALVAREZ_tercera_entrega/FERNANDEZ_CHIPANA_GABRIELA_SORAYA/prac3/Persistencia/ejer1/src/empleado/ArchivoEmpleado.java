/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
import java.io.*;
import java.util.*;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try {
            new FileWriter(nomA, false).close(); // crea o vacía el archivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarEmpleado(Empleado e) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomA, true))) {
            bw.write(e.toString());
            bw.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Empleado buscaEmpleado(String nombre) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Empleado e = Empleado.fromString(linea);
                if (e.getNombre().equalsIgnoreCase(nombre)) {
                    return e;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Empleado e = Empleado.fromString(linea);
                if (e.getSalario() > sueldo) {
                    return e;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
