from Empleado import Empleado

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.__departamento = departamento
        self.__bono_gerencial = bono_gerencial

    #A
    def get_departamento(self):
        return self.__departamento

    def set_departamento(self, departamento):
        self.__departamento = departamento

    def get_bono_gerencial(self):
        return self.__bono_gerencial

    def set_bono_gerencial(self, bono_gerencial):
        self.__bono_gerencial = bono_gerencial
    def calcular_salario(self):
        salario_base_con_bono = super().calcular_salario()
        return salario_base_con_bono + self.__bono_gerencial