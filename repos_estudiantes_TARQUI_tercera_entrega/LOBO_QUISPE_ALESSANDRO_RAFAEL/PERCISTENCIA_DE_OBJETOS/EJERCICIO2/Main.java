public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");

        // Agregar clientes de prueba
        archivo.guardaCliente(new Cliente(1, "Juan Pérez", 5551234));
        archivo.guardaCliente(new Cliente(2, "María García", 5555678));
        archivo.guardaCliente(new Cliente(3, "Carlos López", 5559012));

        // Prueba buscar por ID
        Cliente encontrado = archivo.buscarCliente(2);
        System.out.println("Cliente encontrado por ID: " + encontrado);

        // Prueba buscar por teléfono
        Cliente porTelefono = archivo.buscarCelularCliente(5559012);
        System.out.println("Cliente encontrado por teléfono: " + porTelefono);
    }
}
