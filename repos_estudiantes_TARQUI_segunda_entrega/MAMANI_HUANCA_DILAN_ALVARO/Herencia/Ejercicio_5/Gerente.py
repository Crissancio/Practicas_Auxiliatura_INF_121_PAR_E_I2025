from Empleado import Empleado

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial
    
    # Getters
    def get_departamento(self):
        return self.departamento

    def get_bono_gerencial(self):
        return self.bono_gerencial

    # Setters
    def set_departamento(self, departamento):
        self.departamento = departamento

    def set_bono_gerencial(self, bono):
        self.bono_gerencial = bono