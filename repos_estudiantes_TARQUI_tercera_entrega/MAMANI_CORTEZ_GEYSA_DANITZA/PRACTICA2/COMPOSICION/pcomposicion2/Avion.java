/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion2;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Avion {
    private String modelo, fabricante;
    private ArrayList <Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        partes=new ArrayList<Parte>();
    }
    public void agregarParte(Parte p) {
        partes.add(p);
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Modelo:"+ modelo);
        System.out.println("Fabricante :"+ fabricante);
        System.out.println("Partes:");
        for (Parte p : partes) 
            p.mostrarInfo();
    }
}
