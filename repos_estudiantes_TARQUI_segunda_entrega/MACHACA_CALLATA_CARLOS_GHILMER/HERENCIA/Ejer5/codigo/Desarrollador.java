package HERENCIA.Ejer5.codigo;

public class Desarrollador extends Empleado {
   private String lenguaje_programacion;
   private int horas_extras;

    public Desarrollador(String nombre, String apellido, double salario_base, int años_antiguedad, String lenguaje_programacion, int horas_extras) {
         super(nombre, apellido, salario_base, años_antiguedad);
         this.lenguaje_programacion = lenguaje_programacion;
         this.horas_extras = horas_extras;
    }
    public String getLenguajeProgramacion() {
        return lenguaje_programacion;
    }
    public int getHorasExtras() {
        return horas_extras;
    }

    public double calcularSalario() {
        double salario = super.calcularSalario();
        if (getAñosAntiguedad() > 5) {
            salario += getSalarioBase(); 
        }
        return salario + (horas_extras * 20); 
    }

    public void mostrarHorasExtras() {
        if (getHorasExtras() > 10) {
            System.out.println("Desarrollador " + getNombre() + " " + getApellido() + " tiene horas extras: " + getHorasExtras());
        } else {
            System.out.println("Desarrollador " + getNombre() + " " + getApellido() + " no tiene horas extras");
        }
    }

   
}
