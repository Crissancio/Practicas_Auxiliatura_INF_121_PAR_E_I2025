import java.util.*;

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;
    
    public Universidad(String n)
    {
        this.nombre=n;
        this.estudiantes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void agregarEstudiantes(Estudiante e)
    {
        estudiantes.add(e);
    }
    
    public void mostrarUniversidad()
    {
        System.out.println("-----------------------UNIVERSIDAD--------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("------------------------------------------------");
        System.out.println("Universidad: ");
        for(Estudiante e: estudiantes)
        {
            e.mostrarInfo();
        }
    }
}

class Estudiante {
    private String nombre, carrera;
    private int semestre;
    
    public Estudiante(String n, String c, int s)
    {
        this.nombre=n;
        this.carrera=c;
        this.semestre=s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Carrera: "+carrera);
        System.out.println("Semestre: "+semestre);
    }
}

class App {
    public static void main(String[] args) {
        
        Estudiante e1=new Estudiante("Ana Martinez", "Ingenieria de Sistema", 3);        
        Estudiante e2=new Estudiante("Carlos Rojas", "Arquitectura", 5);
        Estudiante e3=new Estudiante("Lucia Fernandez", "Derecho", 2);
        
        Universidad u1=new Universidad("Universidad Nacional");
        
        u1.agregarEstudiantes(e1);        
        u1.agregarEstudiantes(e2);
        u1.agregarEstudiantes(e3);
        
        u1.mostrarUniversidad();
    }
}