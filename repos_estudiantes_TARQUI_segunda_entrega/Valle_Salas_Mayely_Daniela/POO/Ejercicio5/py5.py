class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobado(self):
        return self.calcular_promedio() >= 6

estudiante1 = Estudiante("Dani", 8.5, 7.0)
estudiante2 = Estudiante("Ara", 5.0, 6.5)
estudiante3 = Estudiante("Dorian", 9.0, 8.0)

for estudiante in [estudiante1, estudiante2, estudiante3]:
    promedio = estudiante.calcular_promedio()
    aprobado = "Aprobado" if estudiante.verificar_aprobado() else "No Aprobado"
    print(f"Estudiante: {estudiante.nombre}, Promedio: {promedio:.2f}, Estado: {aprobado}")
