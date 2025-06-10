# 5. Definir las siguientes clases:
# Empleado<nombre, apellido, salario_base, años_antigüedad
# Métodos: calcular_salario() (retorna el salario base más un bono
# del 5% por cada año de antigüedad)
# Gerente (hereda de Empleado)< departamento, bono_gerencial>
# Métodos: calcular_salario() (debe sumar el bono gerencial al
# salario calculado en la clase base)
# Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
# Métodos: calcular_salario() (debe sumar un monto adicional por
# horas extras al salario calculado en la clase base)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea instancias de Gerente y Desarrollador y muestra su salario
# calculado.
# c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
# d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.
class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre, self.apellido, self.salario_base, self.años_antiguedad = nombre, apellido, salario_base, años_antiguedad

    def calcular_salario(self):
        return self.salario_base + self.salario_base * 0.05 * self.años_antiguedad


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento, self.bono_gerencial = departamento, bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje_programacion, self.horas_extras = lenguaje_programacion, horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + self.horas_extras * 20

gerentes = [
    Gerente("Lucía", "Vargas", 3000, 10, "TI", 1500),
    Gerente("Mario", "Gómez", 2800, 5, "HR", 800)
]

desarrolladores = [
    Desarrollador("Juan", "Paz", 2500, 3, "Python", 12),
    Desarrollador("Carla", "Suárez", 2300, 2, "Java", 8)
]

print("\nGerentes con bono gerencial > 1000:")
for g in gerentes:
    if g.bono_gerencial > 1000:
        print(f"{g.nombre}, Salario calculado: {g.calcular_salario()}")

print("\nDesarrolladores con >10 horas extras:")
for d in desarrolladores:
    if d.horas_extras > 10:
        print(f"{d.nombre}, Salario calculado: {d.calcular_salario()}")
