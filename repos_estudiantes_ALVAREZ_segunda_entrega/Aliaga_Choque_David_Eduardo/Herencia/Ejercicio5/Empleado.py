# a) Implementa las clases con sus constructores, getters y setters
class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcular_salario(self):
        bono = self.salario_base * 0.05 * self.años_antiguedad
        return self.salario_base + bono

    def __str__(self):
        return f"{self.nombre} {self.apellido}"


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
        pago_horas_extras = self.horas_extras * 50
        return super().calcular_salario() + pago_horas_extras


# b) Crea instancias de Gerente y Desarrollador y muestra su salario calculado
gerente1 = Gerente("Ana", "Gómez", 5000, 5, "Ventas", 1200)
desarrollador1 = Desarrollador("Luis", "Pérez", 4000, 3, "Python", 12)
desarrollador2 = Desarrollador("Sofía", "Martínez", 4200, 4, "Java", 8)
gerente2 = Gerente("Carlos", "Ramírez", 5200, 6, "TI", 900)

print(f"Salario de {gerente1}: {gerente1.calcular_salario()}")
print(f"Salario de {desarrollador1}: {desarrollador1.calcular_salario()}")
print(f"Salario de {desarrollador2}: {desarrollador2.calcular_salario()}")
print(f"Salario de {gerente2}: {gerente2.calcular_salario()}")


# c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000
print("\nGerentes con bono gerencial mayor a 1000:")
for g in [gerente1, gerente2]:
    if g.bono_gerencial > 1000:
        print(f"{g} - Bono: {g.bono_gerencial}")


# d) Muestra todos los desarrolladores que trabajan más de 10 horas extras
print("\nDesarrolladores con más de 10 horas extras:")
for d in [desarrollador1, desarrollador2]:
    if d.horas_extras > 10:
        print(f"{d} - Horas extras: {d.horas_extras}")
