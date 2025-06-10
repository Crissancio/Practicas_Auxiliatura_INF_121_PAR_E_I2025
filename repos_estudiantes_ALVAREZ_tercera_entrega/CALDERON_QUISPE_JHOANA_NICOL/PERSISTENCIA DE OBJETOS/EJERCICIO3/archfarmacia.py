import os
import json
from farmacia import Farmacia

rutaBase = "C:/Users/SAMSUNG/Desktop/PERSISTENCIA DE OBJETOS/EJERCICIO3/medicamentos"

class ArchFarmacia:
    def __init__(self, nombreArchivo):
        self.nombreArchivo = f"{rutaBase}/{nombreArchivo}.json"
        self.listaFarmacias = []

    def crearArchivo(self):
        os.makedirs(rutaBase, exist_ok=True)
        if not os.path.exists(self.nombreArchivo):
            with open(self.nombreArchivo, 'w') as f:
                json.dump([], f)

    def adicionar(self, farmacia):
        self.listaFarmacias.append(farmacia)
        farmacia.guardar()
        self._guardarArchivo()

    def _guardarArchivo(self):
        with open(self.nombreArchivo, 'w') as f:
            json.dump([f.archivo for f in self.listaFarmacias], f, indent=4)

    def listar(self):
        self.listaFarmacias.clear()
        if os.path.exists(self.nombreArchivo):
            with open(self.nombreArchivo, 'r') as f:
                rutas = json.load(f)
                for ruta in rutas:
                    farm = Farmacia()
                    farm.leer(ruta)
                    self.listaFarmacias.append(farm)

    def mostrarMedicamentosTos(self, sucursalX):
        self.listar()
        encontrada = False
        for farm in self.listaFarmacias:
            if farm.getSucursal() == sucursalX:
                print(f"\nMedicamentos para la tos en la sucursal {sucursalX}:")
                for med in farm.medicamentos:
                    if med.getTipo().lower() == "tos":
                        print(med)
                        encontrada = True
        if not encontrada:
            print(f"No se encontraron medicamentos para la tos en la sucursal {sucursalX}.")

    def buscarFarmaciasConMedicamento(self, nombreMed):
        self.listar()
        encontrada = False
        for farm in self.listaFarmacias:
            for med in farm.medicamentos:
                if med.nombre.lower() == nombreMed.lower():
                    print(f"Sucursal: {farm.getSucursal()}, Dirección: {farm.getDireccion()}")
                    encontrada = True
        if not encontrada:
            print(f"No se encontró el medicamento '{nombreMed}' en ninguna sucursal.")
