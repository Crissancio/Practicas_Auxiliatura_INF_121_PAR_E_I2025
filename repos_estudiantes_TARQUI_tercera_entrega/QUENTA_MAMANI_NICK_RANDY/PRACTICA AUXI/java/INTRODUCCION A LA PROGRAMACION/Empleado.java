/// "NOMBRE: QUENTA MAMANI NICK RANDY"
/// "CI: 10037571"
///
/// "2. Crea una clase Empleado con nombre y sueldo"
/// "a) Agrega un método para calcular el sueldo anual"
/// "b) Agrega un método para aplicar un aumento del 10%"
/// "c) Crea dos empleados y muestra sus sueldos antes y después del aumento"

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String mostrarSueldo() {
        return nombre + " su sueldo es: " + sueldo;
    }

    public void aplicarAumento() {
        sueldo *= 1.10;
    }
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Cauan", 9000);
        Empleado empleado2 = new Empleado("Silva", 4900);

        System.out.println(empleado1.mostrarSueldo());
        System.out.println(empleado2.mostrarSueldo());

        empleado1.aplicarAumento();
        empleado2.aplicarAumento();

        System.out.println("Aumento del salario:");
        System.out.println(empleado1.mostrarSueldo());
        System.out.println(empleado2.mostrarSueldo());
    }
}
