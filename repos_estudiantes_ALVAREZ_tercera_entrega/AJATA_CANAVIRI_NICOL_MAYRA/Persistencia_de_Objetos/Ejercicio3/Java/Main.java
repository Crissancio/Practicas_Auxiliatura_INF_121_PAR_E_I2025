package Persistencia_de_Objetos.Ejercicio3.Java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nombreArchivoClientes = "lientes_ejercicio3.txt";
        ArchivoCliente archivoCliente = new ArchivoCliente(nombreArchivoClientes);

        archivoCliente.limpiarArchivo();

        System.out.println("\n--- Guardando Clientes ---");
        Cliente cli1 = new Cliente(101, "Ana Lopez", 77712345);
        Cliente cli2 = new Cliente(102, "Juan Perez", 70098765);
        Cliente cli3 = new Cliente(103, "Maria Gomez", 61234567);
        Cliente cli4 = new Cliente(104, "Pedro Sanchez", 77712345); // Otro cliente con el mismo teléfono

        archivoCliente.guardaCliente(cli1);
        archivoCliente.guardaCliente(cli2);
        archivoCliente.guardaCliente(cli3);
        archivoCliente.guardaCliente(cli4);

        System.out.println("\n--- Buscando Cliente por ID ---");
        // b)
        int idBusqueda1 = 102;
        Cliente clienteEncontradoId1 = archivoCliente.buscarCliente(idBusqueda1);
        if (clienteEncontradoId1 != null) {
            System.out.println("Cliente con ID " + idBusqueda1 + " encontrado: " + clienteEncontradoId1);
        } else {
            System.out.println("Cliente con ID " + idBusqueda1 + " no encontrado.");
        }

        int idBusqueda2 = 105;
        Cliente clienteEncontradoId2 = archivoCliente.buscarCliente(idBusqueda2);
        if (clienteEncontradoId2 != null) {
            System.out.println("Cliente con ID " + idBusqueda2 + " encontrado: " + clienteEncontradoId2);
        } else {
            System.out.println("Cliente con ID " + idBusqueda2 + " no encontrado.");
        }

        System.out.println("\n--- Buscando Cliente por Numero de Celular ---");
        // c) 
        int telefonoBusqueda1 = 77712345;
        Cliente clienteEncontradoTel1 = archivoCliente.buscarCelularCliente(telefonoBusqueda1);
        if (clienteEncontradoTel1 != null) {
          
            System.out.println("Cliente con celular " + telefonoBusqueda1 + " encontrado: " + clienteEncontradoTel1);
        } else {
            System.out.println("Cliente con celular " + telefonoBusqueda1 + " no encontrado.");
        }

        int telefonoBusqueda2 = 60000000;
        Cliente clienteEncontradoTel2 = archivoCliente.buscarCelularCliente(telefonoBusqueda2);
        if (clienteEncontradoTel2 != null) {
            System.out.println("Cliente con celular " + telefonoBusqueda2 + " encontrado: " + clienteEncontradoTel2);
        } else {
            System.out.println("Cliente con celular " + telefonoBusqueda2 + " no encontrado.");
        }

        System.out.println("\nContenido final del archivo '" + nombreArchivoClientes + "':");
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivoClientes))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo para mostrar su contenido final: " + e.getMessage());
        }
    }
}
