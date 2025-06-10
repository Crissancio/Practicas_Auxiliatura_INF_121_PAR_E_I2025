''''''
class Empleado:
    def __init__(self, nombre, sueldoMes):
        self.nombre = nombre
        self.sueldoMes = sueldoMes

    def sueldo_total(self):
        return self.sueldoMes

class Cocinero(Empleado):
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        super().__init__(nombre, sueldoMes)
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldo_total(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)

class Mesero(Empleado):
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        super().__init__(nombre, sueldoMes)
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina


class Administrativo(Empleado):
    def __init__(self, nombre, sueldoMes, cargo):
        super().__init__(nombre, sueldoMes)
        self.cargo = cargo


def mostrar_empleados_con_sueldo(empleados, sueldo_buscar):
    print(f"Empleados con sueldo mensual igual a {sueldo_buscar}:")
    for empleado in empleados:
        if empleado.sueldoMes == sueldo_buscar:
            print(f"- {empleado.nombre} ({empleado.__class__.__name__})")

cocinero = Cocinero("ROCO", 1000, 10, 15)
mesero1 = Mesero("Monche", 900, 5, 10, 150)
mesero2 = Mesero("gerardo", 950, 8, 12, 200)
admin1 = Administrativo("Xavier", 1200, "Deueño")
admin2 = Administrativo("Wanda", 1100, "Secretaria")

empleados = [cocinero, mesero1, mesero2, admin1, admin2]

print("Sueldo Total - Empleados:")
for empleado in empleados:
    print(f"{empleado.nombre} ({empleado.__class__.__name__}): {empleado.sueldo_total()}")

mostrar_empleados_con_sueldo(empleados, 1200)
