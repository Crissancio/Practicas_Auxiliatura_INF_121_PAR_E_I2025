package Herencia;

public class Estudiante extends Persona {
    private String ru;
    private String fecha_Ingreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fecha_Nac, String sexo,String ru, String fecha_Ingreso, int semestre) {
        super(ci, nombre, apellido, celular, fecha_Nac, sexo);
        this.ru = ru;
        this.fecha_Ingreso = fecha_Ingreso;
        this.semestre = semestre;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha de Ingreso: " + fecha_Ingreso);
        System.out.println("Semestre: " + semestre);
        System.out.println("--------------------------");
    }
}
