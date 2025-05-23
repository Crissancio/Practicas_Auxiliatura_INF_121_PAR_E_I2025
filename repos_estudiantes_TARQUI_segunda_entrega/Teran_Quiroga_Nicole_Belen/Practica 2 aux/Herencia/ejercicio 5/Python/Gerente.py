from Empleado import Empleado
class Gerente(Empleado):
    def __init__(self, nombre, apellido, salarioBase, añosDeAntiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salarioBase, añosDeAntiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    def calcular(self):
        return super().calcular() + self.bono_gerencial