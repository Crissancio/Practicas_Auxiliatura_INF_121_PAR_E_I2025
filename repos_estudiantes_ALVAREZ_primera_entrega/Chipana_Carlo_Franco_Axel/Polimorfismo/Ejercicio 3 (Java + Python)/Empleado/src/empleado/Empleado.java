//Un restaurante organiza a su personal mediante las siguientes clases: 
    //a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo. 
    //b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
    //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X. 

package empleado;

// DEBE SER CLASE MESERO
// NO SIGUE CON EL DIAGRAMA ASIGNADO EN EL EJERCICIO
import java.util.ArrayList;
class Empleado {
    protected String nombre;
    protected double sueldoMes;

    public Empleado(String nombre, double sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public double sueldoTotal() {
        return sueldoMes;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Sueldo Mensual: " + sueldoMes);
    }

    public static void mostrarPorSueldo(ArrayList<Empleado> empleados, double sueldoX) {
        System.out.println("Empleados con sueldo " + sueldoX + ":");
        for (Empleado emp : empleados) {
            if (emp.sueldoTotal() == sueldoX) {
                emp.mostrar();
            }
        }
    }
}

class Empresa {
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Carlos", 1500, 10, 20);
        Mesero mesero1 = new Mesero("Luis", 1200, 5, 15, 200);
        Mesero mesero2 = new Mesero("Ana", 1300, 8, 14, 250);
        Administrativo admin1 = new Administrativo("Sofía", 1800, "Gerente");
        Administrativo admin2 = new Administrativo("Pedro", 1700, "Supervisor");

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(cocinero1);
        empleados.add(mesero1);
        empleados.add(mesero2);
        empleados.add(admin1);
        empleados.add(admin2);

        for (Empleado emp : empleados) {
            System.out.println(emp.nombre + " - Sueldo Total: " + emp.sueldoTotal());
        }

        Empleado.mostrarPorSueldo(empleados, 1700);
    }
}