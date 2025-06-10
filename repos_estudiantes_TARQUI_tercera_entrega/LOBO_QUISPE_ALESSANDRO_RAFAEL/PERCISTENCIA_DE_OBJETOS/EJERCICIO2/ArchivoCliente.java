import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class ArchivoCliente {
    private String nomA;
    private List<Cliente> clientes;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
        this.clientes = new ArrayList<>();
        crearArchivo();
    }

    public void crearArchivo() {
        try {
            File file = new File(nomA);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void guardaCliente(Cliente c) {
        clientes.add(c);
        guardarEnArchivo();
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.err.println("Error al guardar clientes: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void cargarClientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar clientes: " + e.getMessage());
            clientes = new ArrayList<>();
        }
    }

    // b) Buscar cliente por ID
    public Cliente buscarCliente(int id) {
        cargarClientes();
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    // c) Buscar cliente por teléfono celular
    public Cliente buscarCelularCliente(int telefono) {
        cargarClientes();
        for (Cliente c : clientes) {
            if (c.getTelefono() == telefono) {
                return c;
            }
        }
        return null;
    }
}
