"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:"

"a) Instanciar 1 Cuadrado, 1 Rectángulo y 1 Círculo"
"b) Implementar un método mostrar() en cada clase para imprimir sus dimensiones y área."
"c) Sobrecargar el método Área para mostrar el área de todas las figuras."

class Figuras:
    def area(self, *dimensiones):
        if len(dimensiones) == 1:  
            valor = dimensiones[0]
            if isinstance(valor, float):  
                return 3.14159 * (valor ** 2)
            elif isinstance(valor, int): 
                return valor ** 2
        elif len(dimensiones) == 2:  
            base, altura = dimensiones
            return base * altura
        else:
            raise ValueError("aria.")

if __name__ == "__main__":
    figuras = Figuras()

    print("Área del Cuadrado:", figuras.area(4))  
    print("Área del Rectángulo:", figuras.area(5, 3))  
    print("Área del Círculo:", figuras.area(6.0))  
