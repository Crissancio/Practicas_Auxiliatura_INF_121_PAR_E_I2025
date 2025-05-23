# -*- coding: utf-8 -*-
"""
Created on Mon May 19 20:37:56 2025

@author: Fabricio

5. Definir las siguientes clases:
Empleado<nombre, apellido, salario_base, años_antigüedad
Métodos: calcular_salario() (retorna el salario base más un bono
del 5% por cada año de antigüedad)
INF -121 PROGRAMACION II
Carrera de Informática - UMSA Página 4
Gerente (hereda de Empleado)< departamento, bono_gerencial>
Métodos: calcular_salario() (debe sumar el bono gerencial al
salario calculado en la clase base)
Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
Métodos: calcular_salario() (debe sumar un monto adicional por
horas extras al salario calculado en la clase base)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea instancias de Gerente y Desarrollador y muestra su salario
calculado.
c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

"""


class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antiguedad)

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje = lenguaje
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + self.horas_extras * 20


gerentes = [
    Gerente("Carlos", "Rojas", 5000, 10, "TI", 1500),
    Gerente("Elena", "Salas", 4000, 5, "HR", 800)
]

desarrolladores = [
    Desarrollador("Luis", "Mamani", 3000, 4, "Python", 12),
    Desarrollador("Andrea", "Lopez", 3500, 6, "Java", 8)
]

print("\n--- Sueldos ---")
for g in gerentes:
    print(f"{g.nombre} (Gerente): Bs. {g.calcular_salario()}")

for d in desarrolladores:
    print(f"{d.nombre} (Dev): Bs. {d.calcular_salario()}")

print("\n--- Gerentes con bono > 1000 ---")
for g in gerentes:
    if g.bono_gerencial > 1000:
        print(f"{g.nombre} - Bono: {g.bono_gerencial}")

print("\n--- Devs con más de 10 horas extras ---")
for d in desarrolladores:
    if d.horas_extras > 10:
        print(f"{d.nombre} - Horas Extras: {d.horas_extras}")