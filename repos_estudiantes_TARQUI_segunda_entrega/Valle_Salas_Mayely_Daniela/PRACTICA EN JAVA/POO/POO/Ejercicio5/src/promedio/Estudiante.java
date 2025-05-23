package promedio;

public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Aprobó: " + (aprobo() ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Dani", 8.5, 7.0);
        Estudiante estudiante2 = new Estudiante("Ara", 5.0, 6.5);
        Estudiante estudiante3 = new Estudiante("Dorian", 9.0, 8.0);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
    }
}
