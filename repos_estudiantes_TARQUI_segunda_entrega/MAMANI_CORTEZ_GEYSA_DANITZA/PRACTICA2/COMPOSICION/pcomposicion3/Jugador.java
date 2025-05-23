/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion3;

/**
 *
 * @author Administrador
 */
public class Jugador {
    private String nombre, posicion,habilidadEspecial;
    private int numero;

    public Jugador(String nombre, String posicion, String habilidadEspecial, int numero) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.habilidadEspecial = habilidadEspecial;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void mostrarInfo(){
       System.out.println("\t"+numero+" "+nombre+" "+posicion+" "+habilidadEspecial); 
    }
}
