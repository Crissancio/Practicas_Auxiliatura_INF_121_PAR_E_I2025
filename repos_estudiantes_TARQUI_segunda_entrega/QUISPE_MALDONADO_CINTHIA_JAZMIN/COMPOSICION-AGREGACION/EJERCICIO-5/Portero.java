/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5compo;

/**
 *
 * @author CINTHIA
 */
public class Portero extends Jugador{
    private String habilidadEsp;
    public Portero(String nom,int nu,String habilidadESp){
        super(nom,nu,"Portero");
        this.habilidadEsp=habilidadESp;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Habilidad especial: " + habilidadEsp);
    }
}
