package estudiantejava;

public class Estudiante extends Persona {
    public String ru;
    public String fecha_Ingreso;
    public int semestre;

    // Constructor por defecto
    public Estudiante() {
        super();
        this.ru = "Sin RU";
        this.fecha_Ingreso = "01/01/2023";
        this.semestre = 1;
    }

    // Constructor con parámetros
    public Estudiante(String ci, String nombre, String apellido, String celular, String fecha_Nac, String sexo, String ru, String fecha_Ingreso, int semestre) {
        super(ci, nombre, apellido, celular, fecha_Nac, sexo);
        this.ru = ru;
        this.fecha_Ingreso = fecha_Ingreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fecha_Ingreso);
        System.out.println("Semestre: " + semestre);
    }
}