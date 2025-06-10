import pickle
import os

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

class ArchivoEmpleado:
    def __init__(self, nom_archivo):
        self.nomA = nom_archivo

    def crear_archivo(self):
        with open(self.nomA, 'wb') as archivo:
            pickle.dump([], archivo)

    def guardar_empleado(self, empleado):
        empleados = self._leer_empleados()
        empleados.append(empleado)
        with open(self.nomA, 'wb') as archivo:
            pickle.dump(empleados, archivo)

    def busca_empleado(self, nombre):
        empleados = self._leer_empleados()
        for e in empleados:
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    def mayor_salario(self, sueldo):
        empleados = self._leer_empleados()
        for e in empleados:
            if e.salario > sueldo:
                return e
        return None

    def _leer_empleados(self):
        if not os.path.exists(self.nomA):
            return []
        with open(self.nomA, 'rb') as archivo:
            return pickle.load(archivo)
        


archivo = ArchivoEmpleado("empleados.dat")
archivo.crear_archivo()


e1 = Empleado("noemi", 25, 3500)
e2 = Empleado("marco", 30, 4200)
e3 = Empleado("yani", 28, 2800)

archivo.guardar_empleado(e1)
archivo.guardar_empleado(e2)
archivo.guardar_empleado(e3)


print(" Buscar por nombre: noemi")
emp = archivo.busca_empleado("noemi")
print(emp if emp else "Empleado no encontrado")

print(" Empleado con salario mayor a 3000:")
emp_mayor = archivo.mayor_salario(3000)
print(emp_mayor if emp_mayor else "Ninguno con ese salario")
