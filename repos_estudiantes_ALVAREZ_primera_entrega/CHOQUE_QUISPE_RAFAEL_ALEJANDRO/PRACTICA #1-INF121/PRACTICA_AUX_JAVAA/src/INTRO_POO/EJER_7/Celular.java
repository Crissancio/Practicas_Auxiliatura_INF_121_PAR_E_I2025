/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package INTRO_POO.EJER_7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trabajo
 */

// FALTA IMPLEMENTACION DE APLICACION
public class Celular {
    private int espacioTotal;
    private List<Aplicacion> aplicaciones;
    private double bateria;

    public Celular() {
        this.espacioTotal = 1024;
        this.aplicaciones = new ArrayList<>();
        this.bateria = 100;
    }

    public void instalarAplicacion(String nombre, int tamano) {
        if (aplicaciones.size() < 20 && espacioTotal >= tamano) {
            aplicaciones.add(new Aplicacion(nombre, tamano));
            espacioTotal -= tamano;
            System.out.println("Aplicacion " + nombre + " instalada correctamente");
        } else {
            System.out.println("No se pudo instalar " + nombre + ", espacio insuficiente o límite de apps alcanzado");
        }
    }

    public void utilizarAplicacion(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado");
            return;
        }

        for (Aplicacion app : aplicaciones) {
            if (app.getNombre().equals(nombre)) {
                int tamano = app.getTamano();
                double consumo;
                
                if (tamano > 250) {
                    consumo = (minutos / 10.0) * 5;
                } else if (tamano > 100) {
                    consumo = (minutos / 10.0) * 2;
                } else {
                    consumo = (minutos / 10.0) * 1;
                }

                bateria -= consumo;
                if (bateria <= 0) {
                    bateria = 0;
                    System.out.println("El celular se apagó mientras usabas " + nombre);
                } else {
                    System.out.println("Usaste " + nombre + " por " + minutos + 
                                     " minutos y consumiste " + Math.round(consumo) + "% de bateria");
                }
                return;
            }
        }
        System.out.println("La aplicacion " + nombre + " no está instalada");
    }

    public void mostrarBateria() {
        System.out.println("Bateria restante: " + Math.round(bateria) + "%");
    }

    private static class Aplicacion {
        private String nombre;
        private int tamano;

        public Aplicacion(String nombre, int tamano) {
            this.nombre = nombre;
            this.tamano = tamano;
        }

        public String getNombre() {
            return nombre;
        }

        public int getTamano() {
            return tamano;
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.instalarAplicacion("Facebook", 300);
        celular.instalarAplicacion("WhatsApp", 80);
        celular.instalarAplicacion("YouTube", 150);

        celular.utilizarAplicacion("Facebook", 30);
        celular.mostrarBateria();

        celular.utilizarAplicacion("YouTube", 40);
        celular.mostrarBateria();

        celular.utilizarAplicacion("WhatsApp", 100);
        celular.mostrarBateria();
    }
}
