package PERSISTENCIA.Ejercicio3.Java;

import java.io.*;
import java.util.ArrayList;

public class GestorCliente {
    private final String archivo = "clientes.dat";

    public void guardarCliente(Cliente c) {
        ArrayList<Cliente> lista = leerTodos();
        lista.add(c);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cliente> leerTodos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Cliente>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public Cliente buscarCliente(int id) {
        for (Cliente c : leerTodos()) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public String buscarCelularCliente(int id) {
        Cliente c = buscarCliente(id);
        if (c != null) {
            return "Datos del cliente: " + c + "\nCelular: " + c.getCelular();
        }
        return "Cliente no encontrado.";
    }
}

