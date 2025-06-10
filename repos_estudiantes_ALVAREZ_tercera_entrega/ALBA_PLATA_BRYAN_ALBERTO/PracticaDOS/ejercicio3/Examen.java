import java.util.*;
import java.time.*;
class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;
    protected String sexo;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido + ", Celular: " + celular + ", Fecha Nac: " + fechaNac + ", Sexo: " + sexo);
    }
}

class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo, String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo, String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    public String getProfesion() {
        return profesion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad);
    }
}

public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       List<Estudiante> estudiantes = new ArrayList<>();
        List<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Luis", "Paredes", "77712345", LocalDate.of(1998, 3, 10), "M", "RU001", LocalDate.of(2020, 2, 1), 8));
        estudiantes.add(new Estudiante("124", "Ana", "Gonzales", "77754321", LocalDate.of(2004, 5, 21), "F", "RU002", LocalDate.of(2023, 1, 1), 2));

        docentes.add(new Docente("200", "Carlos", "Paredes", "76543210", LocalDate.of(1975, 8, 25), "M", "NIT123", "Ingeniero", "Sistemas"));
        docentes.add(new Docente("201", "Elena", "Rojas", "76432100", LocalDate.of(1980, 9, 1), "F", "NIT456", "Licenciada", "Matemáticas"));

        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println();
            }
        }

        System.out.println("Docente Ingeniero, masculino y el mayor de todos:");
        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                if (mayorIngeniero == null || d.getEdad() > mayorIngeniero.getEdad()) {
                    mayorIngeniero = d;
                }
            }
        }
        if (mayorIngeniero != null) {
            mayorIngeniero.mostrar();
        } else {
            System.out.println("No se encontró docente con esas características.");
        }

        System.out.println("\nEstudiantes y Docentes con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + e.getApellido());
                    e.mostrar();
                    d.mostrar();
                    System.out.println();
                }
            }
        }
      
    }
    
}