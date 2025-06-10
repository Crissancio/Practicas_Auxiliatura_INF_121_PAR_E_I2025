/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia2;

/**
 *
 * @author Administrador
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (ObjectOutputStream cli = new ObjectOutputStream(new FileOutputStream(nomA))) {
            cli.writeObject(new ArrayList<Cliente>());
            System.out.println("Archivo de clientes creado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardaCliente(Cliente c) {
        List<Cliente> lista = leerLista();
        lista.add(c);
        escribirLista(lista);
    }

    // b) Buscar cliente por ID
    public Cliente buscarCliente(int c) {
        List<Cliente> lista = leerLista();
        for (Cliente cli : lista) {
            if (cli.getId() == c) {
                return cli;
            }
        }
        return null;
    }

    // c) Buscar cliente por teléfono
    public Cliente buscarCelularCliente(int celular) {
        List<Cliente> lista = leerLista();
        for (Cliente cli : lista) {
            if (cli.getTelefono() == celular) {
                return cli;
            }
        }
        return null;
    }

    // Métodos privados para manejo de archivo
    private List<Cliente> leerLista() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (List<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribirLista(List<Cliente> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
