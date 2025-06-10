public class Main {
    public static void main(String[] args) {
        
        ArchivoCliente archivo = new ArchivoCliente("clientes.txt");
        
        Cliente cliente1 = new Cliente(1, "Juan Perez", 5551234);
        Cliente cliente2 = new Cliente(2, "Maria Garcia", 5555678);
        Cliente cliente3 = new Cliente(3, "Carlos Lopez", 5559012);
 
        archivo.guardarCliente(cliente1);
        archivo.guardarCliente(cliente2);
        archivo.guardarCliente(cliente3);

        System.out.println("\n=== Buscar cliente por ID (2) ===");
        Cliente encontrado = archivo.buscarCliente(2);
        System.out.println(encontrado != null ? encontrado : "No encontrado");
 
        System.out.println("\n=== Buscar celular de cliente (3) ===");
        Cliente conCelular = archivo.buscarCelularCliente(3);
        if (conCelular != null) {
            System.out.println("Telefono de " + conCelular.getNombre() + ": " + conCelular.getTelefono());
        } 
        else 
        {
            System.out.println("Cliente no encontrado");
        }

        System.out.println("\n=== Buscar cliente inexistente (99) ===");
        Cliente noExiste = archivo.buscarCliente(99);
        System.out.println(noExiste != null ? noExiste : "Cliente no encontrado");
    }
}
