public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();
        // Guardar clientes
        archivo.guardaCliente(new Cliente(1001, "Juan Pérez", 7654321));
        archivo.guardaCliente(new Cliente(1002, "Ana López", 7123456));
        // Buscar cliente por ID
        Cliente encontrado = archivo.buscarCliente(1002);
        System.out.println("Cliente encontrado: " + encontrado);
        // Buscar celular del cliente por ID
        Cliente celularCliente = archivo.buscarCelularCliente(1001);
        System.out.println("Datos del cliente con celular: " + celularCliente);
    }
}
