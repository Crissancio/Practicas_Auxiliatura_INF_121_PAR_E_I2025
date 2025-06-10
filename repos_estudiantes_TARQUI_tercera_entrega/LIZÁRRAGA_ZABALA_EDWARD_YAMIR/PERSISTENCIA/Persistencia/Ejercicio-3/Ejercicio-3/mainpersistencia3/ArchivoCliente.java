
package mainpersistencia3;

import java.io.*;
import java.util.ArrayList;

public class ArchivoCliente {
    private String nomA;

    // Constructor: ArchivoCliente(n: String)
    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    // a) crearArchivo(): sobreescribe archivo existente
    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            System.out.println("Archivo de clientes creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    // a) guardaCliente(Cliente c): reescribe todos para evitar encabezado duplicado
    public void guardaCliente(Cliente c) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            while (true) {
                clientes.add((Cliente) ois.readObject());
            }
        } catch (EOFException ignored) {
        } catch (Exception ex) {
            System.out.println("Nota: el archivo estaba vacío o no se pudo leer.");
        }

        clientes.add(c);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            for (Cliente cli : clientes) {
                oos.writeObject(cli);
            }
            System.out.println("Cliente guardado.");
        } catch (IOException ex) {
            System.out.println("Error al guardar cliente: " + ex.getMessage());
        }
    }

    // b) buscarCliente(int id)
    public Cliente buscarCliente(int id) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            while (true) {
                Cliente cli = (Cliente) ois.readObject();
                if (cli.getId() == id) return cli;
            }
        } catch (EOFException e) {
            System.out.println("Cliente no encontrado.");
        } catch (Exception ex) {
            System.out.println("Error al buscar cliente: " + ex.getMessage());
        }
        return null;
    }

    // c) buscarCelularCliente(int id)
    public Cliente buscarCelularCliente(int id) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            while (true) {
                Cliente cli = (Cliente) ois.readObject();
                if (cli.getId() == id) {
                    System.out.println("Telefono del cliente: " + cli.getTelefono());
                    return cli;
                }
            }
        } catch (EOFException e) {
            System.out.println("Cliente no encontrado.");
        } catch (Exception ex) {
            System.out.println("Error al buscar teléfono: " + ex.getMessage());
        }
        return null;
    }
}

