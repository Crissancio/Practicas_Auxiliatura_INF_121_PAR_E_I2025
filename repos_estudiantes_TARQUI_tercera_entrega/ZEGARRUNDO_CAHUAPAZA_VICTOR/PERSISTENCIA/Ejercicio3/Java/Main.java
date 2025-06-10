package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");

        archivo.guardarCliente(new Cliente(1, "Pedro", 76543210));
        archivo.guardarCliente(new Cliente(2, "Lucía", 71234567));

        Cliente encontrado = archivo.buscarCliente(1);
        if (encontrado != null) {
            System.out.println("Cliente encontrado: " + encontrado);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        Cliente conCelular = archivo.buscarCelularCliente(2);
        if (conCelular != null) {
            System.out.println("Datos completos: " + conCelular);
        } else {
            System.out.println("Cliente no encontrado para celular.");
        }
    }
}