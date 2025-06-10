"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"2. Crea una clase Empleado con nombre y sueldo"
"a) Agrega un método para calcular el sueldo anual"
"b) Agrega un método para aplicar un aumento del 10%"
"c) Crea dos empleados y muestra sus sueldos antes y después del aumento"

class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo

    def mostrar_sueldo(self):
        return f"{self.nombre} tiene un sueldo de: {self.sueldo:.2f}"

    def aplicar_aumento(self):
        self.sueldo *= 1.10  


if __name__ == "__main__":

    empleado1 = Empleado("Cauan", 9000)
    empleado2 = Empleado("Silva", 4900)

    print(empleado1.mostrar_sueldo())
    print(empleado2.mostrar_sueldo())

    empleado1.aplicar_aumento()
    empleado2.aplicar_aumento()

    print("Aumento del salario:")
    print(empleado1.mostrar_sueldo())
    print(empleado2.mostrar_sueldo())
