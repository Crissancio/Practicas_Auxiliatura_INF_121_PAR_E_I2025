import pickle
import os
from typing import List, Optional

class Medicamento:
    def __init__(self, nombre: str = "", cod_medicamento: int = 0, tipo: str = "", precio: float = 0.0):
        self.nombre = nombre
        self.cod_medicamento = cod_medicamento
        self.tipo = tipo
        self.precio = precio
    
    def leer(self):
        # Implementar lectura de datos si es necesario
        pass
    
    def mostrar(self):
        print(f"Medicamento: {self.nombre}, Código: {self.cod_medicamento}, "
              f"Tipo: {self.tipo}, Precio: {self.precio}")
    
    def get_tipo(self) -> str:
        return self.tipo
    
    def get_precio(self) -> float:
        return self.precio
    
    def get_nombre(self) -> str:
        return self.nombre

class Farmacia:
    def __init__(self, nombre_farmacia: str = "", sucursal: int = 0, director: str = "", cant_medicamentos: int = 0):
        self.nombre_farmacia = nombre_farmacia
        self.sucursal = sucursal
        self.director = director
        self.cant_medicamentos = cant_medicamentos
        self.medicamentos: List[Medicamento] = []
    
    def leer(self):
        # Implementar lectura de datos si es necesario
        pass
    
    def mostrar(self):
        print(f"Farmacia: {self.nombre_farmacia}, Sucursal: {self.sucursal}, "
              f"Director: {self.director}, Medicamentos: {self.cant_medicamentos}")
    
    def get_direccion(self) -> str:
        return self.director
    
    def get_sucursal(self) -> int:
        return self.sucursal
    
    def mostrar_medicamentos(self, tipo: str):
        for med in self.medicamentos:
            if med.get_tipo().lower() == tipo.lower():
                med.mostrar()
    
    def buscar_medicamento(self, nombre_med: str) -> Optional[Medicamento]:
        for med in self.medicamentos:
            if med.get_nombre().lower() == nombre_med.lower():
                return med
        return None
    
    def agregar_medicamento(self, med: Medicamento):
        if self.cant_medicamentos < 100:
            self.medicamentos.append(med)
            self.cant_medicamentos += 1

class ArchFarmacia:
    def __init__(self, nombre_archivo: str):
        self.nombre_archivo = nombre_archivo
        self.farmacias: List[Farmacia] = []
        self.crear_archivo()
    
    def crear_archivo(self):
        """Crea el archivo si no existe"""
        if not os.path.exists(self.nombre_archivo):
            with open(self.nombre_archivo, 'wb') as f:
                pickle.dump([], f)
    
    def adicionar(self, farmacia: Farmacia):
        """Añade una farmacia al archivo"""
        self.cargar_farmacias()
        self.farmacias.append(farmacia)
        self.guardar_en_archivo()
    
    def guardar_en_archivo(self):
        """Guarda la lista de farmacias en el archivo"""
        with open(self.nombre_archivo, 'wb') as f:
            pickle.dump(self.farmacias, f)
    
    def cargar_farmacias(self):
        """Carga la lista de farmacias desde el archivo"""
        try:
            with open(self.nombre_archivo, 'rb') as f:
                self.farmacias = pickle.load(f)
        except (EOFError, FileNotFoundError):
            self.farmacias = []
    
    def listar(self):
        """Lista todas las farmacias"""
        self.cargar_farmacias()
        for farmacia in self.farmacias:
            farmacia.mostrar()
    
    # b) Mostrar medicamentos para la tos de sucursal X
    def mostrar_medicamentos_tos(self, sucursal_x: int):
        """Muestra medicamentos para tos de una sucursal específica"""
        self.cargar_farmacias()
        for farmacia in self.farmacias:
            if farmacia.get_sucursal() == sucursal_x:
                farmacia.mostrar_medicamentos("tos")
    
    # c) Mostrar sucursales con medicamento "Golpex"
    def mostrar_sucursales_con_golpex(self):
        """Muestra sucursales que tienen el medicamento Golpex"""
        self.cargar_farmacias()
        for farmacia in self.farmacias:
            if farmacia.buscar_medicamento("Golpex") is not None:
                print(f"Sucursal: {farmacia.get_sucursal()}, "
                      f"Dirección: {farmacia.get_direccion()}")

    # Métodos adicionales del diagrama
    def mostrar_medicamentos_resfrios(self):
        self.cargar_farmacias()
        for farmacia in self.farmacias:
            farmacia.mostrar_medicamentos("resfriado")
    
    def precio_medicamento_tos(self) -> float:
        self.cargar_farmacias()
        total = 0.0
        for farmacia in self.farmacias:
            for med in farmacia.medicamentos:
                if med.get_tipo().lower() == "tos":
                    total += med.get_precio()
        return total
    
    def mostrar_medicamentos_menor_tos(self):
        self.cargar_farmacias()
        # Implementar lógica para mostrar medicamentos para tos con precio menor al promedio

if __name__ == "__main__":
    # a) Crear, leer y mostrar archivo de farmacias
    archivo = ArchFarmacia("farmacias.pkl")
    
    # Crear algunas farmacias de prueba
    f1 = Farmacia("Farmacia Central", 1, "Av. Principal 123", 3)
    f1.agregar_medicamento(Medicamento("Golpex", 101, "tos", 15.50))
    f1.agregar_medicamento(Medicamento("Jarabe", 102, "tos", 12.00))
    f1.agregar_medicamento(Medicamento("Antigripal", 103, "resfriado", 18.75))
    
    f2 = Farmacia("Farmacia Norte", 2, "Calle Secundaria 456", 2)
    f2.agregar_medicamento(Medicamento("Golpex", 101, "tos", 16.00))
    f2.agregar_medicamento(Medicamento("Antihistamínico", 104, "alergia", 22.50))
    
    archivo.adicionar(f1)
    archivo.adicionar(f2)
    
    print("Listado de farmacias:")
    archivo.listar()
    
    # b) Mostrar medicamentos para la tos de sucursal 1
    print("\nMedicamentos para tos en sucursal 1:")
    archivo.mostrar_medicamentos_tos(1)
    
    # c) Mostrar sucursales con Golpex
    print("\nSucursales con medicamento Golpex:")
    archivo.mostrar_sucursales_con_golpex()
