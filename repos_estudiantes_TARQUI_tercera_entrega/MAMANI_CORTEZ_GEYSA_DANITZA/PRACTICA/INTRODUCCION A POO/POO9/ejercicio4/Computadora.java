/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Administrador
 */
class Computadora {
    private String procesador;
    private int memoriaRAM;
    private int almacenamiento;
    private boolean encendida;

    public Computadora(String procesador, int memoriaRAM, int almacenamiento) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.encendida = false;
    }
    //B) Muestra el estado de la computadora (encendido o apagado)
    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }
    //a) Muestra los componentes principales de la computadora
    public void mostrar() {
        System.out.println("Procesador: " + procesador+" Memoria RAM: " + memoriaRAM+" Almacenamiento: " + almacenamiento );
        System.out.println("Estado: ");
        if(encendida==true){
            System.out.println("\tEncendida");
        }
        else{
             System.out.println("\tApagada");
        }
    }
}
