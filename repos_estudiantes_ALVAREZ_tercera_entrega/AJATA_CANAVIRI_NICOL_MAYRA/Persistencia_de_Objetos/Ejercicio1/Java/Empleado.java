package Persistencia_de_Objetos.Ejercicio1.Java;

public class Empleado {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        
        return String.format("%s,%d,%.2f", nombre, edad, salario);
    }

    public static Empleado fromString(String empleadoStr) {
        try {
            String[] partes = empleadoStr.trim().split(",");
            if (partes.length == 3) {
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                float salario = Float.parseFloat(partes[2]);
                return new Empleado(nombre, edad, salario);
            } else {
                System.err.println("Advertencia: Formato de linea incorrecto para empleado: " + empleadoStr);
                return null;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al parsear datos numericos de empleado '" + empleadoStr + "': " + e.getMessage());
            return null;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error de indice al parsear línea de empleado '" + empleadoStr + "': " + e.getMessage());
            return null;
        }
    }
}
