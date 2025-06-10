/*
a) Implementar el diagrama de clases.
b) Implementa buscarCliente(int c) a través del id.
c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
junto al número de celular.
 */
package cliente;
public class App {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.txt");
        archivo.crearArchivo();

        // Guardar algunos clientes
        archivo.guardaCliente(new Cliente(1, "Carlos", 111222333));
        archivo.guardaCliente(new Cliente(2, "Lucía", 444555666));

        // Buscar por ID y mostrar datos
        Cliente encontrado = archivo.buscarCelularCliente(2);
        if (encontrado != null) {
            System.out.println("Cliente encontrado: " + encontrado);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
