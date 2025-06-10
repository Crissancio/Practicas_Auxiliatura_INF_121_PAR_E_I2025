package Persistencia.Ejer3.codigo;

//3.- Sea el siguiente diagrama de clases:
//a) Implementar el diagrama de clases.
//b) Implementa buscarCliente(int c) a través del id.
//c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
//junto al número de celular.

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivoCliente = new ArchivoCliente("clientes.txt");
        archivoCliente.crearArchivo();
        
       archivoCliente.guardarCliente(new Cliente(1, "Juan Perez", 123456789));
        archivoCliente.guardarCliente(new Cliente(2, "Maria Lopez", 987654321));
        archivoCliente.guardarCliente(new Cliente(3, "Carlos Garcia", 456789123));
        
        archivoCliente.buscarCliente(2);
        archivoCliente.buscarCelular(123456789); 
        archivoCliente.buscarCelular(111111111); 
    }
    
}
