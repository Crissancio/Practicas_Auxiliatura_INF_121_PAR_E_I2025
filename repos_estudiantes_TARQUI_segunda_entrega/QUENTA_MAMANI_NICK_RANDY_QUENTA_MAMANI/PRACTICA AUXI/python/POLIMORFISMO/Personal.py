"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"3. Un restaurante organiza a su personal mediante las siguientes clases:"

"a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo."
"b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,"
"sumándole las horas extra, considerando el sueldo por hora y la propina"
"en caso de los meseros."
"c) Sobrecargar el método para mostrar a aquellos Empleados que tengan"
"SueldoMes igual a X."


class Empleado:
    def __init__(self, nombre, sueldo_mes):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes

    def sueldo_total(self):
        return self.sueldo_mes

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Sueldo Mensual: {self.sueldo_mes}")

class Cocinero(Empleado):
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        super().__init__(nombre, sueldo_mes)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora)

class Mesero(Empleado):
    def __init__(self, nombre, sueldo_mes, propina):
        super().__init__(nombre, sueldo_mes)
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo_mes + self.propina

class Administrativo(Empleado):
    def __init__(self, nombre, sueldo_mes, cargo):
        super().__init__(nombre, sueldo_mes)
        self.cargo = cargo

    def sueldo_total(self):
        return self.sueldo_mes

if __name__ == "__main__":
    cocinero = Cocinero("Roy", 1600, 10, 20)
    mesero1 = Mesero("Enana", 500, 150)
    mesero2 = Mesero("Gafi", 100, 1)
    admin1 = Administrativo("Johan", 10000, "Gerente")
    admin2 = Administrativo("Pblo", 1800, "Supervisor")

    print("Sueldos Totales:")
    print("Cocinero:", cocinero.sueldo_total())
    print("Mesero 1:", mesero1.sueldo_total())
    print("Mesero 2:", mesero2.sueldo_total())
    print("Administrativo 1:", admin1.sueldo_total())
    print("Administrativo 2:", admin2.sueldo_total())

    x = 2500
    print("\nEmpleados con SueldoMes igual a", x, ":")
    if cocinero.sueldo_mes == x:
        cocinero.mostrar()
    if mesero1.sueldo_mes == x:
        mesero1.mostrar()
    if mesero2.sueldo_mes == x:
        mesero2.mostrar()
    if admin1.sueldo_mes == x:
        admin1.mostrar()
    if admin2.sueldo_mes == x:
        admin2.mostrar()
