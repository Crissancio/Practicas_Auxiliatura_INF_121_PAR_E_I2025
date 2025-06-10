class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Empleado(nombre={self.nombre}, edad={self.edad}, salario={self.salario})"
import pickle
import os
from EjePersistenciaObj1 import Empleado

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA

    def crear_archivo(self):
        with open(self.nomA, 'wb') as f:
            pickle.dump([], f)

    def guardar_empleado(self, empleado: Empleado):
        empleados = self._leer_empleados()
        empleados.append(empleado)
        with open(self.nomA, 'wb') as f:
            pickle.dump(empleados, f)

    def busca_empleado(self, nombre: str):
        empleados = self._leer_empleados()
        for e in empleados:
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    def mayor_salario(self, sueldo: float):
        empleados = self._leer_empleados()
        for e in empleados:
            if e.salario > sueldo:
                return e
        return None

    def _leer_empleados(self):
        if not os.path.exists(self.nomA):
            return []
        with open(self.nomA, 'rb') as f:
            return pickle.load(f)
from EjePersistenciaObj1 import ArchivoEmpleado
from EjePersistenciaObj1 import Empleado

archivo = ArchivoEmpleado("empleados.dat")
archivo.crear_archivo()

archivo.guardar_empleado(Empleado("Juan", 30, 2500))
archivo.guardar_empleado(Empleado("Ana", 28, 3200))
archivo.guardar_empleado(Empleado("Luis", 35, 2800))

encontrado = archivo.busca_empleado("Ana")
print("Empleado encontrado:", encontrado)

mayor = archivo.mayor_salario(2600)
print("Empleado con mayor salario:", mayor)
