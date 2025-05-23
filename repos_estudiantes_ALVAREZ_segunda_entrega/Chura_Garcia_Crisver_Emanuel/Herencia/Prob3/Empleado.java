//a) Implementa las clases con sus constructores, getters y setters.
public class Empleado {
    private String nombre;
    private String apellido;
    private float salario_base;
    private int años_antiguedad;

    public Empleado(String nombre, String apellido, float salario_base, int años_antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_base = salario_base;
        this.años_antiguedad = años_antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(float salario_base) {
        this.salario_base = salario_base;
    }

    public int getAños_antiguedad() {
        return años_antiguedad;
    }

    public void setAños_antiguedad(int años_antiguedad) {
        this.años_antiguedad = años_antiguedad;
    }

    public float calcular_salario() {
        float bono = años_antiguedad * 0.05f * salario_base;
        return salario_base + bono;
    }
}