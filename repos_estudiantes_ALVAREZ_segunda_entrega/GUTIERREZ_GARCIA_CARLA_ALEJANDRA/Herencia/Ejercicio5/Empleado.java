public class Empleado {
    protected String nombre, apellido;
    protected float salario_base;
    protected int antiguedad;

    public Empleado(String n, String ap, float sb, int ant) {
        this.nombre = n;
        this.apellido = ap;
        this.salario_base = sb;
        this.antiguedad = ant;
    }

    public float calcular_salario() {
        float bono = this.salario_base * 0.05f * this.antiguedad;
        return this.salario_base + bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ap) {
        this.apellido = ap;
    }

    public float getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(float sb) {
        this.salario_base = sb;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int ant) {
        this.antiguedad = ant;
    }
}