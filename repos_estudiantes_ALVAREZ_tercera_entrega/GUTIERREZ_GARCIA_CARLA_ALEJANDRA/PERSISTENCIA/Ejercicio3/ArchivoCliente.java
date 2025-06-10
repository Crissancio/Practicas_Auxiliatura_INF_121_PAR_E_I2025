package Ejercicio3;

import java.io.*;
import java.util.ArrayList;

public class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String n) {
        this.nomA = n;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(new ArrayList<Cliente>());
            System.out.println("Archivo creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public void guardarCliente(Cliente c) {
        ArrayList<Cliente> lista = leerArchivo();
        lista.add(c);
        escribirArchivo(lista);
    }

    // b) Implementa buscarCliente(int c) a través del id.
    public Cliente buscarCliente(int c) {
        ArrayList<Cliente> lista = leerArchivo();
        for (Cliente cli : lista) {
            if (cli.getId() == c) {
                return cli;
            }
        }
        return null;
    }

    // c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
    // junto al número de celular.
    public Cliente buscarCelularCliente(int c) {
        ArrayList<Cliente> lista = leerArchivo();
        for (Cliente cli : lista) {
            if (cli.getId() == c) {
                System.out.println("Número de celular: " + cli.getTelefono());
                return cli;
            }
        }
        return null;
    }

    private ArrayList<Cliente> leerArchivo() {
        ArrayList<Cliente> lista = new ArrayList<>();
        File f = new File(nomA);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
                lista = (ArrayList<Cliente>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer archivo: " + e.getMessage());
            }
        }
        return lista;
    }

    private void escribirArchivo(ArrayList<Cliente> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + e.getMessage());
        }
    }
}
