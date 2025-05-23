/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac2_3;

/**
 *
 * @author WINDOWS 11
 */
public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, int fechaNac,
                   String nit, String profesion, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.sexo = sexo;
    }



    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void mostrar() {
       super.mostrar();
        System.out.println("nit: " + nit +" profesión: " + profesion + " "+sexo);
    }

}

