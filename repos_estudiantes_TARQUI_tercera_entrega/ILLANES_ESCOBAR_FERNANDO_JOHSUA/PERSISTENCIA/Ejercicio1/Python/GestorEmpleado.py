from Empleado import Empleado
import pickle
import os

class GestorEmpleado:
    def __init__(self, archivo="empleados.pkl"):
        self.archivo = archivo

    def guardar_empleado(self, emp: Empleado):
        empleados = self.leer_todos()
        empleados.append(emp)
        with open(self.archivo, 'wb') as f:
            pickle.dump(empleados, f)

    def leer_todos(self):
        if not os.path.exists(self.archivo):
            return []
        with open(self.archivo, 'rb') as f:
            return pickle.load(f)

    def busca_empleado(self, nombre: str):
        for emp in self.leer_todos():
            if emp.nombre.lower() == nombre.lower():
                return emp
        return None

    def mayor_salario(self, sueldo: float):
        for emp in self.leer_todos():
            if emp.salario > sueldo:
                return emp
        return None
