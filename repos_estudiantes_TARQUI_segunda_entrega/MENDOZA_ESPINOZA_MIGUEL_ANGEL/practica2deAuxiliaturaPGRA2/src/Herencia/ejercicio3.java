package Herencia;
import java.time.LocalDate;
import java.time.Period;
class Persona {
    String ci, nombre, apellido, celular;
    LocalDate fechaNac;
    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = LocalDate.parse(fechaNac);
    }
    public int edad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }
    public void mostrar() {
        System.out.println(nombre + " " + apellido + ", CI: " + ci + ", Celular: " + celular + ", Fecha Nac: " + fechaNac + " (" + edad() + " años)");
    }
}
class Estudiante extends Persona {
    String ru;
    LocalDate fechaIngreso;
    int semestre;
    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac, String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = LocalDate.parse(fechaIngreso);
        this.semestre = semestre;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}
class Docente extends Persona {
    String nit, profesion, especialidad, sexo;
    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac, String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }
}
public class ejercicio3 {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("123", "Ana", "López", "789456", "1998-04-15", "RU001", "2021-02-01", 6),
            new Estudiante("124", "Carlos", "García", "745896", "2005-09-20", "RU002", "2023-02-01", 2),
            new Estudiante("125", "Luis", "Martínez", "987654", "1995-01-01", "RU003", "2020-02-01", 8)
        };
        Docente[] docentes = {
            new Docente("321", "José", "García", "123456", "1975-06-10", "NIT001", "Ingeniero", "Sistemas", "M"),
            new Docente("322", "María", "López", "654321", "1980-08-20", "NIT002", "Matemática", "Estadística", "F"),
            new Docente("323", "Pedro", "Martínez", "111222", "1965-03-25", "NIT003", "Ingeniero", "Industrial", "M")
        };
        System.out.println("\n--- Estudiantes mayores de 25 años ---");
        for (Estudiante e : estudiantes) {
            if (e.edad() > 25) {
                e.mostrar();
                System.out.println();
            }
        }
        System.out.println("\n--- Docente masculino ingeniero de mayor edad ---");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.profesion.equals("Ingeniero") && d.sexo.equals("M")) {
                if (mayor == null || d.edad() > mayor.edad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            mayor.mostrar();
        }
        System.out.println("\n--- Estudiantes y Docentes con el mismo apellido ---");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.apellido.equals(d.apellido)) {
                    System.out.println("Apellido compartido: " + e.apellido);
                    e.mostrar();
                    d.mostrar();
                    System.out.println();
                }
            }
        }
    }
}

