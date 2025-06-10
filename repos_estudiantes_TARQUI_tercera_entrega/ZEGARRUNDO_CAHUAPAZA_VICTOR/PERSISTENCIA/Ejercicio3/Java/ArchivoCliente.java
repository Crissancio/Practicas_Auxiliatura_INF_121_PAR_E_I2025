package Ejercicio3;

import java.io.*;
import java.util.ArrayList;

public class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void guardarCliente(Cliente c) {
        ArrayList<Cliente> clientes = leerClientes();
        clientes.add(c);
        escribirClientes(clientes);
    }

    public Cliente buscarCliente(int c) {
        for (Cliente cli : leerClientes()) {
            if (cli.getId() == c) {
                return cli;
            }
        }
        return null;
    }

    public Cliente buscarCelularCliente(int c) {
        for (Cliente cli : leerClientes()) {
            if (cli.getId() == c) {
                System.out.println("Teléfono: " + cli.getTelefono());
                return cli;
            }
        }
        return null;
    }

    private ArrayList<Cliente> leerClientes() {
        ArrayList<Cliente> lista = new ArrayList<>();
        File archivo = new File(nomA);
        if (!archivo.exists() || archivo.length() == 0) {
            return lista;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            lista = (ArrayList<Cliente>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer clientes: " + e.getMessage());
        }
        return lista;
    }

    private void escribirClientes(ArrayList<Cliente> clientes) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Error al escribir clientes: " + e.getMessage());
        }
    }
}