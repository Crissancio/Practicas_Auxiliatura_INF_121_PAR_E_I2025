/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersona;

/**
 *
 * @author Renzo
 */
public class Persona {
     protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected int anioNac;

    public Persona(String ci, String nombre, String apellido, String celular, int anioNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.anioNac = anioNac;
    }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido +
                           ", Celular: " + celular + ", Año Nacimiento: " + anioNac);
    }

    public int getEdad(int anioActual) {
        return anioActual - anioNac;
    }

    public String getApellido() {
        return apellido;
    }
}
