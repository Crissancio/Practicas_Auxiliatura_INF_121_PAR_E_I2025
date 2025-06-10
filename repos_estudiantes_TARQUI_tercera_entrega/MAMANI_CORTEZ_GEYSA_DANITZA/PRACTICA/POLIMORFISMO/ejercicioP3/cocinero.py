#Ejercicio 3:Un restaurante organiza a su personal mediante las siguientes clases:
class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        total = self.sueldo_mes + (self.horas_extra * self.sueldo_hora)
        return total

    def mostrar_si_sueldo_es(self, x):
        if self.sueldo_mes == x:
            print(f"Cocinero: {self.nombre}, Sueldo base: {self.sueldo_mes}")


class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        total = self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina
        return total

    def mostrar_si_sueldo_es(self, x):
        if self.sueldo_mes == x:
            print(f"Mesero: {self.nombre}, Sueldo base: {self.sueldo_mes}")


class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def sueldo_total(self):
        return self.sueldo_mes

    def mostrar_si_sueldo_es(self, x):
        if self.sueldo_mes == x:
            print(f"Administrativo: {self.nombre}, Sueldo base: {self.sueldo_mes}, Cargo: {self.cargo}")
# Instanciar objetos
cocinero1 = Cocinero("Carlos", 2100, 10, 15)
mesero1 = Mesero("Ana", 1200, 5, 10, 200)
mesero2 = Mesero("Luis", 1200, 6, 10, 150)
admin1 = Administrativo("Laura", 2100, "Contadora")
admin2 = Administrativo("Miguel", 2000, "Gerente")

empleados = [cocinero1, mesero1, mesero2, admin1, admin2]

# Mostrar sueldos totales
print("**** SUELDOS TOTALES ***")
for e in empleados:
    print(f"{e.nombre} gana en total: ${e.sueldo_total()}")

# Buscar empleados con sueldo base igual a 1200
print("\n**** EMPLEADOS CON SUELDO BASE = 1200 ***")
for e in empleados:
    e.mostrar_si_sueldo_es(1200)