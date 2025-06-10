import pickle
import os

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Empleado [Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}]"

class ArchivoEmpleado:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        with open(self.nombre_archivo, "wb") as f:
            pickle.dump([], f)
        print("Archivo creado exitosamente.")

    def guardar_empleado(self, empleado):
        empleados = self._leer_archivo()
        empleados.append(empleado)
        self._escribir_archivo(empleados)

    def busca_empleado(self, nombre):
        empleados = self._leer_archivo()
        for e in empleados:
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    def mayor_salario(self, sueldo):
        empleados = self._leer_archivo()
        for e in empleados:
            if e.salario > sueldo:
                return e
        return None

    def _leer_archivo(self):
        if not os.path.exists(self.nombre_archivo):
            return []
        with open(self.nombre_archivo, "rb") as f:
            return pickle.load(f)

    def _escribir_archivo(self, empleados):
        with open(self.nombre_archivo, "wb") as f:
            pickle.dump(empleados, f)

if __name__ == "__main__":
    archivo = ArchivoEmpleado("empleados.dat")
    archivo.crear_archivo()

    archivo.guardar_empleado(Empleado("Ana", 28, 4200))
    archivo.guardar_empleado(Empleado("Luis", 35, 5500))
    archivo.guardar_empleado(Empleado("Rosa", 40, 3800))

    print("--- Buscar empleado por nombre: Luis ---")
    encontrado = archivo.busca_empleado("Luis")
    print(encontrado if encontrado else "No encontrado")

    print("--- Buscar empleado con salario mayor a 4000 ---")
    mayor = archivo.mayor_salario(4000)
    print(mayor if mayor else "Ninguno supera ese salario")