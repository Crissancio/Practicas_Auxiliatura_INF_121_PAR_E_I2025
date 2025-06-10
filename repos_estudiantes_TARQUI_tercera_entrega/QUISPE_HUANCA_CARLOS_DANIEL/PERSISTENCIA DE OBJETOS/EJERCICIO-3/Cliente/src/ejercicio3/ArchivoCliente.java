package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ArchivoCliente {
    private String nomA;
    private List<Cliente> clientes;

    public ArchivoCliente(String n) {
        this.nomA = n;
        this.clientes = new ArrayList<>();
    }

    public void crearArchivo() {
        this.clientes = new ArrayList<>();
    }

    public void guardaCliente(Cliente c) {
        this.clientes.add(c);
    }

    public Cliente buscarCliente(int c) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == c) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarCelularCliente(int c) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefono() == c) {
                return cliente;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes_db");
        archivo.crearArchivo();

        Cliente cliente1 = new Cliente(1, "Juan Pérez", 65281904);
        Cliente cliente2 = new Cliente(2, "María García", 77823412);
        Cliente cliente3 = new Cliente(3, "Carlos López", 66832910);

        archivo.guardaCliente(cliente1);
        archivo.guardaCliente(cliente2);
        archivo.guardaCliente(cliente3);

        Cliente encontrado = archivo.buscarCliente(2);
        if (encontrado != null) {
            System.out.printf("Cliente encontrado por ID: %s, Tel: %d%n", 
                encontrado.getNombre(), encontrado.getTelefono());
        }

        encontrado = archivo.buscarCelularCliente(66832910);
        if (encontrado != null) {
            System.out.printf("Cliente encontrado por celular: %s, Tel: %d%n",
                encontrado.getNombre(), encontrado.getTelefono());
        }
    }
}