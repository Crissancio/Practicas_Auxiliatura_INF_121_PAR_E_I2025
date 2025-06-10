package Ejercicio3;
/*
a) Implementar el diagrama de clases.
b) Implementa buscarCliente(int c) a través del id.
c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
junto al número de celular.
*/
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Eliminar el archivo antes de continuar para evitar datos corruptos
        File file = new File("clientes.dat");
        if (file.exists()) {
            file.delete();
        }

        // Crear el archivo de clientes
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Juan Perez", 123456789);
        Cliente cliente2 = new Cliente(2, "Ana Lopez", 987654321);
        Cliente cliente3 = new Cliente(3, "Carlos Gomez", 456789123);

        // Guardar clientes en el archivo
        archivo.guardarCliente(cliente1);
        archivo.guardarCliente(cliente2);
        archivo.guardarCliente(cliente3);

        // Buscar un cliente por ID
        Cliente encontradoPorId = archivo.buscarCliente(2);
        if (encontradoPorId != null) {
            System.out.println("Cliente encontrado por ID: " + encontradoPorId);
        } else {
            System.out.println("Cliente con ID no encontrado.");
        }

        // Buscar un cliente por número de celular
        Cliente encontradoPorCelular = archivo.buscarCelularCliente(987654321);
        if (encontradoPorCelular != null) {
            System.out.println("Cliente encontrado por celular: " + encontradoPorCelular);
        } else {
            System.out.println("Cliente con celular no encontrado.");
        }
    }
}
