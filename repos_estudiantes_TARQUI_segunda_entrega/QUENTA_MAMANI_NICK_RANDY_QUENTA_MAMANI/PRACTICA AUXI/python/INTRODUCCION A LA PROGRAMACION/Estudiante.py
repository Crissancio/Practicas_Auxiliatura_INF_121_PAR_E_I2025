"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"5. Crea una clase Estudiante con nombre, nota_1, nota_2"
"a) Agrega un método para calcular el promedio"
"b) Agrega un método para verificar si aprobó (promedio &gt;=6)"
"c) Crea tres estudiantes, muestra sus promedios y si aprobaron"

class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobacion(self):
        return "Aprobo" if self.calcular_promedio() >= 6 else "No aprobo"


if __name__ == "__main__":

    alum1 = Estudiante("Mixi", 9, 7)
    alum2 = Estudiante("Paula", 3, 1)
    alum3 = Estudiante("Johan", 10, 10)

    estudiantes = [alum1, alum2, alum3]
    print("Estudiantes:")
    for estudiante in estudiantes:
        promedio = estudiante.calcular_promedio()
        estado = estudiante.verificar_aprobacion()
        print(f"{estudiante.nombre} su promedio es {promedio:.2f} y {estado}.")
