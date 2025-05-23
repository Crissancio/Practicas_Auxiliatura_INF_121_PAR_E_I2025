//a)
public class Desarrollador extends Empleado {
    private String lenguaje_programacion;
    private int horas_extras;

    public Desarrollador(String nombre, String apellido, double salario_base, int años_antigüedad,String lp, int h) {
        super(nombre, apellido, salario_base, años_antigüedad);
        this.lenguaje_programacion = lp;
        this.horas_extras = h;
    }
    public String getLenguaje_Programacion() {
        return lenguaje_programacion; 
    }
    public void setLenguaje_Programacion(String lenguaje_programacion) { 
        this.lenguaje_programacion = lenguaje_programacion;
    }
    public int getHoras_Extras() { 
        return horas_extras; 
    }
    public void setHoras_Extras(int horas_extras) { 
        this.horas_extras = horas_extras; 
    }
    @Override
    public double calcular_salario() {
        double p = horas_extras * 40; 
        return super.calcular_salario() + p;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("lenguaje de programación: " + lenguaje_programacion);
        System.out.println("horas extras: " + horas_extras);
        System.out.println("salario total: " + calcular_salario());
    }
    public static void mostrarDesarrolladoresMas10HorasExtras(Desarrollador[] y, int c) {
        System.out.println("\n Desarrolladores que tienen más de 10 horas extras: ");
        for (int i = 0; i < c; i++) {
            if (y[i].getHoras_Extras() > 10) {
                y[i].mostrar();
            }
        }
    }
}