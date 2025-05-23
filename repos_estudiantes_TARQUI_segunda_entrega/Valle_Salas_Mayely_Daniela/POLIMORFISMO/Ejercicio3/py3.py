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


cocinero1 = Cocinero("Ana", 1200, 10, 15)
mesero1 = Mesero("Dana", 1000, 5, 10, 50)
mesero2 = Mesero("Fabiola", 1100, 3, 12, 30)
admin1 = Administrativo("Luis", 1500, "Gerente")
admin2 = Administrativo("Andres", 1400, "Asistente")

print(f"Sueldo total de {cocinero1.nombre}: {cocinero1.sueldo_total()}")
print(f"Sueldo total de {mesero1.nombre}: {mesero1.sueldo_total()}")
print(f"Sueldo total de {mesero2.nombre}: {mesero2.sueldo_total()}")
print(f"Sueldo total de {admin1.nombre}: {admin1.sueldo_total()}")
print(f"Sueldo total de {admin2.nombre}: {admin2.sueldo_total()}")

def mostrar_empleados_con_sueldo(empleados, sueldo_buscado):
    for empleado in empleados:
        if empleado.sueldoMes == sueldo_buscado:
            print(f"Empleado: {empleado.nombre}, SueldoMes: {empleado.sueldoMes}")

empleados = [cocinero1, mesero1, mesero2, admin1, admin2]

print("Empleados con SueldoMes igual a 1200:")
mostrar_empleados_con_sueldo(empleados, 1200)
