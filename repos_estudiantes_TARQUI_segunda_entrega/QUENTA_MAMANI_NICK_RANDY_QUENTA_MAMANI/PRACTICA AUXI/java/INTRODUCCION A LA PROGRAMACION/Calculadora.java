// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//6. Crea una clase Calculadora con operaciones básicas
//a) Agrega métodos para realizar las operaciones básicas
//b) Agrega un método para calcular el promedio de tres números
//c) Agrega un método para calcular las soluciones de una ecuación cuadrática
//d) Realiza operaciones con los métodos y muestra los resultados

public class Calculadora {

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public String division(double a, double b) {
        return b != 0 ? String.valueOf(a / b) : "Mal: division 0";
    }

    public double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public String ecuacionCuadratica(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            return "No tiene soluciones reales";
        }
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return String.format("Soluciones: x1 = %.2f, x2 = %.2f", x1, x2);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Operaciones basicas:");
        System.out.println("Suma: " + calc.suma(8, 3));
        System.out.println("Resta: " + calc.resta(10, 3));
        System.out.println("Multiplicacion: " + calc.multiplicacion(6, 15));
        System.out.println("Division: " + calc.division(5, 3));


        System.out.println("Promedio:");
        System.out.println("Promedio de 4, 6 y 8: " + calc.promedio(10, 6, 22));


        System.out.println("Ecuacion cuadratica:");
        System.out.println(calc.ecuacionCuadratica(1, -3, 2));
    }
}
