package ej3persistencia;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.json");

        archivo.guardarCliente(new Cliente(1, "Jose", "76640210"));
        archivo.guardarCliente(new Cliente(2, "Sara", "94301234"));
        archivo.guardarCliente(new Cliente(3, "Andre", "70970456"));

        Cliente clienteEncontrado = archivo.buscarCliente(2);
        System.out.println("Cliente encontrado por ID: " + (clienteEncontrado != null ? clienteEncontrado : "Cliente no encontrado."));

        System.out.println("Cliente encontrado: " + archivo.buscarCelularCliente(3));
    }
}
