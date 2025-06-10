/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia2;

/**
 *
 * @author Administrador
 */
public class PPersistencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();

        Cliente c1 = new Cliente(1, "Carla", 66666);
        Cliente c2 = new Cliente(2, "Lucía", 77777);
        Cliente c3 = new Cliente(3, "Paolo", 88888);

        archivo.guardaCliente(c1);
        archivo.guardaCliente(c2);
        archivo.guardaCliente(c3);

        // b)Implementa buscarCliente(int c) a través del id.
        
        Cliente encontrado = archivo.buscarCliente(3);
        System.out.println("Buscar por ID: " + (encontrado != null ? encontrado : "No encontrado"));

        //c)mplementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular
        Cliente encontradoCel = archivo.buscarCelularCliente(77778);
        System.out.println("Buscar por celular : " + (encontradoCel != null ? encontradoCel : "No encontrado"));
    }
    
}
