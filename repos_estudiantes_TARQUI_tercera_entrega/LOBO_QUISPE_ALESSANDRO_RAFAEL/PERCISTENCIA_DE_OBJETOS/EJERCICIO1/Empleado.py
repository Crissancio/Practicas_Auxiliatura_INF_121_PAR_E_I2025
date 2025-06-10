import pickle
import os
from typing import List, Optional

class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario
    
    def __str__(self):
        return f"Empleado(nombre='{self.nombre}', edad={self.edad}, salario={self.salario})"

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA
        self.empleados: List[Empleado] = []
        self.crear_archivo()
    
    def crear_archivo(self):
        """Crea el archivo si no existe"""
        if not os.path.exists(self.nomA):
            with open(self.nomA, 'wb') as f:
                pickle.dump([], f)
    
    def guardar_empleado(self, e: Empleado):
        """Guarda un empleado en el archivo"""
        self.cargar_empleados()
        self.empleados.append(e)
        self.guardar_en_archivo()
    
    def guardar_en_archivo(self):
        """Guarda la lista de empleados en el archivo"""
        with open(self.nomA, 'wb') as f:
            pickle.dump(self.empleados, f)
    
    def cargar_empleados(self):
        """Carga la lista de empleados desde el archivo"""
        try:
            with open(self.nomA, 'rb') as f:
                self.empleados = pickle.load(f)
        except (EOFError, FileNotFoundError):
            self.empleados = []
    
    def busca_empleado(self, n: str) -> Optional[Empleado]:
        """Busca un empleado por nombre (insensible a mayúsculas)"""
        self.cargar_empleados()
        for emp in self.empleados:
            if emp.nombre.lower() == n.lower():
                return emp
        return None
    
    def mayor_salario(self, sueldo: float) -> Optional[Empleado]:
        """Devuelve el primer empleado con salario mayor al especificado"""
        self.cargar_empleados()
        for emp in self.empleados:
            if emp.salario > sueldo:
                return emp
        return None

# Prueba del sistema
if __name__ == "__main__":
    # Crear archivo de empleados
    archivo = ArchivoEmpleado("empleados.pkl")
    
    # Agregar algunos empleados
    archivo.guardar_empleado(Empleado("Juan Pérez", 35, 2500.50))
    archivo.guardar_empleado(Empleado("María García", 28, 3200.75))
    archivo.guardar_empleado(Empleado("Carlos López", 42, 1800.30))
    
    # Buscar un empleado por nombre
    encontrado = archivo.busca_empleado("María García")
    if encontrado:
        print(f"Empleado encontrado: {encontrado}")
    else:
        print("Empleado no encontrado")
    
    # Buscar empleado con mayor salario que 2000
    mayor_salario = archivo.mayor_salario(2000.0)
    if mayor_salario:
        print(f"Empleado con salario mayor a 2000: {mayor_salario}")
    else:
        print("No hay empleados con salario mayor a 2000")
