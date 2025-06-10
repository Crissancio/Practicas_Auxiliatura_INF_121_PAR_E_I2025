package Herencia.Ej3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private LocalDate fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + " (CI: " + ci + ")");
    }
}

class Estudiante extends Persona {
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

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Semestre: " + semestre);
    }
}

class Docente extends Persona {
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

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Profesión: " + profesion + ", Especialidad: " + especialidad);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Ana", "López", "71234567", LocalDate.of(1997, 3, 5),
                "RU001", LocalDate.of(2020, 2, 10), 8));
        estudiantes.add(new Estudiante("124", "Luis", "Fernández", "71234568", LocalDate.of(2004, 6, 15),
                "RU002", LocalDate.of(2022, 1, 10), 3));

        docentes.add(new Docente("321", "Carlos", "López", "76543210", LocalDate.of(1980, 4, 12),
                "NIT001", "Ingeniero", "Sistemas", "Masculino"));
        docentes.add(new Docente("322", "Marta", "González", "76543211", LocalDate.of(1975, 9, 22),
                "NIT002", "Licenciada", "Matemáticas", "Femenino"));

        System.out.println("Estudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println("Edad: " + e.getEdad());
                System.out.println("---");
            }
        }

        System.out.println("\nDocente ingeniero masculino y mayor:");
        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") &&
                d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayorIngeniero == null || d.getEdad() > mayorIngeniero.getEdad()) {
                    mayorIngeniero = d;
                }
            }
        }
        if (mayorIngeniero != null) {
            mayorIngeniero.mostrar();
            System.out.println("Edad: " + mayorIngeniero.getEdad());
        }

        System.out.println("\nEstudiantes y docentes con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    e.mostrar();
                    d.mostrar();
                    System.out.println("---");
                }
            }
        }
    }
}
