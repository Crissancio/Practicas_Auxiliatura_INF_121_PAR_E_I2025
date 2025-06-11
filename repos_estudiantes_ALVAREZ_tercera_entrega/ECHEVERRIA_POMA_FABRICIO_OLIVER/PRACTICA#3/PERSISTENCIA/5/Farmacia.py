from Medicamento import Medicamento

class Farmacia:
    def __init__(self, nombreFarmacia="", sucursal=0, direccion="", nroMedicamentos=0):
        self.nombreFarmacia = nombreFarmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.nroMedicamentos = nroMedicamentos
        self.Medicamento = []
    
    def getDireccion(self):
        return self.direccion
    
    def getSucursal(self):
        return self.sucursal
    
    def agregarMedicamento(self, medicamento):
        self.Medicamento.append(medicamento)
        self.nroMedicamentos = len(self.Medicamento)
    
    def eliminarMedicamento(self, codigo):
        self.Medicamento = [med for med in self.Medicamento if med.codMedicamento != codigo]
        self.nroMedicamentos = len(self.Medicamento)
    
    def buscarMedicamento(self, nombre):
        for med in self.Medicamento:
            if med.nombre.lower() == nombre.lower():
                return med
        return None
    
    def __str__(self):
        return f"{self.nombreFarmacia} - Sucursal {self.sucursal} - {self.direccion}"