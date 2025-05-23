package ejercicio3;

// Estudiante (hereda de Persona) <ru, fecha_Ingreso, semestre>

public class Estudiante extends Persona {
    // a) Atributos específicos de Estudiante
    private String ru;
    private String fechaIngreso;
    private int semestre;

    // a) Constructor por defecto
    public Estudiante() {
        super();
        this.ru = "";
        this.fechaIngreso = "";
        this.semestre = 0;
    }

    // a) Constructor con parámetros
    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    // b) Método mostrar()
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("RU: %s, Fecha Ingreso: %s, Semestre: %d\n", ru, fechaIngreso, semestre);
    }
}
