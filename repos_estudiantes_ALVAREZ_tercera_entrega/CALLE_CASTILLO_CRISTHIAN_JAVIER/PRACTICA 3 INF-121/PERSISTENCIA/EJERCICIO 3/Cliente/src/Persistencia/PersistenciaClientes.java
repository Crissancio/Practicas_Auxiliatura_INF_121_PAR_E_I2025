package Persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class PersistenciaClientes {
    private static final String ARCHIVO = "clientes.dat";
    
    public static void guardarCliente(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();
        clientes.add(cliente);
        guardarListaClientes(clientes);
    }
    
    public static Cliente buscarCliente(int idCliente) {
        List<Cliente> clientes = cargarClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }
    
    public static Map<String, String> buscarCelularCliente(int idCliente) {
        Cliente cliente = buscarCliente(idCliente);
        if (cliente != null) {
            Map<String, String> datos = new HashMap<>();
            datos.put("id", String.valueOf(cliente.getIdCliente()));
            datos.put("nombre", cliente.getNombre());
            datos.put("celular", cliente.getCelular());
            return datos;
        }
        return null;
    }
    
    private static List<Cliente> cargarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                clientes = (List<Cliente>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar clientes: " + e.getMessage());
            }
        }
        return clientes;
    }
    
    private static void guardarListaClientes(List<Cliente> clientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.err.println("Error al guardar clientes: " + e.getMessage());
        }
    }
}
