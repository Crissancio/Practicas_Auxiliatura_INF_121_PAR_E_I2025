class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.anios_antiguedad)


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def mostrar(self):
        print(f"Gerente: {self.nombre} {self.apellido}, Departamento: {self.departamento}, "
              f"Salario Total: {self.calcular_salario():.2f}")


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        monto_extra = self.horas_extras * 20  # suponiendo $20 por hora extra
        return super().calcular_salario() + monto_extra

    def mostrar(self):
        print(f"Desarrollador: {self.nombre} {self.apellido}, Lenguaje: {self.lenguaje_programacion}, "
              f"Salario Total: {self.calcular_salario():.2f}")


# ==== PROGRAMA PRINCIPAL ====

gerentes = [
    Gerente("Luis", "Torres", 3000, 5, "TI", 1500),
    Gerente("Ana", "Gómez", 2800, 3, "RRHH", 800)
]

desarrolladores = [
    Desarrollador("Carlos", "López", 2500, 2, "Java", 12),
    Desarrollador("Marta", "Fernández", 2600, 1, "Python", 8)
]

# b) Mostrar salarios
print("--- Salarios Calculados ---")
for g in gerentes:
    g.mostrar()
for d in desarrolladores:
    d.mostrar()

# c) Gerentes con bono > 1000
print("\n--- Gerentes con bono > 1000 ---")
for g in gerentes:
    if g.bono_gerencial > 1000:
        g.mostrar()

# d) Desarrolladores con >10 horas extras
print("\n--- Desarrolladores con >10 horas extras ---")
for d in desarrolladores:
    if d.horas_extras > 10:
        d.mostrar()
