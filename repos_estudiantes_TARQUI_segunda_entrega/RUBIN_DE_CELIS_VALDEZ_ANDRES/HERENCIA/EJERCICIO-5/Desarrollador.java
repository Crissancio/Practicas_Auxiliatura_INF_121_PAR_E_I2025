public class Desarrollador extends Empleado{
    private String lenguaje_programacion;
    private int horas_extras;
    
    public Desarrollador(String nombre, String apellido, double salario_base, int anios_antiguedad, String lenguaje_programacion, int horas_extras) {
        super(nombre, apellido, salario_base, anios_antiguedad);
        this.lenguaje_programacion = lenguaje_programacion;
        this.horas_extras = horas_extras;
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setLenguaje_programacion(String lenguaje_programacion) {
        this.lenguaje_programacion = lenguaje_programacion;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }
    
    @Override
    public double calcular_salario() {
        return super.calcular_salario() + (horas_extras * 50); 
    }
}
