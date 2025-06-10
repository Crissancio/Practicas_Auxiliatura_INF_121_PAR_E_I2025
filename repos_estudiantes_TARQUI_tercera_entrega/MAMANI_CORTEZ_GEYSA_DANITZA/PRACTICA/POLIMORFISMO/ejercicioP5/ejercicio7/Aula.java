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
public class Aula {
    private String nombre;
    private int capacidad,nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }
    //b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Capacidad: "+capacidad+" nroPupitres "+nropupitres);
    }
    public int cantidadMuebles() {
        return nropupitres;
    }
    public int cantidadMuebles(int nropupitres) {
        return nropupitres;
    }
}
