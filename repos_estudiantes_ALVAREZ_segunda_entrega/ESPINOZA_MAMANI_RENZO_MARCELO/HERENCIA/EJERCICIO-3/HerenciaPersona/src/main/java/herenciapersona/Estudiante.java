/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersona;

/**
 *
 * @author Renzo
 */
public class Estudiante extends Persona{
    private String ru;
    private int anioIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, int anioNac,
                      String ru, int anioIngreso, int semestre) {
        super(ci, nombre, apellido, celular, anioNac);
        this.ru = ru;
        this.anioIngreso = anioIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Año Ingreso: " + anioIngreso + ", Semestre: " + semestre);
    }
}
