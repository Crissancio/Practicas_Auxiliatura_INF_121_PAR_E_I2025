import java.util.ArrayList;

public class Main {

    static class Cliente {
        int id;
        String nombre;
        int edad;
        String ciudad;
        int celular;

        Cliente(int id, String nombre, int edad, String ciudad, int celular) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.ciudad = ciudad;
            this.celular = celular;
        }
    }

    static class ArchivoCliente {
        ArrayList<Cliente> clientes = new ArrayList<>();

        void guardarCliente(Cliente c) {
            for (Cliente cliente : clientes) {
                if (cliente.id == c.id) {
                    System.out.println("Cliente con ID " + c.id + " ya existe. No se agregó.");
                    return;
                }
            }
            clientes.add(c);
        }

        Cliente buscarCliente(String nombre) {
            for (Cliente c : clientes) {
                if (c.nombre.equalsIgnoreCase(nombre)) {
                    return c;
                }
            }
            return null;
        }

        Cliente buscarCliente(int id) {
            for (Cliente c : clientes) {
                if (c.id == id) {
                    return c;
                }
            }
            return null;
        }

        void buscarCelularCliente(int id) {
            Cliente c = buscarCliente(id);
            if (c != null) {
                System.out.println("ID: " + c.id + ", Nombre: " + c.nombre + ", Edad: " + c.edad + ", Ciudad: " + c.ciudad + ", Celular: " + c.celular);
            } else {
                System.out.println("Cliente con ID " + id + " no encontrado.");
            }
        }

        void mostrarClientesCiudad(String ciudad) {
            boolean encontrado = false;
            for (Cliente c : clientes) {
                if (c.ciudad.equalsIgnoreCase(ciudad)) {
                    System.out.println(c.nombre + ", " + c.edad + ", " + c.ciudad + ", " + c.celular);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No hay clientes en la ciudad: " + ciudad);
            }
        }
    }

    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente();

        archivo.guardarCliente(new Cliente(1, "Ana", 25, "La Paz", 76543210));
        archivo.guardarCliente(new Cliente(2, "Luis", 30, "Cochabamba", 71234567));
        archivo.guardarCliente(new Cliente(3, "Eduardo", 40, "La Paz", 79876543));

        Cliente buscado = archivo.buscarCliente("Ana");
        if (buscado != null)
            System.out.println("Encontrado: " + buscado.nombre + ", " + buscado.ciudad);
        else
            System.out.println("Cliente no encontrado.");

        System.out.println("\nClientes en La Paz:");
        archivo.mostrarClientesCiudad("La Paz");

        System.out.println("\nBuscar cliente por ID 2:");
        Cliente clientePorId = archivo.buscarCliente(2);
        if (clientePorId != null) {
            System.out.println("Cliente ID 2: " + clientePorId.nombre + ", " + clientePorId.ciudad);
        } else {
            System.out.println("Cliente no encontrado por ID.");
        }

        System.out.println("\nBuscar cliente y celular por ID 3:");
        archivo.buscarCelularCliente(3);
    }
}
