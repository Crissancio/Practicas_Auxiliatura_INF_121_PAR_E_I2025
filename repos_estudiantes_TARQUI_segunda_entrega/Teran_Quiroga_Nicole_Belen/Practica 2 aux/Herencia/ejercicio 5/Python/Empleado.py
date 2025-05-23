class Empleado:
    def __init__(self, nombre, apellido, salarioBase, añosDeAntiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salarioBase = salarioBase
        self.añosDeAntiguedad = añosDeAntiguedad
    def calcular(self):
        b = self.salarioBase * 0.05 * self.añosDeAntiguedad
        return self.salarioBase + b