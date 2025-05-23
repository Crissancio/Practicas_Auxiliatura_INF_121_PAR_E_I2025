import java.util.ArrayList;
class Estudiante {
    public String nombre;
    public String carrera;
    public int semestre;
    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public void mostrar() {
        System.out.println("Estudiante: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre);
    }
}
class Universidad {
    public String nombre;
    public ArrayList<Estudiante> estudiantes;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public void agregar(Estudiante e) {
        estudiantes.add(e);
    }
    public void mostrar() {
        System.out.println("Universidad: " + nombre);
        for (Estudiante e : estudiantes) {
            e.mostrar();
        }
    }
}
public class Ej7 {
    public static void main(String[] args) {
        Universidad u = new Universidad("Univalle");
        Estudiante e1 = new Estudiante("Ana", "Ingeniería", 3);
        Estudiante e2 = new Estudiante("Luis", "Medicina", 5);
        u.agregar(e1);
        u.agregar(e2);
        u.mostrar();
    }
}
