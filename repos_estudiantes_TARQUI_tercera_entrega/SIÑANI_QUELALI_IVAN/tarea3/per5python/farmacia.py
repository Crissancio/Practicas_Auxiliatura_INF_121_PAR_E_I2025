from medicamento import Medicamento

class Farmacia:
    def __init__(self, nombre_farmacia, sucursal, direccion):
        self.nombre_farmacia = nombre_farmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = [] 

    def __str__(self):
        return f"Farmacia: {self.nombre_farmacia} | Sucursal: {self.sucursal} | Dirección: {self.direccion}"

    def agregar_medicamento(self, medicamento):
        """Añadir un medicamento a la farmacia"""
        self.medicamentos.append(medicamento)

    def mostrar_medicamentos(self):
        """Mostrar todos los medicamentos disponibles"""
        for med in self.medicamentos:
            print(med)

    def busca_medicamento(self, nombre):
        """Buscar un medicamento por nombre"""
        for med in self.medicamentos:
            if med.nombre.lower() == nombre.lower():
                return med
        return None
