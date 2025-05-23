package estudiantejava;

public class Docente extends Persona {
    public String nit;
    public String profesion;
    public String especialidad;

    // Constructor por defecto
    public Docente() {
        super();
        this.nit = "Sin NIT";
        this.profesion = "Sin profesión";
        this.especialidad = "Sin especialidad";
    }

    // Constructor con parámetros
    public Docente(String ci, String nombre, String apellido, String celular, String fecha_Nac, String sexo, String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fecha_Nac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }
}