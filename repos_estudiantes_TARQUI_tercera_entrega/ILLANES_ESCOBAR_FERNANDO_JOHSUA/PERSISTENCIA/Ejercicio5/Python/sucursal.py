from medicamento import Medicamento

class Sucursal:
    def __init__(self, numero: int, direccion: str):
        self.numero = numero
        self.direccion = direccion
        self.medicamentos: list[Medicamento] = []

    def agregar_medicamento(self, medicamento: Medicamento):
        self.medicamentos.append(medicamento)

    def __str__(self):
        return f"Sucursal {self.numero} - {self.direccion}"
