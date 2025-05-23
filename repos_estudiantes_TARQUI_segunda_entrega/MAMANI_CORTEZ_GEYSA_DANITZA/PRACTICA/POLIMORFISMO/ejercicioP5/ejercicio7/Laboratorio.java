/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Administrador
 */
public class Laboratorio {
    private String nombre;
    private int capacidad,nroMesas, nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }
    //b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar(){
        System.out.println("Nombre: "+nombre );
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Nro Mesas: "+nroMesas);
        System.out.println("Nro Sillas: "+nroSillas);
    }
    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
    public int cantidadMuebles(int nroSillas) {
        return nroMesas * nroSillas;
    }
}
