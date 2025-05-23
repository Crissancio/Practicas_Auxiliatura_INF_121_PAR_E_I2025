public class Ejercicio3 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Laura", "González", "12345678", "RU1020", "2021-02-10", 6);
        Docente docente = new Docente("Carlos", "Pérez", "87654321", "654321", "Ingeniería", "Software");

        System.out.println("Información del Estudiante:");
        estudiante.mostrar();

        System.out.println("\nInformación del Docente:");
        docente.mostrar();
    }
}

class Persona {
    private String nombre;
    private String apellido;
    private String ci;

    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("CI: " + ci);
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCi() { return ci; }
}

class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso;
    private int semestre;

    public Estudiante(String nombre, String apellido, String ci, String ru, String fechaIngreso, int semestre) {
        super(nombre, apellido, ci);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
}

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String nombre, String apellido, String ci, String nit, String profesion, String especialidad) {
        super(nombre, apellido, ci);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }
}
