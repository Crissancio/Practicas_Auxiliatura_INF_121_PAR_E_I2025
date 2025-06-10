import os
from Empleado import Empleado

rutaEmpleados = "C:/Users/teran/OneDrive/Desktop/Progra II/Practica 3 aux/PERSISTENCIA DE OBJETOS/Ejercicio 1/Python/Empleados/"

class ArchivoEmpleado:
    def __init__(self, nombreArchivo):
        self.nombreArchivo = nombreArchivo
        self.empleados = []

    def cargarEmpleados(self):
        self.empleados = []
        for archivo in os.listdir(rutaEmpleados):
            ruta = os.path.join(rutaEmpleados, archivo)
            if os.path.isfile(ruta):
                e = Empleado()
                e.cargarDatos(ruta)
                self.empleados.append(e)

    def guardarEmpleado(self, e: Empleado):
        ruta = os.path.join(rutaEmpleados, f"{e.nombre}.txt")
        e.guardarDatos(ruta)
        self.empleados.append(e)

    def buscaEmpleado(self, nombre):
        for e in self.empleados:
            if e.nombre == nombre:
                return e
        return None

    def mayorSalario(self, sueldo):
        for e in self.empleados:
            if e.salario > sueldo:
                return e
        return None
