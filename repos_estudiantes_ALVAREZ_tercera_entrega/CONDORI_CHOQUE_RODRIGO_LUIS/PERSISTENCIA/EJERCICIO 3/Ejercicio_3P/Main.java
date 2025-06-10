package Ejercicio_3P;
/*3. Sea el siguiente diagrama de clases:
a) Implementar el diagrama de clases.
b) Implementa buscarCliente(int c) a través del id.
c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
junto al número de celular.*/
public class Main{
 public static void main(String[] args) {
     ArchivoCliente archivo = new ArchivoCliente();
     archivo.guardarCliente(new Cliente(1, "Pedro", 76543210));
     archivo.guardarCliente(new Cliente(2, "Juan", 76543220));

     System.out.println("Buscar ID: " + archivo.buscarCliente(1));
     System.out.println("Buscar Celular: " + archivo.buscarCelularCliente(76543220));
 }
}
