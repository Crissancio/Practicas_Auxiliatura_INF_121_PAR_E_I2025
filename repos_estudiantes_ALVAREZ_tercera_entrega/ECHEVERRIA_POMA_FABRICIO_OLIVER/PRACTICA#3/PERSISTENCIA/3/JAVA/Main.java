/*
 * 
 * ----------------- EJERCICIO 3 -----------------
 * 
 * 
a) Implementar el diagrama de clases.
b) Implementa buscarCliente(int c) a través del id.
c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
junto al número de celular.
 * 
 * 
 */

public class Main {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("d:/UMSA/SEGUNDO SEMESTRE/PROGRAMACION II/PRACTICAS AUX/PRACTICA#3/PERSISTENCIA/3/JAVA/clientes.txt");
        archivo.crearArchivo();
        
        // a)
        Cliente cliente1 = new Cliente(1, "Juan", 123456789);
        Cliente cliente2 = new Cliente(2, "Maria", 987654321);
        archivo.guardarCliente(cliente1);
        archivo.guardarCliente(cliente2);
        
        // b)
        Cliente encontrado = archivo.buscarCliente(2);
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Cliente no encontrado");
        }
        
        // c)
        Cliente celular = archivo.buscarCelularCliente(1);
        if (celular != null) {
            System.out.println("Cliente con celular: " + celular);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}