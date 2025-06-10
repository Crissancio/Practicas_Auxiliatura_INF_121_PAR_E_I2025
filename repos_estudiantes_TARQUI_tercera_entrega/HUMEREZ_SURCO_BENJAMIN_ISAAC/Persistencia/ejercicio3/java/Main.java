package Persistencia.ejercicio3.java;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.txt");
        archivo.guardaCliente(new Cliente(1, "Ana", 123456));
        archivo.guardaCliente(new Cliente(2, "Luis", 987654));

        System.out.println(archivo.buscarCliente(1)); // Busca por ID
        System.out.println(archivo.buscarCelularCliente(987654)); // Busca por teléfono
    }
}
