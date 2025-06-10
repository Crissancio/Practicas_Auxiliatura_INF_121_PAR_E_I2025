package persistencia;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();

        Cliente c1 = new Cliente(1, "Juan Perez", 123456789);
        Cliente c2 = new Cliente(2, "Maria Lopez", 987654321);

        archivo.guardaCliente(c1);
        archivo.guardaCliente(c2);

        System.out.println(archivo.buscarCliente(1));
        System.out.println(archivo.buscarCelularCliente(2));
    }
}