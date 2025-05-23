/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersona;

/**
 *
 * @author Renzo
 */
public class Docente extends Persona {
     private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, int anioNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, anioNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion +
                           ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }

    public String getProfesion() {
        return profesion;
    }

    public String getSexo() {
        return sexo;
    }
}

