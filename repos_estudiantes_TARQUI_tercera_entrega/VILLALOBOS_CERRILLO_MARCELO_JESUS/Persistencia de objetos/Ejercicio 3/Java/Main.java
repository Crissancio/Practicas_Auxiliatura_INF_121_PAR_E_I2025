import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.txt");

        try {
            archivo.crearArchivo();

            archivo.guardarCliente(new Cliente(1, "Ana", 5936));
            archivo.guardarCliente(new Cliente(2, "Luis", 2398));
            archivo.guardarCliente(new Cliente(3, "Maria", 8484));


            Cliente c1 = archivo.buscarCliente(2);
            if (c1 != null) {
                System.out.println("Encontrado por ID: " + c1);
            } else {
                System.out.println("Cliente no encontrado por ID");
            }


            Cliente c2 = archivo.buscarCelularCliente(8484);
            if (c2 != null) {
                System.out.println("Cliente encontrado por teléfono: " + c2);
            } else {
                System.out.println("Cliente no encontrado por teléfono");
            }

        } catch (IOException e) {
            System.out.println("Error al trabajar con archivo: " + e.getMessage());
        }
    }
}