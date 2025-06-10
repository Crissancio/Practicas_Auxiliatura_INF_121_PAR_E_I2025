package com.mycompany.ejepersistenciaobj3;
/**
 *
 * @author Vladimir Ohara
 */
public class EjePersistenciaObj3 {

    public static void main(String[] args) {
       ArchivoCliente archivo = new ArchivoCliente("clientes.txt");

        Cliente c1 = new Cliente(1, "Ana", 123456);
        Cliente c2 = new Cliente(2, "Luis", 987651);
        Cliente c3 = new Cliente(3, "Carla", 111222);

        archivo.guardaCliente(c1);
        archivo.guardaCliente(c2);
        archivo.guardaCliente(c3);

        Cliente buscado = archivo.buscarCliente(2);
        if (buscado != null) {
            System.out.println("Cliente encontrado por ID:");
            System.out.println(buscado);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        Cliente buscadoTel = archivo.buscarCelularCliente(3);
        if (buscadoTel != null) {
            System.out.println("Datos del cliente con número:");
            System.out.println(buscadoTel);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
