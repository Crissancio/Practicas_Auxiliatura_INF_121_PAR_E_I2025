#Un restaurante organiza a su personal mediante las siguientes clases:
    #a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo. 
    #b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.  
    #c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.

# DEBE SER CLASE MESERO
# NO SIGUE EL DIAGRAMA ASIGNADO EN EL EJERCICIO
class Empleado:
    def __init__(self, nombre, sueldoMes):
        self.nombre = nombre
        self.sueldoMes = sueldoMes

    def sueldoTotal(self):
        return self.sueldoMes

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Sueldo Mensual: {self.sueldoMes}")

    @staticmethod
    def mostrarPorSueldo(empleados, sueldoX):
        print(f"Empleados con sueldo {sueldoX}:")
        for emp in empleados:
            if emp.sueldoTotal() == sueldoX:
                emp.mostrar()


class Cocinero(Empleado):
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        super().__init__(nombre, sueldoMes)
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)


class Mesero(Empleado):
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        super().__init__(nombre, sueldoMes)
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina


class Administrativo(Empleado):
    def __init__(self, nombre, sueldoMes, cargo):
        super().__init__(nombre, sueldoMes)
        self.cargo = cargo

cocinero1 = Cocinero("Carlos", 1500, 10, 20)
mesero1 = Mesero("Luis", 1200, 5, 15, 200)
mesero2 = Mesero("Ana", 1300, 8, 14, 250)
admin1 = Administrativo("Sofía", 1800, "Gerente")
admin2 = Administrativo("Pedro", 1700, "Supervisor")

empleados = [cocinero1, mesero1, mesero2, admin1, admin2]

for emp in empleados:
    print(f"{emp.nombre} - Sueldo Total: {emp.sueldoTotal()}")

Empleado.mostrarPorSueldo(empleados, 1700)
