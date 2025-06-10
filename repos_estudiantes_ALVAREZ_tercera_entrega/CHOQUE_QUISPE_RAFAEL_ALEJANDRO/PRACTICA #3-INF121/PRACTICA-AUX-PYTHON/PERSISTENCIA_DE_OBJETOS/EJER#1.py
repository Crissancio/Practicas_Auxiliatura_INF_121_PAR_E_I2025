import pickle
import os
#pickle pra bin "empleados.bin"
# a) Clase Empleado que se almacenará
class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

archivo = "empleados.bin"

# a) Guardar empleado en archivo binario
def guardar_empleado(e):
    empleados = []
    if os.path.exists(archivo):
        with open(archivo, "rb") as f:
            empleados = pickle.load(f)
    empleados.append(e)
    with open(archivo, "wb") as f:
        pickle.dump(empleados, f)

# b) Buscar empleado por nombre
def buscar_empleado(nombre):
    if not os.path.exists(archivo):
        print("Archivo no encontrado.")
        return
    with open(archivo, "rb") as f:
        empleados = pickle.load(f)
        for e in empleados:
            if e.nombre.lower() == nombre.lower():
                print("Empleado encontrado:", e)
                return
    print("Empleado no encontrado.")

# c) Buscar primer empleado con salario mayor al indicado
def mayor_salario(sueldo):
    if not os.path.exists(archivo):
        print("Archivo no encontrado.")
        return
    with open(archivo, "rb") as f:
        empleados = pickle.load(f)
        for e in empleados:
            if e.salario > sueldo:
                print("Empleado con salario mayor:", e)
                return
    print("Ningún empleado con salario mayor.")

if __name__ == "__main__":
    # a) Guardar empleados
    e1 = Empleado("Maria", 25, 2800)
    e2 = Empleado("Carlos", 30, 3500)
    guardar_empleado(e1)
    guardar_empleado(e2)

    # b) Buscar empleado por nombre
    buscar_empleado("Carlos")

    # c) Buscar empleado con salario mayor a 3000
    mayor_salario(3000)
