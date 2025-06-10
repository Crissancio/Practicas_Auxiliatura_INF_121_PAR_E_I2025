import pickle
import os

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Empleado(nombre='{self.nombre}', edad={self.edad}, salario={self.salario})"

class ArchivoEmpleado:
    def __init__(self, nomA):
        self.nomA = nomA

    def crear_archivo(self):
        with open(self.nomA, 'wb') as f:
            pickle.dump([], f)

    def guardar_empleado(self, empleado):
        lista = self._leer_empleados()
        lista.append(empleado)
        self._guardar_lista(lista)

    def busca_empleado(self, nombre):
        for e in self._leer_empleados():
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    def mayor_salario(self, sueldo):
        for e in self._leer_empleados():
            if e.salario > sueldo:
                return e
        return None

    def _leer_empleados(self):
        if not os.path.exists(self.nomA) or os.path.getsize(self.nomA) == 0:
            return []
        with open(self.nomA, 'rb') as f:
            return pickle.load(f)

    def _guardar_lista(self, lista):
        with open(self.nomA, 'wb') as f:
            pickle.dump(lista, f)

if __name__ == "__main__":
    archivo = ArchivoEmpleado("empleados.dat")
    archivo.crear_archivo()
    archivo.guardar_empleado(Empleado("Luis", 30, 2500))
    archivo.guardar_empleado(Empleado("Ana", 28, 3200))

    encontrado = archivo.busca_empleado("Ana")
    if encontrado:
        print("Empleado encontrado:", encontrado)
    else:
        print("Empleado no encontrado.")

    mayor = archivo.mayor_salario(2800)
    if mayor:
        print("Empleado con salario mayor a 2800:", mayor)
    else:
        print("No se encontró empleado con ese salario.")
