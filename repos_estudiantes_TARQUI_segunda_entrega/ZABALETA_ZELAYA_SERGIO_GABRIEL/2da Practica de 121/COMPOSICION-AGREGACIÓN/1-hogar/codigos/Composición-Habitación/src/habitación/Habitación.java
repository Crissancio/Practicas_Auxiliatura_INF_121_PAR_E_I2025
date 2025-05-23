/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitación;

/**
 *
 * @author davin
 */
public class Habitación {
    private String nombre;
    private double tamaño;
    
    public Habitación(String n, double t)
    {
        this.nombre=n;
        this.tamaño=t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Tamano: "+tamaño);
    }
}
