from Empleado import Empleado
class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salarioBase, añosDeAntiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salarioBase, añosDeAntiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras
    def calcular(self):
        extra = self.horas_extras * 20
        return super().calcular() + extra
