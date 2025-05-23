// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571


//2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:
//
//a) Instanciar 1 Cuadrado, 1 Rectángulo y 1 Círculo
//b) Implementar un método mostrar() en cada clase para imprimir sus
//dimensiones y área.
//c) Sobrecargar el método Área para mostrar el área de todas las figuras.

public class Figuras {
    public double area(double lado) {
        return lado * lado;
    }

    public double area(double base, double altura) {
        return base * altura;
    }

    public double area(float radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Figuras figuras = new Figuras();

        double areaCuadrado = figuras.area(4); // Lado = 4
        double areaRectangulo = figuras.area(5, 3); // Base = 5, Altura = 3
        double areaCirculo = figuras.area(6f); // Radio = 6

        System.out.println("Área del Cuadrado: " + areaCuadrado);
        System.out.println("Área del Rectángulo: " + areaRectangulo);
        System.out.println("Área del Círculo: " + areaCirculo);
    }
}
