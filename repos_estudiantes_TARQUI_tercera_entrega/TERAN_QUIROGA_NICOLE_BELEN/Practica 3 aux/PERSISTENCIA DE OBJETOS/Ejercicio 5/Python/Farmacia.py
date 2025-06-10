from Medicamento import Medicamento

class Farmacia:
    def __init__(self, nombreFarmacia, sucursal, direccion):
        self.nombreFarmacia = nombreFarmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = []

    def agregarMedicamento(self, medicamento):
        self.medicamentos.append(medicamento)

    def leer(self):
        return f"{self.nombreFarmacia},{self.sucursal},{self.direccion}"

    def mostrar(self):
        print(f"{self.nombreFarmacia} (Sucursal {self.sucursal}) - Dirección: {self.direccion}")
        for m in self.medicamentos:
            m.mostrar()

    def getDireccion(self):
        return self.direccion

    def getSucursal(self):
        return self.sucursal

    def mostrarMedicamentos(self, tipo):
        for m in self.medicamentos:
            if m.getTipo().lower() == tipo.lower():
                m.mostrar()

    def buscaMedicamento(self, nombre):
        for m in self.medicamentos:
            if m.getNombre().lower() == nombre.lower():
                return True
        return False