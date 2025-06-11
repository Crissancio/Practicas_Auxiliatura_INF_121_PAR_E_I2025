from Empleado import Empleado

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programación, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.__lenguaje_programación = lenguaje_programación
        self.__horas_extras = horas_extras

    #A
    def get_lenguaje_programación(self):
        return self.__lenguaje_programación

    def set_lenguaje_programación(self, lenguaje_programación):
        self.__lenguaje_programación = lenguaje_programación

    def get_horas_extras(self):
        return self.__horas_extras

    def set_horas_extras(self, horas_extras):
        self.__horas_extras = horas_extras
    def calcular_salario(self):
        salario_base_con_bono = super().calcular_salario()
        pago_horas_extras = self.__horas_extras * 50
        return salario_base_con_bono + pago_horas_extras