class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad
        
    def calcular_salario(self):
        bono_antiguedad = 0.05 * self.salario_base * self.años_antigüedad
        return self.salario_base + bono_antiguedad


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
        
    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras
        
    def calcular_salario(self):
        salario_base = super().calcular_salario()
        monto_horas_extras = 20  
        return salario_base + (self.horas_extras * monto_horas_extras)


gerente1 = Gerente("Fernando", "Lopez", 5000, 5, "Ventas", 1500)
desarrollador1 = Desarrollador("Andrea", "Sanchez", 4000, 3, "Python", 12)

print(f"Salario del Gerente: {gerente1.calcular_salario()}")
print(f"Salario del Desarrollador: {desarrollador1.calcular_salario()}")

gerentes = [gerente1]
desarrolladores = [desarrollador1]

print("Gerentes con bono gerencial mayor a 1000:")
for gerente in gerentes:
    if gerente.bono_gerencial > 1000:
        print(f"{gerente.nombre} {gerente.apellido}, Bono: {gerente.bono_gerencial}")

print("Desarrolladores con más de 10 horas extras:")
for desarrollador in desarrolladores:
    if desarrollador.horas_extras > 10:
        print(f"{desarrollador.nombre} {desarrollador.apellido}, Horas extra: {desarrollador.horas_extras}")
      
