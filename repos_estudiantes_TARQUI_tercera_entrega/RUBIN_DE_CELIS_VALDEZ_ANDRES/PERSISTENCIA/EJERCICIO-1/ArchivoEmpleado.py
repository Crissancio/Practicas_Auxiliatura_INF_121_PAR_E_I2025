import os
from Empleado import Empleado

class ArchivoEmpleado:
    def __init__(self, nombre_archivo: str):
        self.nombre_archivo = nombre_archivo
        self.crear_archivo()
    
    def crear_archivo(self):
        try:
            with open(self.nombre_archivo, 'x'):
                pass
        except FileExistsError:
            pass
    
    def guardar_empleado(self, empleado: Empleado):
        with open(self.nombre_archivo, 'a') as f:
            f.write(f"{empleado.nombre},{empleado.edad},{empleado.salario}\n")
    
    def buscar_empleado(self, nombre: str) -> Empleado:
        with open(self.nombre_archivo, 'r') as f:
            for linea in f:
                datos = linea.strip().split(',')
                if datos[0].lower() == nombre.lower():
                    return Empleado(datos[0], int(datos[1]), float(datos[2]))
        return None
    
    def mayor_salario(self, salario_minimo: float) -> Empleado:
        with open(self.nombre_archivo, 'r') as f:
            for linea in f:
                datos = linea.strip().split(',')
                if float(datos[2]) > salario_minimo:
                    return Empleado(datos[0], int(datos[1]), float(datos[2]))
        return None
    
    def mostrar_empleados(self):
        with open(self.nombre_archivo, 'r') as f:
            for linea in f:
                datos = linea.strip().split(',')
                print(Empleado(datos[0], int(datos[1]), float(datos[2])))
