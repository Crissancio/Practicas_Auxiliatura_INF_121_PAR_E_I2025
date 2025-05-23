/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author CINTHIA
 */
public class Persona {
    private int ci, celular;
    private String nombre,apellido,fecha_Nac;
    public Persona(){
        this.ci=0;
        this.nombre="";
        this.apellido="";
        this.celular=0;
        this.fecha_Nac="";
    }
    public Persona(int c,String nom,String ape,int ce,String fecN){
        this.ci=c;
        this.nombre=nom;
        this.apellido=ape;
        this.celular=ce;
        this.fecha_Nac=fecN;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
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

    public String getFecha_Nac() {
        return fecha_Nac;
    }

    public void setFecha_Nac(String fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }
    public void mostrar(){
        System.out.println("CI:"+this.ci);
        System.out.println("Nombre:"+this.nombre);
        System.out.println("ApellidoI:"+this.apellido);
        System.out.println("Celular:"+this.celular);
        System.out.println("Fecha de Nacimiento:"+this.fecha_Nac);
                
    }
    public int edad(){
        int anoN=Integer.parseInt(fecha_Nac.substring(6, 10));
        int anoActual=2025;
        return anoActual-anoN;
    }
}
