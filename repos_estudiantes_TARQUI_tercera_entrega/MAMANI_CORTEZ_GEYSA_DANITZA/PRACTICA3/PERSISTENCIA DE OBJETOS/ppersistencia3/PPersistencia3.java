/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia3;

/**
 *
 * @author Administrador
 */
public class PPersistencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoFarmacia archivo = new ArchivoFarmacia("farmacias.dat");
        archivo.crearArchivo();

        // a)Crear, leer y mostrar un Archivo de Farmacias
        archivo.adicionar(); 
        System.out.println("---Mostrar Datos---");
        archivo.listar();
        
        System.out.println("---2. mostrar medicamentos para la tos--");
        // b)Mostrar los medicamentos para la tos, de la Sucursal numero X
        archivo.mostrarMTos(2);
        System.out.println("---3. mostrar sucursal y direccio para el medicamento Golpex---");
        //c) Mostrar el número de sucursal y su dirección que tienen el medicamento “Golpex”
        archivo.mostrarFGolpex();
    }
    
}
