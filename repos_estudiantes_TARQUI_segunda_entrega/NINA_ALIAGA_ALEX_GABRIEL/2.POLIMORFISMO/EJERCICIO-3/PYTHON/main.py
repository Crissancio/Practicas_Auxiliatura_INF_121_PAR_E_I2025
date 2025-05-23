class Empleado:
    def __init__(self, nombre, sueldo_mes):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes

    def sueldo_total(self):
        return self.sueldo_mes

    def mostrar_informacion(self):
        print(f"Nombre: {self.nombre}, Sueldo Mensual: {self.sueldo_mes}")

class Cocinero(Empleado):
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        super().__init__(nombre, sueldo_mes)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora)

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print(f"Horas Extra: {self.horas_extra}, Sueldo por Hora: {self.sueldo_hora}")

class Mesero(Empleado):
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        super().__init__(nombre, sueldo_mes)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print(f"Horas Extra: {self.horas_extra}, Sueldo por Hora: {self.sueldo_hora}, Propina: {self.propina}")

class Administrativo(Empleado):
    def __init__(self, nombre, sueldo_mes, cargo):
        super().__init__(nombre, sueldo_mes)
        self.cargo = cargo

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print(f"Cargo: {self.cargo}")

    @staticmethod
    def mostrar_empleados_con_sueldo(empleados, sueldo):
        for empleado in empleados:
            if empleado.sueldo_mes == sueldo:
                empleado.mostrar_informacion()

def main():
    cocinero = Cocinero("Juan", 2000, 10, 15.5)
    mesero1 = Mesero("Pedro", 1500, 5, 12.0, 200.0)
    mesero2 = Mesero("Luis", 1600, 8, 13.0, 250.0)
    admin1 = Administrativo("Ana", 1800, "Gerente")
    admin2 = Administrativo("Maria", 1900, "Recepcionista")

    empleados = [cocinero, mesero1, mesero2, admin1, admin2]

    for empleado in empleados:
        print(f"Sueldo Total de {empleado.nombre}: {empleado.sueldo_total()}")

    print("\nEmpleados con sueldo mensual de 1800:")
    Administrativo.mostrar_empleados_con_sueldo(empleados, 1800)

if __name__ == "__main__":
    main()
