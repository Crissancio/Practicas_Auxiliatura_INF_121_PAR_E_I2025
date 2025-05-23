public class Desarrollador extends Empleado {
    private String lenguaje_programacion;
    private int horas_extras;

    public Desarrollador(String n, String ap, float sb, int ant, String lep, int h) {
        super(n, ap, sb, ant);
        this.lenguaje_programacion = lep;
        this.horas_extras = h;
    }

    @Override
    public float calcular_salario() {
        float pago_horas_extras = 50.0f * this.horas_extras;
        return super.calcular_salario() + pago_horas_extras;
    }

    public void mostrarSiMasDeNHorasExtras(int n) {
        if (this.horas_extras > n) {
            System.out.println(
                    this.getNombre() + " " + this.getApellido() + " - Horas extras: " + this.getHoras_extras());
        }
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public void setLenguaje_programacion(String leg) {
        this.lenguaje_programacion = leg;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int h) {
        this.horas_extras = h;
    }
}