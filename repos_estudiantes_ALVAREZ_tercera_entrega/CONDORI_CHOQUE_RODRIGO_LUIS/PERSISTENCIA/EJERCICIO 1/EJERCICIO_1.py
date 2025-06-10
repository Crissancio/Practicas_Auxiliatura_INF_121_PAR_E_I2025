#1. Sea el siguiente diagrama de clases:
#a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
#b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos del Empleado n.
#c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado
import json

class Empleado:
    def __init__(self, nombre: str, id: int, salario: float):
        self.nombre = nombre
        self.id = id
        self.salario = salario

    def to_dict(self):
        return {"nombre": self.nombre, "id": self.id, "salario": self.salario}

    def __str__(self):
        return f"{self.nombre} - ID: {self.id} - Salario: {self.salario}"

class ArchivoEmpleado:
    def __init__(self, archivo):
        self.archivo = archivo

    def guardar_empleado(self, emp: Empleado):
        try:
            with open(self.archivo, 'r') as f:
                datos = json.load(f)
        except FileNotFoundError:
            datos = []

        datos.append(emp.to_dict())
        with open(self.archivo, 'w') as f:
            json.dump(datos, f, indent=4)

    def buscar_empleado(self, nombre: str):
        with open(self.archivo, 'r') as f:
            datos = json.load(f)
            for e in datos:
                if e['nombre'] == nombre:
                    return Empleado(e['nombre'], e['id'], e['salario'])
        return None

    def mayor_salario(self, minimo: float):
        with open(self.archivo, 'r') as f:
            datos = json.load(f)
            for e in datos:
                if e['salario'] > minimo:
                    return Empleado(e['nombre'], e['id'], e['salario'])
        return None

def main():
    archivo = ArchivoEmpleado("empleados.json")
    archivo.guardar_empleado(Empleado("Sofia", 1, 6000))
    archivo.guardar_empleado(Empleado("Carlos", 2, 8000))

    print("Buscar Sofia:", archivo.buscar_empleado("Sofia"))
    print("Mayor salario sobre 6500:", archivo.mayor_salario(6500))

if __name__ == "__main__":
    main()
