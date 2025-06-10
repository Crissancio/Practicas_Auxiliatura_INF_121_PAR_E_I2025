package Persistencia.ejercicio3.java;
import java.util.ArrayList;

class ArchivoCliente {
    private String nomA;
    private ArrayList<Cliente> clientes;

    public ArchivoCliente(String n) {
        this.nomA = n;
        this.clientes = new ArrayList<>();
    }

    public void crearArchivo() {
        clientes.clear();
    }

    public void guardaCliente(Cliente c) {
        clientes.add(c);
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
}

