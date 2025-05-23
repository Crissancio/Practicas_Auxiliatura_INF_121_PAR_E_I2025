/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia2;

/**
 *
 * @author Administrador
 */
public class Persona {
    private String ci,nombre,apellido,celular,fechaNac,sexo;

    public Persona(String ci, String nombre, String apellido, String celular,String fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void mostrarInfo() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
      // System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + sexo);
    }
    

}
