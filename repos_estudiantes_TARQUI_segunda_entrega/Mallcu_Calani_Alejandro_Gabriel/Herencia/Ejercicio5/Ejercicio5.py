class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antigüedad)

    def get_nombre_completo(self):
        return f"{self.nombre} {self.apellido}"


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 100)


# Instancias
gerente1 = Gerente("Juan", "Perez", 10000, 3, "Finanzas", 1500)
desarrollador1 = Desarrollador("Ana", "Gomez", 9000, 2, "Python", 12)

print(f"Salario del Gerente: {gerente1.calcular_salario()}")
print(f"Salario del Desarrollador: {desarrollador1.calcular_salario()}")

# Filtros
gerentes = [gerente1]
desarrolladores = [desarrollador1]

print("\nGerentes con bono mayor a 1000:")
for g in gerentes:
    if g.bono_gerencial > 1000:
        print(f"- {g.get_nombre_completo()}")

print("\nDesarrolladores con más de 10 horas extras:")
for d in desarrolladores:
    if d.horas_extras > 10:
        print(f"- {d.get_nombre_completo()}")
