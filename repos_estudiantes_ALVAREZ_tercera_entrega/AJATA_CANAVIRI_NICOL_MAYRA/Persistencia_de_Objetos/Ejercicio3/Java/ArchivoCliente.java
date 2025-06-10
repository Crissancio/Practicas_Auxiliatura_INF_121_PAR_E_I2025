package Persistencia_de_Objetos.Ejercicio3.Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nomArchivo;

    public ArchivoCliente(String nomArchivo) {
        this.nomArchivo = nomArchivo;
        crearArchivo(); 
    }

    private void crearArchivo() {
        File file = new File(nomArchivo);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Archivo '" + nomArchivo + "' creado exitosamente.");
                } else {
                    System.err.println("No se pudo crear el archivo '" + nomArchivo + "'.");
                }
            } catch (IOException e) {
                System.err.println("Error al crear el archivo '" + nomArchivo + "': " + e.getMessage());
            }
        } else {
            System.out.println("Archivo '" + nomArchivo + "' ya existe.");
        }
    }

    public void guardaCliente(Cliente c) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomArchivo, true))) { // true para append
            writer.write(c.toString());
            writer.newLine(); 
            System.out.println("Cliente con ID " + c.getId() + " guardado exitosamente en '" + nomArchivo + "'.");
        } catch (IOException error) {
            System.err.println("Error al guardar cliente en '" + nomArchivo + "': " + error.getMessage());
        }
    }

    private List<Cliente> cargarTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Cliente cliente = Cliente.fromString(linea);
                if (cliente != null) {
                    clientes.add(cliente);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo '" + nomArchivo + "': " + e.getMessage());
        }
        return clientes;
    }

    // b) 
    public Cliente buscarCliente(int idBuscar) {
        System.out.println("Buscando cliente con ID: " + idBuscar);
        List<Cliente> clientes = cargarTodosClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idBuscar) {
                return cliente;
            }
        }
        return null;
    }

    // c) 
    public Cliente buscarCelularCliente(int telefonoBuscar) {
        System.out.println("Buscando cliente con numero de telefono: " + telefonoBuscar);
        List<Cliente> clientes = cargarTodosClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getTelefono() == telefonoBuscar) {
                return cliente;
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
