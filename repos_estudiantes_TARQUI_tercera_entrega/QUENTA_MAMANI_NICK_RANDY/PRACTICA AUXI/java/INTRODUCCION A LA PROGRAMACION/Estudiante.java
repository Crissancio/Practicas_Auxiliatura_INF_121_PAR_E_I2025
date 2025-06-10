// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//5. Crea una clase Estudiante con nombre, nota_1, nota_2
//a) Agrega un método para calcular el promedio
//b) Agrega un método para verificar si aprobó (promedio &gt;=6)
//c) Crea tres estudiantes, muestra sus promedios y si aprobaron

public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    // Constructor
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprobacion() {
        return calcularPromedio() >= 6 ? "Aprobo" : "No aprobo";
    }

    public static void main(String[] args) {
        Estudiante alum1 = new Estudiante("Mixi", 8, 6);
        Estudiante alum2 = new Estudiante("Paula", 5, 3);
        Estudiante alum3 = new Estudiante("Johan", 10, 9);

        Estudiante[] estudiantes = {alum1, alum2, alum3};
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            double promedio = estudiante.calcularPromedio();
            String estado = estudiante.verificarAprobacion();
            System.out.printf("%s su promedio es %.2f y %s.%n", estudiante.nombre, promedio, estado);
        }
    }
}
