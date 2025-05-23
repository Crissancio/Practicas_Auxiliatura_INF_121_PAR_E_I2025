package Ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("13098352", "Juan", "Perez", "78945643", "1995-05-10", "17635267", "2015-02-01", 8));
        estudiantes.add(new Estudiante("12435687", "Ana", "Lopez", "78945723", "2002-03-15", "19463532", "2021-02-01", 2));
        estudiantes.add(new Estudiante("13765894", "Luis", "Perez", "78945812", "1990-07-20", "15847545", "2010-02-01", 12));

        ArrayList<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("1234567", "Carlos", "Perez", "72436967", "1970-01-01", "128360973657", "Ingeniero", "Sistemas", "M"));
        docentes.add(new Docente("1357911", "Maria", "Lopez", "74362087", "1985-04-12", "134265769582", "Licenciado", "Matemáticas", "F"));
        docentes.add(new Docente("1245780", "Jose", "Gomez", "71324465", "1965-09-30", "146365870594", "Ingeniero", "Civil", "M"));

        mostrarEstudiantesMayores25(estudiantes);
        mostrarDocenteIngenieroMayor(docentes);
        mostrarMismoApellido(estudiantes, docentes);
    }

    public static int calcularEdad(String fecha) {
        LocalDate nacimiento = LocalDate.parse(fecha);
        LocalDate ahora = LocalDate.now();
        return Period.between(nacimiento, ahora).getYears();
    }

    public static void mostrarEstudiantesMayores25(ArrayList<Estudiante> estudiantes) {
        System.out.println("-------Estudiantes mayores de 25 años:-------");
        for (Estudiante e : estudiantes) {
            if (calcularEdad(e.get_fecha_nac()) > 25) {
                e.mostrar();
            }
        }
    }

    public static void mostrarDocenteIngenieroMayor(ArrayList<Docente> docentes) {
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.get_profesion().equalsIgnoreCase("Ingeniero") && d.get_sexo().equals("M")) {
                if (mayor == null || calcularEdad(d.get_fecha_nac()) > calcularEdad(mayor.get_fecha_nac())) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            System.out.println("-------Docente Ingeniero, masculino y mayor:-------");
            mayor.mostrar();
        } else {
            System.out.println("****No hay docente que cumpla los requisitos.****");
        }
    }

    public static void mostrarMismoApellido(ArrayList<Estudiante> estudiantes, ArrayList<Docente> docentes) {
        System.out.println("-------Estudiantes y docentes con el mismo apellido:-------");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.get_apellido().equalsIgnoreCase(d.get_apellido())) {
                    System.out.println("====Estudiante:====");
                    e.mostrar();
                    System.out.println("====Docente:====");
                    d.mostrar();
                    System.out.println("---");
                }
            }
        }
    }
}

class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String fecha_nac;

    public Persona(String ci, String nombre, String apellido, String celular, String fecha_nac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
    }

    public String get_fecha_nac() {
        return fecha_nac;
    }

    public String get_apellido() {
        return apellido;
    }

    public String get_nombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Celular: " + celular + ", Fecha Nac: " + fecha_nac);
    }
}

class Estudiante extends Persona {
    private String ru;
    private String fecha_ingreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fecha_nac, String ru, String fecha_ingreso, int semestre) {
        super(ci, nombre, apellido, celular, fecha_nac);
        this.ru = ru;
        this.fecha_ingreso = fecha_ingreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fecha_ingreso + ", Semestre: " + semestre);
    }
}

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, String fecha_nac, String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fecha_nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public String get_profesion() {
        return profesion;
    }

    public String get_sexo() {
        return sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }
}
