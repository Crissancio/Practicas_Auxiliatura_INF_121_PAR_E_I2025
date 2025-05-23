# a) Implementar el diagrama UML con los atributos y métodos mostrados
# en la imagen.
# b) Desarrollar una función llamada getSalario(), que en el caso de TFijo
# es el sueldo normal, pero en el caso de TComisionista, es la comisión
# mas el sueldo base.
# c) Determinar en un grupo de empleados TFijo, cual es el que gana más.
# d) Buscar al empleado comisionista de menor sueldo y verificar cual es su
# nombre. 
class Empleado:
    def __init__(self, nombre, apellido):
        self.nombre, self.apellido = nombre, apellido

class TFijo(Empleado):
    def __init__(self, nombre, apellido, sueldo):
        super().__init__(nombre, apellido)
        self.sueldo = sueldo

    def getSalario(self): return self.sueldo

class TComisionista(Empleado):
    def __init__(self, nombre, apellido, sueldo_base, comision):
        super().__init__(nombre, apellido)
        self.sueldo_base, self.comision = sueldo_base, comision

    def getSalario(self): return self.sueldo_base + self.comision

fijos = [TFijo("Ana", "Perez", 3000), TFijo("Luis", "Rojas", 4000)]
comisionistas = [TComisionista("Carlos", "Lima", 2500, 600), TComisionista("Marta", "Zelaya", 2000, 300)]

mayor = max(fijos, key=lambda f: f.getSalario())
print(f"Empleado TFijo con mayor salario: {mayor.nombre}, Salario: {mayor.getSalario()}")

menor = min(comisionistas, key=lambda c: c.getSalario())
print(f"Empleado Comisionista con menor salario: {menor.nombre}, Salario: {menor.getSalario()}")
