import pickle
import os
from typing import Dict, List, Optional

class Farmacia:
    def __init__(self, numero: int, direccion: str, medicamentos: List[str]):
        self.numero = numero
        self.direccion = direccion
        self.medicamentos = medicamentos
    
    def get_numero(self) -> int:
        return self.numero
    
    def get_direccion(self) -> str:
        return self.direccion
    
    def get_medicamentos(self) -> List[str]:
        return self.medicamentos
    
    def agregar_medicamento(self, medicamento: str) -> None:
        self.medicamentos.append(medicamento)
    
    def tiene_medicamento(self, nombre_medicamento: str) -> bool:
        return nombre_medicamento in self.medicamentos

class PersistenciaFarmacias:
    ARCHIVO = "farmacias.dat"
    
    @classmethod
    def guardar_farmacia(cls, farmacia: Farmacia) -> None:
        farmacias = cls._cargar_farmacias()
        farmacias.append(farmacia)
        cls._guardar_lista_farmacias(farmacias)
    
    @classmethod
    def leer_farmacias(cls) -> List[Farmacia]:
        return cls._cargar_farmacias()
    
    @classmethod
    def mostrar_farmacias(cls) -> None:
        farmacias = cls.leer_farmacias()
        print("\n--- Listado de Farmacias ---")
        for farmacia in farmacias:
            print(f"\nSucursal #{farmacia.get_numero()}")
            print(f"Dirección: {farmacia.get_direccion()}")
            print("Medicamentos disponibles:", ", ".join(farmacia.get_medicamentos()))
    
    @classmethod
    def mostrar_medicamentos_tos(cls, numero_sucursal: int) -> None:
        farmacias = cls.leer_farmacias()
        encontrada = False
        
        for farmacia in farmacias:
            if farmacia.get_numero() == numero_sucursal:
                encontrada = True
                print(f"\nMedicamentos para la tos en Sucursal #{numero_sucursal}:")
                tos_meds = [med for med in farmacia.get_medicamentos() if "tos" in med.lower()]
                if tos_meds:
                    print(", ".join(tos_meds))
                else:
                    print("No hay medicamentos para la tos en esta sucursal")
                break
        
        if not encontrada:
            print(f"\nNo se encontró la sucursal #{numero_sucursal}")
    
    @classmethod
    def buscar_sucursal_por_medicamento(cls, nombre_medicamento: str) -> None:
        farmacias = cls.leer_farmacias()
        encontradas = []
        
        for farmacia in farmacias:
            if farmacia.tiene_medicamento(nombre_medicamento):
                encontradas.append(farmacia)
        
        print(f"\nSucursales con el medicamento '{nombre_medicamento}':")
        if encontradas:
            for farmacia in encontradas:
                print(f"Sucursal #{farmacia.get_numero()} - {farmacia.get_direccion()}")
        else:
            print("No se encontró el medicamento en ninguna sucursal")
    
    @classmethod
    def _cargar_farmacias(cls) -> List[Farmacia]:
        if not os.path.exists(cls.ARCHIVO):
            return []
        
        try:
            with open(cls.ARCHIVO, 'rb') as f:
                return pickle.load(f)
        except (IOError, pickle.PickleError) as e:
            print(f"Error al cargar farmacias: {e}")
            return []
    
    @classmethod
    def _guardar_lista_farmacias(cls, farmacias: List[Farmacia]) -> None:
        try:
            with open(cls.ARCHIVO, 'wb') as f:
                pickle.dump(farmacias, f)
        except (IOError, pickle.PickleError) as e:
            print(f"Error al guardar farmacias: {e}")

def main():
    # Crear algunas farmacias de ejemplo
    farmacia1 = Farmacia(1, "Av. Principal 123", ["Paracetamol", "Jarabe para la tos", "Ibuprofeno"])
    farmacia2 = Farmacia(2, "Calle Secundaria 456", ["Amoxicilina", "Golpex", "Aspirina"])
    farmacia3 = Farmacia(3, "Plaza Central 789", ["Golpex", "Jarabe para la tos", "Omeprazol"])
    
    # Guardar las farmacias
    PersistenciaFarmacias.guardar_farmacia(farmacia1)
    PersistenciaFarmacias.guardar_farmacia(farmacia2)
    PersistenciaFarmacias.guardar_farmacia(farmacia3)
    
    # Mostrar todas las farmacias
    PersistenciaFarmacias.mostrar_farmacias()
    
    # Mostrar medicamentos para la tos en sucursal específica
    PersistenciaFarmacias.mostrar_medicamentos_tos(1)
    PersistenciaFarmacias.mostrar_medicamentos_tos(3)
    
    # Buscar sucursales que tienen Golpex
    PersistenciaFarmacias.buscar_sucursal_por_medicamento("Golpex")
    
    # Buscar medicamento que no existe
    PersistenciaFarmacias.buscar_sucursal_por_medicamento("Medicamento Inexistente")

if __name__ == "__main__":
    main()