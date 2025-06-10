/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persistencia1;

/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 1. Clase Cliente: Debe implementar Serializable para poder guardarse en un archivo.
class Cliente implements Serializable {
    private static final long serialVersionUID = 1L; // UID de versión para la serialización
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + "', telefono=" + telefono + '}';
    }
}

// 2. Clase ArchivoCliente: Gestiona las operaciones de persistencia.
class ArchivoCliente {
    private String nomA; // Nombre del archivo

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
        crearArchivo();
    }

    public void crearArchivo() {
        File archivo = new File(nomA);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }
    }
    
    // Método para leer todos los clientes del archivo
    @SuppressWarnings("unchecked")
    private List<Cliente> leerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(nomA);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            // Se lee el objeto (que es la lista completa) del archivo
            clientes = (List<Cliente>) ois.readObject();
        } catch (EOFException e) {
            // El archivo está vacío, se retorna una lista vacía.
        } catch (IOException | ClassNotFoundException e) {
            // Otros errores
        }
        return clientes;
    }
    
    // Método para escribir la lista de clientes en el archivo
    private void escribirClientes(List<Cliente> clientes) {
        try (FileOutputStream fos = new FileOutputStream(nomA);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // Se escribe la lista completa al archivo, sobreescribiendo el contenido anterior
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void guardaCliente(Cliente c) {
        List<Cliente> clientes = leerClientes();
        clientes.add(c);
        escribirClientes(clientes);
        System.out.println("Cliente guardado: " + c.toString());
    }

    // b) Implementación de buscarCliente por ID
    public Cliente buscarCliente(int id) {
        List<Cliente> clientes = leerClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; // Retorna null si no se encuentra
    }

    // c) Implementación de buscarCelularCliente por teléfono
    public Cliente buscarCelularCliente(int telefono) {
        List<Cliente> clientes = leerClientes();
        return clientes.stream()
                .filter(c -> c.getTelefono() == telefono)
                .findFirst()
                .orElse(null); // Retorna null si no se encuentra
    }
}

// Clase principal para probar la implementación
public class Persistencia1 {
    public static void main(String[] args) {
        // Inicializamos el gestor de archivos de clientes
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");

        // Creamos y guardamos algunos clientes
        System.out.println("--- Guardando Clientes ---");
        archivo.guardaCliente(new Cliente(101, "Ana Fuentes", 77551122));
        archivo.guardaCliente(new Cliente(102, "Carlos Diaz", 77112233));
        archivo.guardaCliente(new Cliente(103, "Beatriz Roca", 65544332));
        System.out.println();

        // --- Pruebas de Búsqueda ---
        System.out.println("--- Búsqueda de Clientes ---");

        // Búsqueda por ID (existente)
        System.out.println("Buscando cliente con ID 102...");
        Cliente clienteEncontrado = archivo.buscarCliente(102);
        if (clienteEncontrado != null) {
            System.out.println("Resultado: " + clienteEncontrado.toString());
        } else {
            System.out.println("Resultado: Cliente no encontrado.");
        }

        // Búsqueda por Celular (existente)
        System.out.println("\nBuscando cliente con celular 65544332...");
        Cliente clientePorCelular = archivo.buscarCelularCliente(65544332);
        if (clientePorCelular != null) {
            System.out.println("Resultado: " + clientePorCelular.toString());
        } else {
            System.out.println("Resultado: Cliente no encontrado.");
        }

        // Búsqueda por ID (no existente)
        System.out.println("\nBuscando cliente con ID 999...");
        clienteEncontrado = archivo.buscarCliente(999);
        if (clienteEncontrado != null) {
            System.out.println("Resultado: " + clienteEncontrado.toString());
        } else {
            System.out.println("Resultado: Cliente no encontrado.");
        }
    }
}