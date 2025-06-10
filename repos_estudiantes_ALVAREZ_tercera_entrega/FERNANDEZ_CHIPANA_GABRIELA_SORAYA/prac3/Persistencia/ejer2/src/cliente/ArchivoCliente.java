/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;
import java.io.*;
import java.util.ArrayList;

public class ArchivoCliente {
    String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try {
            File archivo = new File(nomA);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + nomA);
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void guardaCliente(Cliente c) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomA, true))) {
            bw.write(c.toArchivo());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar cliente: " + e.getMessage());
        }
    }

    public Cliente buscarCliente(int idBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Cliente c = Cliente.fromArchivo(linea);
                if (c.id == idBuscado) {
                    return c;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al buscar cliente: " + e.getMessage());
        }
        return null;
    }

    public Cliente buscarCelularCliente(int id) {
        Cliente c = buscarCliente(id);
        if (c != null) {
            System.out.println("Teléfono del cliente: " + c.telefono);
        }
        return c;
    }
}
