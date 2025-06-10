import java.io.*;
import java.util.Scanner;

public class ArchivoCliente {
    private String nombreArchivo;

    public ArchivoCliente(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        crearArchivo();
    }
    public void crearArchivo() {
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    public void guardarCliente(Cliente cliente) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            pw.println(cliente.getId() + "," + cliente.getNombre() + "," + cliente.getTelefono());
        } catch (IOException e) {
            System.err.println("Error al guardar cliente: " + e.getMessage());
        }
    }
    public Cliente buscarCliente(int id) {
        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                if (Integer.parseInt(datos[0]) == id) {
                    return new Cliente(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2]));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
        return null;
    }
    public Cliente buscarCelularCliente(int id) {
        return buscarCliente(id); 
    }
}
