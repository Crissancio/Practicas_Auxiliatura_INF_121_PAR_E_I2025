/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicac2;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Avion {
    private String modelo,fabricante;
    private ArrayList<Parte> partes;
    public Avion(String a,String b)
    {
        this.modelo=a;
        this.fabricante=b;
        this.partes=new ArrayList<>();
    }

   
    public void agregar(Parte parte)
    {
        partes.add(parte);
    }
    public void MostrarAv()
    {
        System.out.println("Modelo: "+modelo+"fabricante: "+fabricante );
        for(Parte p: partes)
        {
            p.Mostrar();
        }
    }
}
