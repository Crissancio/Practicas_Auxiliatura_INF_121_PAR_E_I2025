import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Cliente implements Serializable {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "Cliente [ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + telefono + "]";
    }
}

class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try {
            new File(nomA).createNewFile();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public void guardarCliente(Cliente cliente) {
        List<Cliente> clientes = leerClientes();
        clientes.add(cliente);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(clientes);
        } catch (IOException ex) {
            System.out.println("Error al guardar cliente: " + ex.getMessage());
        }
    }

    private List<Cliente> leerClientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (List<Cliente>) ois.readObject();
        } catch (EOFException e) {
            return new ArrayList<>(); // Archivo vacío
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al leer clientes: " + ex.getMessage());
            return new ArrayList<>();
        }
    }

    public Cliente buscarCliente(int id) {
        List<Cliente> clientes = leerClientes();
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public Cliente buscarCelularCliente(int telefono) {
        List<Cliente> clientes = leerClientes();
        for (Cliente c : clientes) {
            if (c.getTelefono() == telefono) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();

        // Guardar clientes
        archivo.guardarCliente(new Cliente(1, " Belen Alvarez", 63456789));
        archivo.guardarCliente(new Cliente(2, "Luis Gómez", 72555678));
        archivo.guardarCliente(new Cliente(3, "María López", 62512345));
        archivo.guardarCliente(new Cliente(4, "Carlos Ruiz", 71234567));
        archivo.guardarCliente(new Cliente(5, "Laura Torres", 63098765));
        archivo.guardarCliente(new Cliente(6, "Pedro Martínez", 67070123));
        archivo.guardarCliente(new Cliente(7, "Sofía Jiménez", 62585756));


        // Buscar por ID
        Cliente buscado = archivo.buscarCliente(5);
        System.out.println("Cliente encontrado por ID: " + buscado);

        // Buscar por teléfono
        Cliente porCelular = archivo.buscarCelularCliente(62585756);
        System.out.println("Cliente encontrado por teléfono: " + porCelular);
    }
}
