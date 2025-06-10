package Persistencia_de_Objetos.Ejercicio2;
import java.io.*;
import java.util.ArrayList;

public class AppCliente implements Serializable {
    
    static class Cliente implements Serializable {
        private int id;
        private String nombre;
        private int telefono;

        public Cliente(int id, String nombre, int telefono) {
            this.id = id;
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public int getId() {
            return id;
        }

        public int getTelefono() {
            return telefono;
        }

        public String toString() {
            return "ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + telefono;
        }
    }

    static class ArchivoCliente {
        private String nomA;

        public ArchivoCliente(String nomA) {
            this.nomA = nomA;
        }

        public void crearArchivo() {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
                out.writeObject(new ArrayList<Cliente>());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void guardaCliente(Cliente c) {
            ArrayList<Cliente> clientes = leerClientes();
            clientes.add(c);
            escribirClientes(clientes);
        }

        private ArrayList<Cliente> leerClientes() {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
                return (ArrayList<Cliente>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                return new ArrayList<>();
            }
        }

        private void escribirClientes(ArrayList<Cliente> clientes) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
                out.writeObject(clientes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Cliente buscarCliente(int id) {
            for (Cliente c : leerClientes()) {
                if (c.getId() == id)
                    return c;
            }
            return null;
        }

        public Cliente buscarCelularCliente(int telefono) {
            for (Cliente c : leerClientes()) {
                if (c.getTelefono() == telefono)
                    return c;
            }
            return null;
        }
    }

  
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();

        Cliente c1 = new Cliente(1, "noemi", 123456);
        Cliente c2 = new Cliente(2, "daniel", 987654);

        archivo.guardaCliente(c1);
        archivo.guardaCliente(c2);

        Cliente encontrado = archivo.buscarCliente(1);
        if (encontrado != null) {
            System.out.println("Cliente por ID: " + encontrado);
        }

        Cliente porCelular = archivo.buscarCelularCliente(987654);
        if (porCelular != null) {
            System.out.println("Cliente por Celular: " + porCelular);
        }
    }
}
