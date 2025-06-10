import java.time.LocalDate;
import java.time.Period;

class Persona {
    private String ci, nombre, apellido, celular;
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

    public String toString() {
        return nombre + " " + apellido + " (" + ci + ") - Cel: " + celular + ", Nac: " + fechaNac;
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

    public String toString() {
        return super.toString() + " | RU: " + ru + ", Ingreso: " + fechaIngreso + ", Semestre: " + semestre;
    }
}

class Docente extends Persona {
    private String nit, profesion, especialidad, sexo;

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

    public String toString() {
        return super.toString() + " | NIT: " + nit + ", Profesion: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo;
    }
}

class TestPersonas {
    public static void main(String[] args) {
        Persona[] personas = new Persona[] {
                new Estudiante("123", "Ana", "Perez", "7891234", LocalDate.of(1997, 5, 10), "RU001", LocalDate.of(2021, 1, 10), 5),
                new Estudiante("456", "Luis", "Gomez", "7891235", LocalDate.of(2006, 9, 15), "RU002", LocalDate.of(2023, 1, 10), 2),
                new Docente("789", "Carlos", "Perez", "7891236", LocalDate.of(1980, 2, 20), "NIT001", "Ingeniero", "Sistemas", "M"),
                new Docente("321", "Maria", "Gomez", "7891237", LocalDate.of(1985, 7, 1), "NIT002", "Licenciada", "Matemática", "F")
        };

        System.out.println("--- Estudiantes mayores de 25 años ---");
        for (Persona p : personas) {
            if (p instanceof Estudiante && p.getEdad() > 25) {
                System.out.println(p);
            }
        }

        System.out.println("\n--- Docente Ingeniero, masculino y mayor ---");
        Docente mayorIngeniero = null;
        for (Persona p : personas) {
            if (p instanceof Docente d && d.getProfesion().equals("Ingeniero") && d.getSexo().equals("M")) {
                if (mayorIngeniero == null || d.getEdad() > mayorIngeniero.getEdad()) {
                    mayorIngeniero = d;
                }
            }
        }
        if (mayorIngeniero != null) System.out.println(mayorIngeniero);

        System.out.println("\n--- Personas con mismo apellido ---");
        for (int i = 0; i < personas.length; i++) {
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[i].getApellido().equals(personas[j].getApellido())) {
                    System.out.println(personas[i]);
                    System.out.println(personas[j]);
                }
            }
        }
    }
}