import java.io.*;
import java.util.ArrayList;
public class ArchivoCliente {
    private String nombreArchivo;

    public ArchivoCliente(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(new ArrayList<Cliente>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarCliente(Cliente c) {
        ArrayList<Cliente> clientes = leerArchivo();
        clientes.add(c);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void mostrarSaldoMayor(double monto) {
        ArrayList<Cliente> clientes = leerArchivo();
        for (Cliente c : clientes) {
            if (c.getSaldo() > monto) {
                System.out.println(c);
            }
        }
    }
    public void contarClientesBanco(String banco) {
        ArrayList<Cliente> clientes = leerArchivo();
        int count = 0;
        for (Cliente c : clientes) {
            if (c.getBanco().equalsIgnoreCase(banco)) {
                count++;
            }
        }
        System.out.println("Clientes en banco '" + banco + "': " + count);
    }
    @SuppressWarnings("unchecked")
    public ArrayList<Cliente> leerArchivo() {
        ArrayList<Cliente> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            lista = (ArrayList<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Archivo vacío o no encontrado.");
        }
        return lista;
    }
}