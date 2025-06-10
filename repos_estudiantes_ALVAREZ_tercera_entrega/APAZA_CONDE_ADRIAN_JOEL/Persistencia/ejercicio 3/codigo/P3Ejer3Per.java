/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3.ejer3.per;

/**
 *
 * @author Adrian
 */
/*
Ejercicio 3 : Persistencia
a) Implementar el diagrama de clases.
b) Implementar buscarCliente(int c) a traves del id.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con  sueldo mayor al ingresado.
*/
public class P3Ejer3Per {

    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.txt");
        archivo.crearArchivo();

        // a) guardando a los clientes
        Cliente cl1 = new Cliente(101, "Carlos", 76543210);
        Cliente cl2 = new Cliente(102, "María", 71234567);
        archivo.guardaCliente(cl1);
        archivo.guardaCliente(cl2);

        // b) buscando al cliente por su id
        Cliente buscado = archivo.buscarCliente(102);
        if (buscado != null) {
            System.out.println("Cliente encontrado: " + buscado.toString());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        // c) buscando al otro cliente incluyendo su num
        Cliente conCelular = archivo.buscarCelularCliente(101);
        if (conCelular != null) {
            System.out.println("Cliente con celular: " + conCelular.nombre + " - " + conCelular.telefono);
        } else {
            System.out.println("Cliente no encontrado para mostrar celular.");
        }
    }
}

