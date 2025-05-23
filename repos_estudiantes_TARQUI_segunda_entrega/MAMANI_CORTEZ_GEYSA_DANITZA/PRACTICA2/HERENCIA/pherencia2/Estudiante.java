/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Administrador
 */
public class Estudiante extends Persona{
    private String ru , fechaIngreso;
    private int semestre;

    public Estudiante(String ru, String fechaIngreso, int semestre, String ci, String nombre, String apellido, String celular, String fechaNac, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
     public int getEdad() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(getFechaNac(), fmt);
        return Period.between(fecha, LocalDate.now()).getYears();
    }
}
