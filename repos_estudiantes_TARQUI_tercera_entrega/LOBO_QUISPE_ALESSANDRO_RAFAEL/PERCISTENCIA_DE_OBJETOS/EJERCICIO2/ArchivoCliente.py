import pickle
import os
from typing import List, Optional

class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
    
    def __str__(self):
        return f"Cliente[id={self.id}, nombre='{self.nombre}', telefono={self.telefono}]"

class ArchivoCliente:
    def __init__(self, nomA: str):
        self.nomA = nomA
        self.clientes: List[Cliente] = []
        self.crear_archivo()
    
    def crear_archivo(self):
        """Crea el archivo si no existe"""
        if not os.path.exists(self.nomA):
            with open(self.nomA, 'wb') as f:
                pickle.dump([], f)
    
    def guarda_cliente(self, c: Cliente):
        """Guarda un cliente en el archivo"""
        self.cargar_clientes()
        self.clientes.append(c)
        self.guardar_en_archivo()
    
    def guardar_en_archivo(self):
        """Guarda la lista de clientes en el archivo"""
        with open(self.nomA, 'wb') as f:
            pickle.dump(self.clientes, f)
    
    def cargar_clientes(self):
        """Carga la lista de clientes desde el archivo"""
        try:
            with open(self.nomA, 'rb') as f:
                self.clientes = pickle.load(f)
        except (EOFError, FileNotFoundError):
            self.clientes = []
    
    # b) Buscar cliente por ID
    def buscar_cliente(self, id: int) -> Optional[Cliente]:
        """Busca un cliente por su ID"""
        self.cargar_clientes()
        for c in self.clientes:
            if c.id == id:
                return c
        return None
    
    # c) Buscar cliente por teléfono celular
    def buscar_celular_cliente(self, telefono: int) -> Optional[Cliente]:
        """Busca un cliente por su número de teléfono"""
        self.cargar_clientes()
        for c in self.clientes:
            if c.telefono == telefono:
                return c
        return None

# Prueba del sistema
if __name__ == "__main__":
    archivo = ArchivoCliente("clientes.pkl")
    
    # Agregar clientes de prueba
    archivo.guarda_cliente(Cliente(1, "Juan Pérez", 5551234))
    archivo.guarda_cliente(Cliente(2, "María García", 5555678))
    archivo.guarda_cliente(Cliente(3, "Carlos López", 5559012))
    
    # Prueba buscar por ID
    encontrado = archivo.buscar_cliente(2)
    print(f"Cliente encontrado por ID: {encontrado}")
    
    # Prueba buscar por teléfono
    por_telefono = archivo.buscar_celular_cliente(5559012)
    print(f"Cliente encontrado por teléfono: {por_telefono}")
