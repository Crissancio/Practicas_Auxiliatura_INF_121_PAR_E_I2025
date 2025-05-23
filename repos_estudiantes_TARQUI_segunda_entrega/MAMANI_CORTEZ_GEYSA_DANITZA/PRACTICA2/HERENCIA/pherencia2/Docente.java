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
public class Docente extends Persona{
    private String nit, profesion, especialidad;

    public Docente(String nit, String profesion, String especialidad, String ci, String nombre, String apellido, String celular, String fechaNac, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }
    public int getEdad() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(getFechaNac(), fmt);
        return Period.between(fecha, LocalDate.now()).getYears();
    }
}
