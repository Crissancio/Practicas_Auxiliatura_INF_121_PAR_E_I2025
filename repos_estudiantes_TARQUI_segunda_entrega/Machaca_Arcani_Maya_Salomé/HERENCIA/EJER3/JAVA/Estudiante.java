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
public class Estudiante extends Persona{
        private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                      String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - getFechaNac().getYear();
    }

    public int getSemestre() {
        return semestre;
    }

    public String getRU() {
        return ru;
    }

    public LocalDate getFechaNac() {
        return super.getFechaNac();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
}
