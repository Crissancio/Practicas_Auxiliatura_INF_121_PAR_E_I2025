package Ejercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nomA;  // Nombre del archivo
    private List<Cliente> clientes;  // Relación de agregación con los clientes

    // Constructor
    public ArchivoCliente(String n) {
        this.nomA = n;
        this.clientes = new ArrayList<>();
        crearArchivo();  // Se asegura de que el archivo exista
    }

    // Método para crear el archivo si no existe
    public void crearArchivo() {
        try {
            File file = new File(nomA);
            if (!file.exists()) {
                file.createNewFile();  // Crea el archivo si no existe
                System.out.println("Archivo creado: " + nomA);
            } else {
                System.out.println("Archivo ya existe, cargando clientes...");
                // Cargar clientes existentes desde el archivo si es necesario
                cargarClientes();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    // Método para guardar un cliente en el archivo
    public void guardarCliente(Cliente c) {
        try {
            // Primero cargamos los clientes actuales del archivo
            cargarClientes();

            // Luego escribimos todos los clientes (incluyendo el nuevo)
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
                for (Cliente cliente : clientes) {
                    out.writeObject(cliente);
                }
                out.writeObject(c);  // Escribe el nuevo cliente al final
            }
            System.out.println("Cliente guardado correctamente: " + c);
        } catch (IOException ex) {
            System.out.println("Error al guardar cliente: " + ex.getMessage());
        }
    }

    // Método para buscar un cliente por ID
    public Cliente buscarCliente(int id) {
        // Cargar todos los clientes antes de hacer la búsqueda
        cargarClientes();

        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;  // Retorna el cliente encontrado
            }
        }
        return null;  // Retorna null si no encuentra el cliente
    }

    // Método para buscar un cliente por número de celular
    public Cliente buscarCelularCliente(int celular) {
        // Cargar todos los clientes antes de hacer la búsqueda
        cargarClientes();

        for (Cliente c : clientes) {
            if (c.getTelefono() == celular) {
                return c;  // Retorna el cliente con el celular encontrado
            }
        }
        return null;  // Retorna null si no encuentra el cliente
    }

    // Método para cargar los clientes desde el archivo
    private void cargarClientes() {
        clientes.clear();  // Limpiar la lista de clientes antes de cargar de nuevo
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            Cliente c;
            while (true) {
                try {
                    c = (Cliente) in.readObject();
                    clientes.add(c);  // Agregar cliente a la lista
                    System.out.println("Cliente cargado: " + c);  // Mostrar el cliente cargado
                } catch (EOFException e) {
                    // EOFException significa que hemos llegado al final del archivo y está bien
                    break;
                } catch (ClassNotFoundException e) {
                    System.out.println("Error de clase no encontrada durante la carga: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar clientes: " + e.getMessage());  // Mostrar el error detallado
        }
    }
}
