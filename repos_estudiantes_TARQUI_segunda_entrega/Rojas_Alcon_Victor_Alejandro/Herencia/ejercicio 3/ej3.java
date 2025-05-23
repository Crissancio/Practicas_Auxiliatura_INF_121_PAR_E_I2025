import java.time.LocalDate;
import java.time.Period;

class Persona {
    String ci, nombre, apellido, celular, sexo;
    LocalDate fechaNac;

    Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    int edad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    void mostrar() {
        System.out.println(nombre + " " + apellido + " - CI: " + ci + ", Edad: " + edad() + " años");
    }
}

class Estudiante extends Persona {
    String ru;
    LocalDate fechaIngreso;
    int semestre;

    Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo,
               String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha de Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}

class Docente extends Persona {
    String nit, profesion, especialidad;

    Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo,
            String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    @Override
    void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
            "12345678",
            "Juan",
            "Pérez",
            "78945612",
            LocalDate.of(2002, 5, 15),
            "M",
            "RU001",
            LocalDate.of(2021, 2, 10),
            5
        );

        Docente docente = new Docente(
            "87654321",
            "María",
            "Lopez",
            "74185296",
            LocalDate.of(1980, 3, 20),
            "F",
            "NIT123456",
            "Ingeniera de Sistemas",
            "Inteligencia Artificial"
        );

        System.out.println("Información del Estudiante:");
        estudiante.mostrar();

        System.out.println("\nInformación del Docente:");
        docente.mostrar();
    }
}