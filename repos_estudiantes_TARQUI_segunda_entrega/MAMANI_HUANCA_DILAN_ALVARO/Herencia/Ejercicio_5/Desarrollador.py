from Empleado import Empleado

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        pago_horas_extras = self.horas_extras * 20
        return super().calcular_salario() + pago_horas_extras
    
    # Getters
    def get_lenguaje_programacion(self):
        return self.lenguaje_programacion

    def get_horas_extras(self):
        return self.horas_extras

    # Setters
    def set_lenguaje_programacion(self, lenguaje):
        self.lenguaje_programacion = lenguaje

    def set_horas_extras(self, horas):
        self.horas_extras = horas