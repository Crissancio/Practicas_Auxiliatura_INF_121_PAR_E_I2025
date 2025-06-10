# 4. Sea el siguiente diagrama de clases:
# a) Crear, leer y mostrar un Archivo de Farmacias
# b) Mostrar los medicamentos para la tos, de la Sucursal numero X
# c) Mostrar el número de sucursal y su dirección que tienen el medicamento “Golpex"
import json

class Farmacia:
    def __init__(self, numero, direccion, medicamentos):
        self.numero = numero
        self.direccion = direccion
        self.medicamentos = medicamentos

    def to_dict(self):
        return {
            "numero": self.numero,
            "direccion": self.direccion,
            "medicamentos": self.medicamentos
        }


def guardarFarmacia(f):
    with open("farmacias.json", "a") as file:
        file.write(json.dumps(f.to_dict()) + "\n")


def mostrarMedicamentosTos(sucursal):
    with open("farmacias.json", "r") as f:
        for line in f:
            suc = json.loads(line)
            if suc["numero"] == sucursal:
                for med in suc["medicamentos"]:
                    if "tos" in med.lower():
                        print("Medicamento para la tos:", med)


def buscarGolpex():
    with open("farmacias.json", "r") as f:
        for line in f:
            suc = json.loads(line)
            if "Golpex" in suc["medicamentos"]:
                print(f"Golpex en sucursal {suc['numero']}, dirección: {suc['direccion']}")

guardarFarmacia(Farmacia(1, "Av. Juan Pablo 2", ["Paracetamol", "Golpex", "Jarabe para la tos"]))
mostrarMedicamentosTos(1)
buscarGolpex()
