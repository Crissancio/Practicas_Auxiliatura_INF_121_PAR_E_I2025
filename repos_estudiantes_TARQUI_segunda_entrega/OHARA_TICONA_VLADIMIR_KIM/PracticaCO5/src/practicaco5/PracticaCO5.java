/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaco5;
class Computadora {
    String[] componentes = {"CPU", "RAM", "Disco Duro", "Pantalla"};
    boolean encendida = false;

    public void encender() {
        encendida = true;
        System.out.println("Computadora encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Computadora apagada.");
    }

    public void estado() {
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }
}
public class PracticaCO5{
    public static void main(String[] args) {
        Computadora c = new Computadora();
        c.estado();
        c.encender();
        c.estado();
        c.apagar();
        c.estado();
    }
}

