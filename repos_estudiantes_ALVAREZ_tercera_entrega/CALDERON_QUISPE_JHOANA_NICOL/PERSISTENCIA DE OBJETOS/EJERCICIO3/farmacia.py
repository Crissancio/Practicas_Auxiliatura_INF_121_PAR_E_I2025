import os
import json
from medicamento import Medicamento

rutaBase = "C:/Users/SAMSUNG/Desktop/PERSISTENCIA DE OBJETOS/EJERCICIO3/medicamentos"

class Farmacia:
    def __init__(self, nombreFarmacia=None, sucursal=None, direccion=None, nroMedicamentos=0):
        self.nombreFarmacia = nombreFarmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.nroMedicamentos = nroMedicamentos
        self.medicamentos = []
        self.archivo = f"{rutaBase}/farmacia{self.sucursal}.json"

    def agregarMedicamento(self, medicamento):
        self.medicamentos.append(medicamento)
        self.nroMedicamentos += 1

    def guardar(self):
        os.makedirs(rutaBase, exist_ok=True)
        datos = {
            "nombreFarmacia": self.nombreFarmacia,
            "sucursal": self.sucursal,
            "direccion": self.direccion,
            "nroMedicamentos": self.nroMedicamentos,
            "medicamentos": [{
                "id": m.id,
                "nombre": m.nombre,
                "tipo": m.tipo,
                "precio": m.precio,
                "stock": m.stock
            } for m in self.medicamentos]
        }
        with open(self.archivo, 'w') as f:
            json.dump(datos, f, indent=4)


    def leer(self, archivo):
        self.archivo = archivo
        if os.path.exists(archivo):
            with open(archivo, 'r') as f:
                datos = json.load(f)
                self.nombreFarmacia = datos["nombreFarmacia"]
                self.sucursal = datos["sucursal"]
                self.direccion = datos["direccion"]
                self.nroMedicamentos = datos["nroMedicamentos"]
                self.medicamentos = [Medicamento(**med_data) for med_data in datos["medicamentos"]]

    def getDireccion(self):
        return self.direccion

    def getSucursal(self):
        return self.sucursal

    def mostrar(self):
        print(f"{self.nombreFarmacia} - Sucursal {self.sucursal} - {self.direccion}")
        for med in self.medicamentos:
            print(med)
