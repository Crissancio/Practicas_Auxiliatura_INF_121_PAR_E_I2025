#1. Sea el siguiente diagrama de clases:
import json
import os

class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario
    def to_dict(self):
        return {"nombre": self.nombre, "edad": self.edad, "salario": self.salario}   
    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: ${self.salario:.2f}"

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA
        if not os.path.exists(self.nomA):
            self.crearArchivo()  
    def crearArchivo(self):
        with open(self.nomA, 'w') as f:
            json.dump([], f)  # Archivo JSON vacío
    
    #a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
    def guardarEmpleado(self, e: Empleado):
        empleados = self._leer_empleados()
        empleados.append(e.to_dict())
        with open(self.nomA, 'w') as f:
            json.dump(empleados, f, indent=4)
    
    #b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos del Empleado n.
    def buscaEmpleado(self, n: str) -> Empleado:
        empleados = self._leer_empleados()
        for emp in empleados:
            if emp["nombre"] == n:
                return Empleado(emp["nombre"], emp["edad"], emp["salario"])
        return None
    
    #c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado
    def mayorSalario(self, s: float) -> Empleado:
        empleados = self._leer_empleados()
        for emp in empleados:
            if emp["salario"] > s:
                return Empleado(emp["nombre"], emp["edad"], emp["salario"])
        return None
    
    def _leer_empleados(self):
        with open(self.nomA, 'r') as f:
            return json.load(f)

if __name__ == "__main__":
    archivo = ArchivoEmpleado("empleados.json")

    with open("empleados.json", 'w') as f:
        json.dump([], f) #para recetear
    #1
    archivo.guardarEmpleado(Empleado("Carla", 24, 12000))
    archivo.guardarEmpleado(Empleado("Jorge", 28, 15000))
    archivo.guardarEmpleado(Empleado("Juan", 30, 21000))
    #2
    print("**Encontrar 'Jorge' ")
    print(archivo.buscaEmpleado("Jorge") or "No encontrado")
    #3
    print("-------------------------------------------------------")
    print("\n**Salario mayor a $2000 ")
    print(archivo.mayorSalario(2000) or "No encontrado")