package com.mycompany.ejepersistenciaobj3;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ArchivoCliente {
    String nomA;
    ArrayList<Cliente> clientes;

    public ArchivoCliente(String n) {
        nomA = n;
        clientes = new ArrayList<>();
    }

    public void crearArchivo() {
        // Simulación
        clientes.clear();
    }

    public void guardaCliente(Cliente c) {
        clientes.add(c);
    }

    public Cliente buscarCliente(int c) {
        for (Cliente cli : clientes) {
            if (cli.getId() == c) return cli;
        }
        return null;
    }

    public Cliente buscarCelularCliente(int c) {
        return buscarCliente(c);
    }
}
