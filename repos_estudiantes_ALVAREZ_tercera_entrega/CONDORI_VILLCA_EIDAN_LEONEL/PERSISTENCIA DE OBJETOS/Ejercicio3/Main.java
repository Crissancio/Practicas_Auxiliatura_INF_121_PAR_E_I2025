package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();

        archivo.guardarCliente(new Cliente(1, "Maria", 12436578));
        archivo.guardarCliente(new Cliente(2, "Ian", 76543890));
        archivo.guardarCliente(new Cliente(3, "Juaquin", 87654987));

        System.out.println("Cliente con ID 2:");
        System.out.println(archivo.buscarCliente(2));

        System.out.println("\nCliente y celular con ID 3:");
        System.out.println(archivo.buscarCelularCliente(3));
    }
}
