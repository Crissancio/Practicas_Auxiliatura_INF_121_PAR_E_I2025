# 1. Sea el siguiente diagrama de clases:
# a) Implementa el método guardarEmpleado(Empleado e) para almacenar
# empleados.
# b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
# del Empleado n.
# c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
# sueldo mayor al ingresado.
import json

class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo

    def to_dict(self):
        return {"nombre": self.nombre, "sueldo": self.sueldo}


def guardarEmpleado(e):
    with open("empleados.json", "a") as f:
        f.write(json.dumps(e.to_dict()) + "\n")


def buscaEmpleado(nombre):
    with open("empleados.json", "r") as f:
        for line in f:
            e = json.loads(line)
            if e["nombre"] == nombre:
                return e
    return None


def mayorSalario(sueldo_limite):
    with open("empleados.json", "r") as f:
        for line in f:
            e = json.loads(line)
            if e["sueldo"] > sueldo_limite:
                return e
    return None

guardarEmpleado(Empleado("Kazuma", 5000))
guardarEmpleado(Empleado("Megumin", 6000))

print("Buscar Kazuma:", buscaEmpleado("Kazuma"))
print("Primero con sueldo > 4000:", mayorSalario(4000))
