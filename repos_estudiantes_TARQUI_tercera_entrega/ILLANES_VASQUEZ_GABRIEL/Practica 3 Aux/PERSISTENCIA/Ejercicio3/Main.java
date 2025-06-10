package Ejercicio3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArchivoCliente archivo = new ArchivoCliente("ArchivoCliente");

        Cliente c1 = new Cliente("Gaboxd", 1, 777123456);
        Cliente c2 = new Cliente("Luis", 2, 765432109);
        Cliente c3 = new Cliente("Jose", 3, 789654321);

        archivo.guardaCliente(c1);
        archivo.guardaCliente(c2);
        archivo.guardaCliente(c3);

        Cliente buscadoPorId = archivo.buscarCliente(3);
        System.out.println("Cliente encontrado por ID: " + buscadoPorId);

        Cliente buscadoPorCelular = archivo.buscarCelularCliente(789654321);
        System.out.println("Cliente encontrado por celular: " + buscadoPorCelular);
    }
}
