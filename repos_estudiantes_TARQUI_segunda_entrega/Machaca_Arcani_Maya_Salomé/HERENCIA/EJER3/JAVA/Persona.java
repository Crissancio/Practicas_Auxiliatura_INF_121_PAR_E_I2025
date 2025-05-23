/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER2;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class Persona {
        private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private LocalDate fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nac.: " + fechaNac);
    }
    
}
