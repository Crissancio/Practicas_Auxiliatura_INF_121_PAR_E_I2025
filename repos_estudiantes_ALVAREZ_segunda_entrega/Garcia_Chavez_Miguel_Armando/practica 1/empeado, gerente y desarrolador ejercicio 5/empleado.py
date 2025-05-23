class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad
    
    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antigüedad)

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    
    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programación, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programación = lenguaje_programación
        self.horas_extras = horas_extras
    
    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 50)  
        # $50 por hora extra

if __name__ == "__main__":
    gerente1 = Gerente("Carlos", "Eltopo", 8000, 5, "Python", 1500)
    dev1 = Desarrollador("Rogelio", "Quehabla", 5000, 3, "Java", 12)

    print(f"Salario del gerente: {gerente1.calcular_salario()}")
    print(f"Salario del desarrollador: {dev1.calcular_salario()}")