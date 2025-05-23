"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"6. Crea una clase Calculadora con operaciones básicas"
"a) Agrega métodos para realizar las operaciones básicas"
"b) Agrega un método para calcular el promedio de tres números"
"c) Agrega un método para calcular las soluciones de una ecuación cuadrática"
"d) Realiza operaciones con los métodos y muestra los resultados"

import math

class Calculadora:
    def suma(self, a, b):
        return a + b

    def resta(self, a, b):
        return a - b

    def multiplicacion(self, a, b):
        return a * b

    def division(self, a, b):
        return a / b if b != 0 else "mal: division 0"

    def promedio(self, a, b, c):
        return (a + b + c) / 3

    def ecuacion_cuadratica(self, a, b, c):
        discriminante = b**2 - 4*a*c
        if discriminante < 0:
            return "No tiene soluciones reales"
        x1 = (-b + math.sqrt(discriminante)) / (2*a)
        x2 = (-b - math.sqrt(discriminante)) / (2*a)
        return f"Soluciones: x1 = {x1:.2f}, x2 = {x2:.2f}"


if __name__ == "__main__":
    calc = Calculadora()
    
    print("Operaciones basicas:")
    print(f"Suma: {calc.suma(6, 7)}")
    print(f"Resta: {calc.resta(6, 2)}")
    print(f"Multiplicacian: {calc.multiplicacion(8, 30)}")
    print(f"Division: {calc.division(50, 3)}")
    
    print("Promedio:")
    print(f"Promedio de 4, 6 y 8: {calc.promedio(8, 2, 9)}")
    
    print("Ecuacion cuadratica:")
    print(calc.ecuacion_cuadratica(1, -3, 2)) 
