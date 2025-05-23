//a) Implementa las clases con sus constructores, getters y setters.
public class Desarrollador extends Empleado {
    private String lenguaje_programacion;
    private int horas_extras;

    public Desarrollador(String nombre, String apellido, float salario_base, int años_antiguedad,
            String lenguaje_programacion, int horas_extras) {
        super(nombre, apellido, salario_base, años_antiguedad);
        this.lenguaje_programacion = lenguaje_programacion;
        this.horas_extras = horas_extras;
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public void setLenguaje_programacion(String lenguaje_programacion) {
        this.lenguaje_programacion = lenguaje_programacion;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }

    @Override
    public float calcular_salario() {
        return super.calcular_salario() + (horas_extras * 50);
    }
}