class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def get_nombre(self): return self.nombre
    def set_nombre(self, nombre): self.nombre = nombre

    def get_apellido(self): return self.apellido
    def set_apellido(self, apellido): self.apellido = apellido

    def get_salario_base(self): return self.salario_base
    def set_salario_base(self, salario): self.salario_base = salario

    def get_anios_antiguedad(self): return self.anios_antiguedad
    def set_anios_antiguedad(self, anios): self.anios_antiguedad = anios

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.anios_antiguedad)


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def get_bono_gerencial(self): return self.bono_gerencial
    def set_bono_gerencial(self, bono): self.bono_gerencial = bono

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def get_horas_extras(self): return self.horas_extras
    def set_horas_extras(self, horas): self.horas_extras = horas

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 20)  # suponemos $20 por hora extra


# Instancias
gerentes = [
    Gerente("Ana", "Lopez", 3000, 10, "Ventas", 1500),
    Gerente("Luis", "Perez", 2500, 5, "Marketing", 800)
]

desarrolladores = [
    Desarrollador("Carlos", "Ramirez", 2000, 3, "Python", 12),
    Desarrollador("Maria", "Suarez", 2200, 2, "Java", 8)
]

# Mostrar salarios
print("Salarios:")
for g in gerentes:
    print(f"Gerente {g.get_nombre()} {g.get_apellido()}: ${g.calcular_salario():.2f}")
for d in desarrolladores:
    print(f"Desarrollador {d.get_nombre()} {d.get_apellido()}: ${d.calcular_salario():.2f}")

# Gerentes con bono mayor a 1000
print("\nGerentes con bono > 1000:")
for g in gerentes:
    if g.get_bono_gerencial() > 1000:
        print(f"{g.get_nombre()} {g.get_apellido()}, bono: {g.get_bono_gerencial()}")

# Desarrolladores con más de 10 horas extra
print("\nDesarrolladores con más de 10 horas extras:")
for d in desarrolladores:
    if d.get_horas_extras() > 10:
        print(f"{d.get_nombre()} {d.get_apellido()}, horas extras: {d.get_horas_extras()}")
