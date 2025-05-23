import java.util.ArrayList;

public class Universidad {
    public String nombre;
    public ArrayList<Estudiante> estudiantes;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    public void agregarEstudiante(String nombre, String carrera, int semestre){
        Estudiante estudiante = new Estudiante(nombre, carrera, semestre);
        this.estudiantes.add(estudiante);
    }
    public String toString(){
        System.out.println("-----------------------------Universidad---------------------------");
        String cad = "";
        for(int i = 0; i < estudiantes.size(); i++){
            cad += estudiantes.get(i).toString();
        }
        return "Nombre: " + nombre + "\n" +
                cad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

}
