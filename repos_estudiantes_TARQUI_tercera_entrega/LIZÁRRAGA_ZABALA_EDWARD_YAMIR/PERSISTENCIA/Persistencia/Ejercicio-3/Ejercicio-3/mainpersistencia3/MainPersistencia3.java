
package mainpersistencia3;

public class MainPersistencia3 {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");

        // a) Crear archivo
        archivo.crearArchivo();

        // a) Guardar clientes
        archivo.guardaCliente(new Cliente(1, "Carlos", 789654));
        archivo.guardaCliente(new Cliente(2, "Laura", 754321));
        archivo.guardaCliente(new Cliente(3, "Pedro", 777888));

        // b) Buscar cliente por ID
        Cliente cli = archivo.buscarCliente(2);
        if (cli != null) System.out.println("Cliente encontrado: " + cli);

        // c) Buscar número de celular por ID
        archivo.buscarCelularCliente(3);
    }
}

