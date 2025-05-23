import java.time.LocalDate;
import java.time.Period;

class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected String fecha_Nac;

    public Persona(String ci, String nombre, String apellido, String celular, String fecha_Nac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }

    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fecha_Nac);
    }

    public int calcularEdad() {
        String[] partes = fecha_Nac.split("/");
        LocalDate nacimiento = LocalDate.of(
            Integer.parseInt(partes[2]),
            Integer.parseInt(partes[1]),
            Integer.parseInt(partes[0])
        );
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }
}

class Estudiante extends Persona {
    private final String ru;
    private final String fecha_Ingreso;
    private final int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, 
                      String fecha_Nac, String ru, String fecha_Ingreso, int semestre) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.ru = ru;
        this.fecha_Ingreso = fecha_Ingreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fecha_Ingreso);
        System.out.println("Semestre: " + semestre);
    }
}

class Docente extends Persona {
    private final String nit;
    private final String profesión;
    private final String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, 
                   String fecha_Nac, String nit, String profesión, String especialidad) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.nit = nit;
        this.profesión = profesión;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesión);
        System.out.println("Especialidad: " + especialidad);
    }
}

public class MainPersonas {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("1234567", "Miguel", "Garcia", "77712345", 
                                        "15/05/1999", "200010101", "10/02/2020", 6);
        Docente doc1 = new Docente("9876543", "Maria", "Chavez", "77754321", 
                                   "20/10/1980", "123456789", "Ingeniero", "Sistemas");

        System.out.println("=== Información del estudiante ===");
        est1.mostrar();
        
        System.out.println("\n=== Información del docente ===");
        doc1.mostrar();
    }
}