public class Estudiante extends Persona {
    private String ru, fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}
