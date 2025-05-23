package H_2;

public class Estudiante extends Persona {
    private String ru;
    private int[] fechaIng;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, int[] fechaNac,
                      String ru, int[] fechaIng, int semestre, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIng = fechaIng;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fechaIng[0] + "/" + fechaIng[1] + "/" + fechaIng[2] +
                           ", Semestre: " + semestre);
    }
}

