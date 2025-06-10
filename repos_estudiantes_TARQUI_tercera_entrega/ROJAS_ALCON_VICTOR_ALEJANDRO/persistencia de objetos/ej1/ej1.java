import java.util.ArrayList;

public class Main {

    static class Empleado {
        String nombre;
        int edad;
        float salario;

        Empleado(String nombre, int edad, float salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }
    }

    static class ArchivoEmpleado {
        ArrayList<Empleado> empleados = new ArrayList<>();

        void guardarEmpleado(Empleado e) {
            empleados.add(e);
        }

        Empleado buscaEmpleado(String n) {
            for (Empleado e : empleados)
                if (e.nombre.equals(n)) return e;
            return null;
        }

        Empleado mayorSalario() {
            if (empleados.isEmpty()) return null;
            Empleado mayor = empleados.get(0);
            for (Empleado e : empleados) {
                if (e.salario > mayor.salario) {
                    mayor = e;
                }
            }
            return mayor;
        }
    }

    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado();

        archivo.guardarEmpleado(new Empleado("Ana", 30, 1500));
        archivo.guardarEmpleado(new Empleado("Luis", 28, 2000));
        archivo.guardarEmpleado(new Empleado("Marcelo", 35, 3800));

        Empleado buscado = archivo.buscaEmpleado("Luis");
        if (buscado != null)
            System.out.println("Encontrado: " + buscado.nombre + ", " + buscado.salario);
        else
            System.out.println("Empleado no encontrado.");

        Empleado mayor = archivo.mayorSalario();
        if (mayor != null)
            System.out.println("Mayor salario: " + mayor.nombre + ", " + mayor.salario);
        else
            System.out.println("No hay empleados.");
    }
}
