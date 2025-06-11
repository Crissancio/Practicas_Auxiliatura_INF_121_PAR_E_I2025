class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__salario_base = salario_base
        self.__años_antigüedad = años_antigüedad

    #A
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_apellido(self):
        return self.__apellido

    def set_apellido(self, apellido):
        self.__apellido = apellido

    def get_salario_base(self):
        return self.__salario_base

    def set_salario_base(self, salario_base):
        self.__salario_base = salario_base

    def get_años_antigüedad(self):
        return self.__años_antigüedad

    def set_años_antigüedad(self, años_antigüedad):
        self.__años_antigüedad = años_antigüedad
    def calcular_salario(self):
        bono_antigüedad = self.__salario_base * 0.05 * self.__años_antigüedad
        return self.__salario_base + bono_antigüedad