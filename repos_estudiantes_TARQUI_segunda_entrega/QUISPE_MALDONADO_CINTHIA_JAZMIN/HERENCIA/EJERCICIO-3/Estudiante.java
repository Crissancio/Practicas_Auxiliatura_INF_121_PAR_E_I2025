/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author CINTHIA
 */
public class Estudiante extends Persona{
    private int ru, semestre;
    private String fecha_ingreso;
    Estudiante(){
        super();
        this.ru=0;
        this.fecha_ingreso="";
        this.semestre=1;
    }
    Estudiante(int c,String nom,String ape,int ce,String fecN,int ru,String fecI,int sem){
        super(c,nom,ape,ce,fecN);
        this.ru=ru;
        this.fecha_ingreso=fecI;
        this.semestre=sem;
    }

    public int getRu() {
        return ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
     @Override
     public void mostrar(){
        System.out.println("---------Estudiante----");
        super.mostrar();
        System.out.println("RU:"+this.ru);
        System.out.println("Fecha de Nacimiento:"+this.fecha_ingreso);
        System.out.println("Sementre:"+this.semestre);
                
    }
}
