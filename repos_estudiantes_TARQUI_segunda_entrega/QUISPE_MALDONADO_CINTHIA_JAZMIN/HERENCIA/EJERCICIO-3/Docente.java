/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author CINTHIA
 */
public class Docente extends Persona{
    private int nit;
    private String profesion,especialidad,sexo;
    Docente(){
        super();
        this.nit=0;
        this.profesion="";
        this.especialidad="";
        this.sexo="";
        
    }
    Docente(int c,String nom,String ape,int ce,String fecN,int nit,String pro,String esp,String sexo){
        super(c,nom,ape,ce,fecN);
        this.nit=nit;
        this.profesion=pro;
        this.especialidad=esp;
        this.sexo=sexo;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public void mostrar(){
        System.out.println("---------DOCENTE------------");
        super.mostrar();
        System.out.println("NIT: "+this.nit);
        System.out.println("Profesion: "+this.profesion);
        System.out.println("Especialidad: "+this.especialidad);
        System.out.println("Sexo: "+this.sexo);
                
    }
}
