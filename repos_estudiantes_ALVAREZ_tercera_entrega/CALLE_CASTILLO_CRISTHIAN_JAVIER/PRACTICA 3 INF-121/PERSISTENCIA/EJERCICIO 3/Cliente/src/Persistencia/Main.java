package Persistencia;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear clientes de prueba
        Cliente cli1 = new Cliente(1, "Juan Pérez", "555-1234");
        Cliente cli2 = new Cliente(2, "María Gómez", "555-5678");
        Cliente cli3 = new Cliente(3, "Carlos Ruiz", "555-9012");
        
        // Guardar clientes en el archivo
        PersistenciaClientes.guardarCliente(cli1);
        PersistenciaClientes.guardarCliente(cli2);
        PersistenciaClientes.guardarCliente(cli3);
        
        // Buscar cliente por ID
        System.out.println("\nBuscando cliente con ID 2:");
        Cliente encontrado = PersistenciaClientes.buscarCliente(2);
        if (encontrado != null) {
            System.out.println("Cliente encontrado: " + encontrado);
        } else {
            System.out.println("Cliente no encontrado");
        }
        
        // Buscar celular de cliente
        System.out.println("\nBuscando datos completos del cliente con ID 3:");
        Map<String, String> datos = PersistenciaClientes.buscarCelularCliente(3);
        if (datos != null) {
            System.out.println("Datos del cliente:");
            for (Map.Entry<String, String> entry : datos.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("Cliente no encontrado");
        }
        
        // Prueba con cliente no existente
        System.out.println("\nBuscando cliente con ID 99:");
        Cliente noExiste = PersistenciaClientes.buscarCliente(99);
        if (noExiste == null) {
            System.out.println("Cliente no encontrado (como se esperaba)");
        }
    }
}
