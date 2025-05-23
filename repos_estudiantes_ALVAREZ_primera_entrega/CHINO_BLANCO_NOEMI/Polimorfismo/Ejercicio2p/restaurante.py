class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        return self.sueldo_mes + self.horas_extra * self.sueldo_hora


class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo_mes + self.horas_extra * self.sueldo_hora + self.propina


class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def sueldo_total(self):
        return self.sueldo_mes



cocinero = Cocinero("Noemi", 2732, 11, 15)
mesero1 = Mesero("Chino", 1232, 5, 10, 200)
mesero2 = Mesero("Blanco", 9873, 8, 12, 150)
admin1 = Administrativo("Jose", 2000, "ejecutivo")
admin2 = Administrativo("cristian", 2000, "hospital")

empleados = [cocinero, mesero1, mesero2, admin1, admin2]

print("Sueldos Totales:")
for emp in empleados:
    print(f"{emp.nombre}: ${emp.sueldo_total()}")


# debe ser un metodo de las clases

def mostrar_por_sueldo_mensual(x):
    print(f"\nEmpleados con sueldo mensual igual a {x}:")
    for emp in empleados:
        if emp.sueldo_mes == x:
            print(f"{emp.nombre}")


mostrar_por_sueldo_mensual(2000)
