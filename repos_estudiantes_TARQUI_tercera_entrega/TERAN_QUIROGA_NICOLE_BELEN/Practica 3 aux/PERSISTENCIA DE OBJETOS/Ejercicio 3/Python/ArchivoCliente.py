import os

from Cliente import Cliente

class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA
        if not os.path.exists(nomA):
            with open(nomA, "w"): pass

    def guardarCliente(self, cliente):
        with open(self.nomA, "a") as f:
            f.write(f"{cliente.id},{cliente.nombre},{cliente.telefono}\n")

    def buscarCliente(self, id):
        with open(self.nomA, "r") as f:
            for linea in f:
                datos = linea.strip().split(",")
                if int(datos[0]) == id:
                    return Cliente(int(datos[0]), datos[1], int(datos[2]))
        return None

    def buscarCelularCliente(self, telefono):
        with open(self.nomA, "r") as f:
            for linea in f:
                datos = linea.strip().split(",")
                if int(datos[2]) == telefono:
                    return Cliente(int(datos[0]), datos[1], telefono)
        return None