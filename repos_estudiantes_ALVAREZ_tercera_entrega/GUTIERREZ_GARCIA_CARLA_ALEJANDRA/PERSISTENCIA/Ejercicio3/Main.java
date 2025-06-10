package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");

        archivo.crearArchivo();

        archivo.guardarCliente(new Cliente(101, "Daniel", 76543210));
        archivo.guardarCliente(new Cliente(102, "Karen", 78912345));
        archivo.guardarCliente(new Cliente(103, "Mario", 76457893));

        System.out.println("--- Buscar Cliente con ID 102 ---");
        Cliente cli1 = archivo.buscarCliente(102);
        System.out.println(cli1 != null ? cli1 : "No encontrado");

        System.out.println("--- Buscar Celular del Cliente con ID 103 ---");
        Cliente cli2 = archivo.buscarCelularCliente(103);
        System.out.println(cli2 != null ? cli2 : "No encontrado");
    }
}
