import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nomArchivo;
    // Constructor
    public ArchivoCliente(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }
    //crear el archivo si no existe
    public void crearArchivo() {
        try {
            File file = new File(nomArchivo);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }
    //guardar un cliente en el archivo
    public void guardaCliente(Cliente cliente) {
        List<Cliente> clientes = leerClientes();
        clientes.add(cliente);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomArchivo))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Error al guardar cliente: " + e.getMessage());
        }
    }
    //leer todos los clientes del archivo
    public List<Cliente> leerClientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArchivo))) {
            return (List<Cliente>) ois.readObject();
        } catch (EOFException | FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer clientes: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    //buscar un cliente por ID
    public Cliente buscarCliente(int id) {
        for (Cliente cliente : leerClientes()) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
    //numero de teléfono de un cliente por ID
    public Cliente buscarCelularCliente(int id) {
        return buscarCliente(id);
    }
}
