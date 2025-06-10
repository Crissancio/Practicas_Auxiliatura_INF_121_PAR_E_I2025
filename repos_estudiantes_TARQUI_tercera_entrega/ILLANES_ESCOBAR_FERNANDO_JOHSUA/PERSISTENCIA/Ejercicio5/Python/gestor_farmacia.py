import pickle
import os
from sucursal import Sucursal

class GestorFarmacia:
    def __init__(self, archivo="farmacias.pkl"):
        self.archivo = archivo

    def guardar_sucursal(self, sucursal: Sucursal):
        lista = self.leer_todas()
        lista.append(sucursal)
        with open(self.archivo, 'wb') as f:
            pickle.dump(lista, f)

    def leer_todas(self):
        if not os.path.exists(self.archivo):
            return []
        with open(self.archivo, 'rb') as f:
            return pickle.load(f)

    def mostrar_medicamentos_tos(self, numero):
        for s in self.leer_todas():
            if s.numero == numero:
                print(f"Medicamentos para la tos - Sucursal {s.numero}")
                for m in s.medicamentos:
                    if m.tipo.lower() == "tos":
                        print(f"- {m.nombre}")

    def mostrar_sucursales_con_golpex(self):
        for s in self.leer_todas():
            for m in s.medicamentos:
                if m.nombre.lower() == "golpex":
                    print(f"Golpex se encuentra en: Sucursal {s.numero} - {s.direccion}")
