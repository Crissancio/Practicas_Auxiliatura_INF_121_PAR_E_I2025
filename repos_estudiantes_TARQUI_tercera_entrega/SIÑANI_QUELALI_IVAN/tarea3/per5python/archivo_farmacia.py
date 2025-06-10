import pickle
from farmacia import Farmacia

class ArchivoFarmacia:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        """Crea el archivo si no existe"""
        try:
            with open(self.nombre_archivo, "wb") as archivo:
                pickle.dump([], archivo)
        except Exception as e:
            print("Error al crear archivo:", e)

    def guardar_farmacia(self, farmacia):
        """Guarda una farmacia en el archivo"""
        farmacias = self.leer_farmacias()
        farmacias.append(farmacia)
        with open(self.nombre_archivo, "wb") as archivo:
            pickle.dump(farmacias, archivo)

    def leer_farmacias(self):
        """Lee todas las farmacias guardadas en el archivo"""
        try:
            with open(self.nombre_archivo, "rb") as archivo:
                return pickle.load(archivo)
        except (FileNotFoundError, EOFError):
            return []

    def mostrar_medicamentos_tos(self, sucursal):
        """Mostrar los medicamentos para la tos de una sucursal específica"""
        farmacias = self.leer_farmacias()
        for farmacia in farmacias:
            if farmacia.sucursal == sucursal:
                print(f"Medicamentos para la tos en sucursal {sucursal}:")
                for med in farmacia.medicamentos:
                    if med.get_tipo().lower() == "tos":
                        print(med)

    def buscar_farmacia_medicamento(self, nombre_medicamento):
        """Mostrar sucursal y dirección de farmacias que tienen un medicamento específico"""
        farmacias = self.leer_farmacias()
        for farmacia in farmacias:
            if farmacia.busca_medicamento(nombre_medicamento):
                print(f"Sucursal: {farmacia.sucursal} | Dirección: {farmacia.direccion}")
