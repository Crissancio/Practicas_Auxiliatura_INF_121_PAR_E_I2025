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
        print("📁 Archivo creado correctamente.")

    def guardar_empleado(self, e):
        empleados = self._leer_empleados()
        empleados.append(e)
        self._escribir_empleados(empleados)

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
        with open(self.nomA, 'rb') as f:
            try:
                return pickle.load(f)
            except EOFError:
                return []

    def _escribir_empleados(self, empleados):
        with open(self.nomA, 'wb') as f:
            pickle.dump(empleados, f)


# --- Uso del código ---
if __name__ == "__main__":
    archivo = ArchivoEmpleado("empleados.dat")
    archivo.crear_archivo()

    archivo.guardar_empleado(Empleado("Juan", 30, 3500.0))
    archivo.guardar_empleado(Empleado("Ana", 25, 4200.5))
    archivo.guardar_empleado(Empleado("Luis", 40, 5000.0))

    buscado = archivo.busca_empleado("Ana")
    print(f"🔍 Empleado buscado: {buscado}")

    mejor_pago = archivo.mayor_salario(4000.0)
    print(f"💰 Primer empleado con sueldo mayor a 4000: {mejor_pago}")
