import pickle
from empleado import Empleado  

class ArchivoEmpleado:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        """Crea el archivo si no existe"""
        try:
            with open(self.nombre_archivo, "wb") as archivo:
                pickle.dump([], archivo) 
        except Exception as e:
            print("Error al crear archivo:", e)

    def guardar_empleado(self, empleado):
        """Guarda un empleado en el archivo"""
        empleados = self.leer_todos()
        empleados.append(empleado)
        with open(self.nombre_archivo, "wb") as archivo:
            pickle.dump(empleados, archivo)

    def leer_todos(self):
        """Lee todos los empleados guardados en el archivo"""
        try:
            with open(self.nombre_archivo, "rb") as archivo:
                return pickle.load(archivo)
        except (FileNotFoundError, EOFError):
            return []

    def busca_empleado(self, nombre):
        """Busca un empleado por nombre"""
        empleados = self.leer_todos()
        for emp in empleados:
            if emp.nombre == nombre:
                return emp
        return None

    def mayor_salario(self, salario):
        """Encuentra el primer empleado con salario mayor al indicado"""
        empleados = self.leer_todos()
        for emp in empleados:
            if emp.salario > salario:
                return emp
        return None
