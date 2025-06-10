/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_7;

/**
 *
 * @author WINDOWS 11
 */

public class Celular {
    private String[] nombresApps=new String[20];
    private int[] tamanosApps =new int[20];
    private int cantidadApps=0;
    private int espacioDisponible=1024;
    private double bateria=100;
    public void instalarApp(String nombre,int tamano){
        if(cantidadApps >=20){
            System.out.println("Ya hay 20 apps");
            return;
        }
        if(tamano > espacioDisponible){
            System.out.println("El celular esta lleno");
            return;
        }
        nombresApps[cantidadApps]=nombre;
        tamanosApps[cantidadApps]=tamano;
        cantidadApps++;
        espacioDisponible -= tamano;
        System.out.println(nombre+"App instalada");
    }
    public void usarApp(String nombre,int minutos){
        if(bateria<=0){
            System.out.println("Celular apagado");
            return;
        }
        int index=-1;
        for (int i=0; i<cantidadApps; i++){
            if(nombresApps[i].equals(nombre)){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("App no encontrada");
            return;
        }
        int tamano = tamanosApps[index];
        double consumo = (tamano > 250) ? 5 : (tamano > 100) ? 2 : 1;
        double total = (minutos / 10.0) * consumo;

        if (total >= bateria) {
            bateria = 0;
            System.out.println("Bateria agotada.");
        } else {
            bateria -= total;
            System.out.println("Bateria: " + bateria + "%");
        }
    }
     public void mostrarBateria(){
         System.out.println("Bateria: "+bateria+"%");
     }

 
     
   
        
}