#1.Sea el siguiente diagrama de clases:
#a)Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
#b)Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos del Empleado n.
#c)Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado.
import pickle

class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo

    def __str__(self):
        return f"Nombre: {self.nombre}, Sueldo: {self.sueldo}"


def guardar_empleado(e):
    with open("empleados.pkl", "ab") as f:
        pickle.dump(e, f)


def buscar_empleado(nombre):
    try:
        with open("empleados.pkl", "rb") as f:
            while True:
                e = pickle.load(f)
                if e.nombre == nombre:
                    print("Empleado encontrado:", e)
                    return
    except EOFError:
        print("Empleado no encontrado.")
    except FileNotFoundError:
        print("Archivo no encontrado.")


def mayor_salario(sueldo):
    try:
        with open("empleados.pkl", "rb") as f:
            while True:
                e = pickle.load(f)
                if e.sueldo > sueldo:
                    print("Empleado con mayor sueldo:", e)
                    return
    except EOFError:
        print("No se encontró un empleado con sueldo mayor.")
    except FileNotFoundError:
        print("Archivo no encontrado.")

guardar_empleado(Empleado("Carlos", 3000))
buscar_empleado("Carlos")
mayor_salario(2500)
