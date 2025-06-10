from Farmacia import Farmacia
from Medicamento import Medicamento
import os

class ArchFarmacia:
    def __init__(self, na):
        self.na = na
        if not os.path.exists(na):
            with open(na, "w"): pass

    def crearArchivo(self):
        with open(self.na, "w"): pass

    def adicionar(self, farmacia):
        with open(self.na, "a") as f:
            linea = farmacia.leer() + "|"
            for m in farmacia.medicamentos:
                linea += m.leer() + ";"
            f.write(linea.strip(";") + "\n")

    def listar(self):
        farmacias = []
        with open(self.na, "r") as f:
            for linea in f:
                datos = linea.strip().split("|")
                infoFarmacia = datos[0].split(",")
                farmacia = Farmacia(infoFarmacia[0], int(infoFarmacia[1]), infoFarmacia[2])
                if len(datos) > 1:
                    meds = datos[1].split(";")
                    for m in meds:
                        nombre, cod, tipo, precio = m.split(",")
                        farmacia.agregarMedicamento(Medicamento(nombre, int(cod), tipo, float(precio)))
                farmacias.append(farmacia)
        return farmacias

    def mostrarMedicamentosResfrios(self):
        for f in self.listar():
            print(f"\nSucursal {f.getSucursal()}:")
            f.mostrarMedicamentos("resfrio")

    def precioMedicamentosMenorTo5(self):
        for f in self.listar():
            print(f"\nSucursal {f.getSucursal()}:")
            for m in f.medicamentos:
                if m.getPrecio() < 5:
                    m.mostrar()

    def mostrarMedicamentosTos(self, x):
        for f in self.listar():
            if f.getSucursal() == x:
                print(f"Medicamentos para la tos - Sucursal {x}:")
                f.mostrarMedicamentos("tos")

    def mostrarFarmaciasCon(self, nombreMed):
        for f in self.listar():
            if f.buscaMedicamento(nombreMed):
                print(f"-> Sucursal: {f.getSucursal()}, Dirección: {f.getDireccion()}")