class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcular_salario(self):
        return self.salario_base * (1 + 0.05 * self.años_antiguedad)


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 20)


# a)
g1 = Gerente("Ana", "López", 5000, 10, "Finanzas", 1200)
d1 = Desarrollador("Luis", "Pérez", 4000, 5, "Python", 12)

# b) 
print(f"Salario Gerente: {g1.calcular_salario()}")
print(f"Salario Desarrollador: {d1.calcular_salario()}")

# c) 
gerentes = [
    g1,
    Gerente("Carlos", "Ruiz", 4800, 8, "TI", 800),
    Gerente("Marta", "Gómez", 5200, 7, "Marketing", 1500)
]

print("\nGerentes con bono mayor a 1000:")
for gerente in gerentes:
    if gerente.bono_gerencial > 1000:
        print(f"- {gerente.nombre} {gerente.apellido}")

# d) 
desarrolladores = [
    d1,
    Desarrollador("Clara", "Méndez", 4100, 3, "Java", 8),
    Desarrollador("Pedro", "Soto", 3900, 6, "C++", 15)
]

print("\nDesarrolladores con más de 10 horas extras:")
for dev in desarrolladores:
    if dev.horas_extras > 10:
        print(f"- {dev.nombre} {dev.apellido}")
