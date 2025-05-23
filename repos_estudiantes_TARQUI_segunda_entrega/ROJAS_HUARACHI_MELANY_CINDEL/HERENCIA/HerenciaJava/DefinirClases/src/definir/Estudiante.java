package definir;

import java.util.Date;

public class Estudiante extends Persona {
    private String ru;
    private Date fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, Date fechaNac,
                      String ru, Date fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + " | Semestre: " + semestre);
    }
}
