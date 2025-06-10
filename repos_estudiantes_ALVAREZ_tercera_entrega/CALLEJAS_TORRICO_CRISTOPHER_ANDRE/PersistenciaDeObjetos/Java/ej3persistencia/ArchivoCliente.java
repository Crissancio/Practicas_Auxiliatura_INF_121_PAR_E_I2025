package ej3persistencia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nombreArchivo;
    private List<Cliente> clientes;
    private ObjectMapper mapper = new ObjectMapper();

    public ArchivoCliente(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.clientes = cargarClientes();
    }

    private List<Cliente> cargarClientes() {
        File archivo = new File(nombreArchivo);
        try {
            if (!archivo.exists()) {
                return new ArrayList<>();
            }
            return mapper.readValue(archivo, new TypeReference<List<Cliente>>() {});
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void guardarClientes() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(nombreArchivo), clientes);
        } catch (IOException e) {
            System.out.println("Error al guardar clientes: " + e.getMessage());
        }
    }

    public void guardarCliente(Cliente cliente) {
        clientes.add(cliente);
        guardarClientes();
    }

    public Cliente buscarCliente(int id_cliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getId_cliente() == id_cliente) {
                return cliente;
            }
        }
        return null;
    }

    public String buscarCelularCliente(int id_cliente) {
        Cliente cliente = buscarCliente(id_cliente);
        if (cliente != null) {
            return "Cliente: " + cliente.getNombre() + ", Celular: " + cliente.getCelular();
        }
        return "Cliente no encontrado";
    }
}
