import java.util.ArrayList;

abstract class Empleado {
    protected String nombre, apellido;
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public abstract float getSalario();
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
}

class TFijo extends Empleado {
    private final float sueldo;
    public TFijo(String nombre, String apellido, float sueldo) {
        super(nombre, apellido);
        this.sueldo = sueldo;
    }
    @Override
    public float getSalario() { return sueldo; }
}

class TComisionista extends Empleado {
    private final float sueldoBase;
    private final float comision;
    public TComisionista(String nombre, String apellido, float sueldoBase, float comision) {
        super(nombre, apellido);
        this.sueldoBase = sueldoBase;
        this.comision = comision;
    }
    @Override
    public float getSalario() { return sueldoBase + comision; }
}

public class MainEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new TFijo("Pablo", "Taborga", 5000));
        empleados.add(new TFijo("Gariela", "Gamboa", 6000));
        empleados.add(new TComisionista("Isabel ", "Garcia", 3000, 1500));
        empleados.add(new TComisionista("Kratos", "Esparta", 3500, 1200));

        System.out.println("Lista de empleados y sus salarios:");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - Salario: " + e.getSalario());
        }

        // Buscar el empleado con mayor salario
        Empleado mayor = empleados.get(0);
        for (Empleado e : empleados) {
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }
        System.out.println("\nEmpleado con mayor salario: " + mayor.getNombre() + " " + mayor.getApellido() + " - Salario: " + mayor.getSalario());

        // Buscar el empleado con menor salario
        Empleado menor = empleados.get(0);
        for (Empleado e : empleados) {
            if (e.getSalario() < menor.getSalario()) {
                menor = e;
            }
        }
        System.out.println("Empleado con menor salario: " + menor.getNombre() + " " + menor.getApellido() + " - Salario: " + menor.getSalario());
    }
}