package Ejercicio3;
import java.io.*;
import java.util.ArrayList;
public class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(new ArrayList<Cliente>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarCliente(Cliente c) {
        ArrayList<Cliente> lista = leerClientes();
        lista.add(c);
        escribirClientes(lista);
    }

    public Cliente buscarCliente(int id) {
        ArrayList<Cliente> lista = leerClientes();
        for (int i = 0; i < lista.size(); i++) {
            Cliente c = lista.get(i);
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public Cliente buscarCelularCliente(int id) {
        ArrayList<Cliente> lista = leerClientes();
        for (int i = 0; i < lista.size(); i++) {
            Cliente c = lista.get(i);
            if (c.getId() == id) {
                System.out.println("Número de celular: " + c.getTelefono());
                return c;
            }
        }
        return null;
    }

    private ArrayList<Cliente> leerClientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Cliente>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void escribirClientes(ArrayList<Cliente> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
