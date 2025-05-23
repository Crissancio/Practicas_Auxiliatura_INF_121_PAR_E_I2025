package HERENCIA.Ejer3.codigo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Estudiante extends Persona {
    private int ru;
    private String fecha_Ingreso;
    private String semestre;

    public Estudiante(int ci, String nombre, String apellido, int celular, String fecha_Nac, int ru, String fecha_Ingreso, String semestre) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.ru = ru;
        this.fecha_Ingreso = fecha_Ingreso;
        this.semestre = semestre;
    }

    public int getRu() {
        return ru;
    }

    
    public String getFechaIngreso() {
        return fecha_Ingreso;
    }

    public String getSemestre() {
        return semestre;
    }
    public void setRu(int ru) {
        this.ru = ru;
    }
    public void setFechaIngreso(String fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("RU: " + ru);
        System.out.println("Fecha de Ingreso: " + fecha_Ingreso);
        System.out.println("Semestre: " + semestre);
    }

    public void mostrarEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(getFechaNac(), formatter);
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Edad: " + edad.getYears() + " años");
    }
     public void mostrarMismoApellido() {
        String apellido = getApellido();
        if (apellido.equals("Martínez")) {
            System.out.println("El apellido es Martínez");
        } else {
            System.out.println("El apellido no es Martínez");
        }
    }

}
