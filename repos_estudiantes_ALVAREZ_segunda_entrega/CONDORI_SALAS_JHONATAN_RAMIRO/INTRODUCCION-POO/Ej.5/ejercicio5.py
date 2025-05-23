class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2
    def calcular_promedio(self):
        """Calcula el promedio de las dos notas."""
        return (self.nota_1 + self.nota_2) / 2
    def verificar_aprobacion(self):
        """Verifica si el estudiante aprobó (promedio >= 6)."""
        promedio = self.calcular_promedio()
        return promedio >= 6
estudiante1 = Estudiante("Juan Pérez", 85, 90)
estudiante2 = Estudiante("María López", 5, 7)
estudiante3 = Estudiante("Carlos García", 4, 6)
estudiantes = [estudiante1, estudiante2, estudiante3]
for estudiante in estudiantes:
    promedio = estudiante.calcular_promedio()
    aprobado = estudiante.verificar_aprobacion()
    estado = "Aprobado" if aprobado else "Reprobado"
    print(f"Estudiante: {estudiante.nombre}, Promedio: {promedio:.2f}, Estado: {estado}")
