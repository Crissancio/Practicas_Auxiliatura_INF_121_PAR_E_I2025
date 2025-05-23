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
public class Docente extends Persona{
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - getFechaNac().getYear();
    }

    public LocalDate getFechaNac() {
        return super.getFechaNac();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesion: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sexo: " + sexo);
    }
   
}
