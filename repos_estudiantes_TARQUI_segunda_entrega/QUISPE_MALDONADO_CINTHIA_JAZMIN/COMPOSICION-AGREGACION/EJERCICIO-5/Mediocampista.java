/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5compo;

/**
 *
 * @author CINTHIA
 */
public class Mediocampista extends Jugador{
    private String habilidadEsp;
    public Mediocampista(String nom,int n,String habilidadEsp){
        super(nom,n,"Mediocampista");
        this.habilidadEsp=habilidadEsp;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Habilidad especial: " + habilidadEsp);
    }
}
