class Estudiante:
    def __init__(self, nombre, nota1, nota2):
        self.nombre = nombre
        self.nota1 = nota1
        self.nota2 = nota2

    def calcular_promedio(self):
        return (self.nota1 + self.nota2) / 2

    def aprobo(self):
        return self.calcular_promedio() >= 6

    def mostrar(self):
        promedio = self.calcular_promedio()
        estado = "Sí" if self.aprobo() else "No"
        print(f"{self.nombre} - Promedio: {promedio:.2f} - ¿Aprobó?: {estado}")


if __name__ == "__main__":
    estudiante1 = Estudiante("esteban", 9, 6)
    estudiante2 = Estudiante("dido", 3, 7)
    estudiante3 = Estudiante("Carlos", 6, 5)

    estudiante1.mostrar()
    estudiante2.mostrar()
    estudiante3.mostrar()
