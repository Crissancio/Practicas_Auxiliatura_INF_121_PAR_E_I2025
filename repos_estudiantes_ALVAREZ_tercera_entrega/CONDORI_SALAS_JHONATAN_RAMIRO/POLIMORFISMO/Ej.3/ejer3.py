class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + self.horasExtra * self.sueldoHora

    def mostrarSiSueldoIgual(self, x):
        if self.sueldoMes == x:
            print(f"Cocinero: {self.nombre}, SueldoMes = {self.sueldoMes}")


class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina

    def mostrarSiSueldoIgual(self, x):
        if self.sueldoMes == x:
            print(f"Mesero: {self.nombre}, SueldoMes = {self.sueldoMes}")


class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldoTotal(self):
        return self.sueldoMes

    def mostrarSiSueldoIgual(self, x):
        if self.sueldoMes == x:
            print(f"Administrativo: {self.nombre}, SueldoMes = {self.sueldoMes}")

cocinero1 = Cocinero("Carlos", 1200, 5, 10)
mesero1 = Mesero("Ana", 900, 3, 8, 50)
mesero2 = Mesero("Luis", 950, 4, 8, 40)
admin1 = Administrativo("Laura", 1100, "Contadora")
admin2 = Administrativo("julian", 1200, "Recursos Humanos")

print("Sueldos Totales")
print(f"{cocinero1.nombre}: ${cocinero1.sueldoTotal()}")
print(f"{mesero1.nombre}: ${mesero1.sueldoTotal()}")
print(f"{mesero2.nombre}: ${mesero2.sueldoTotal()}")
print(f"{admin1.nombre}: ${admin1.sueldoTotal()}")
print(f"{admin2.nombre}: ${admin2.sueldoTotal()}")

print("\nEmpleados con SueldoMes igual a 1200")
x = 1200
cocinero1.mostrarSiSueldoIgual(x)
mesero1.mostrarSiSueldoIgual(x)
mesero2.mostrarSiSueldoIgual(x)
admin1.mostrarSiSueldoIgual(x)
admin2.mostrarSiSueldoIgual(x)
