/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer1.per;

/**
 *
 * @author Adrian
 */
import java.io.*;
import java.util.*;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String n) {
        this.nomA = n;
    }

    public void crearArchivo() {
        try {
            File archivo = new File(nomA);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo.");
        }
    }
// a) Implementa el método guardarEmpleado(Empleado e) para almacenar  empleados.
    public void guardarEmpleado(Empleado e) {
        try {
            FileWriter fw = new FileWriter(nomA, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(e.toString());
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println("se produjo un error al guardar al empleado");
        }
    }
// b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos  del Empleado n. 
    public Empleado buscaEmpleado(String n) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomA));
            String linea;
            while ((linea = br.readLine()) != null) {
                Empleado e = Empleado.desdeCadena(linea);
                if (e.nombre.equals(n)) {
                    br.close();
                    return e;
                }
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("se produjo un error al buscar al empleado");
        }
        return null;
    }
// c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con  sueldo mayor al ingresado.
    public Empleado mayorSalario(float s) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomA));
            String linea;
            while ((linea = br.readLine()) != null) {
                Empleado e = Empleado.desdeCadena(linea);
                if (e.salario > s) {
                    br.close();
                    return e;
                }
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al buscar salario.");
        }
        return null;
    }
}
