from Medicamento import Medicamento

class Farmacia:
    def __init__(self):
        self.nombreFarmacia = ""
        self.sucursal = 0
        self.direccion = ""
        self.numMedicamentos = 0
        self.medicamentos = []
    
    def leer(self):
        self.nombreFarmacia = input("Nombre de la farmacia: ")
        self.sucursal = int(input("Número de sucursal: "))
        self.direccion = input("Dirección: ")
        self.numMedicamentos = int(input("Número de medicamentos: "))
        
        for _ in range(self.numMedicamentos):
            med = Medicamento()
            med.leer()
            self.medicamentos.append(med)
    
    def mostrar(self):
        print(f"\nFarmacia: {self.nombreFarmacia}")
        print(f"Sucursal: {self.sucursal}")
        print(f"Dirección: {self.direccion}")
        print("\nMedicamentos disponibles:")
        for med in self.medicamentos:
            med.mostrar()
    
    def getDireccion(self):
        return self.direccion
    
    def getSucursal(self):
        return self.sucursal
    
    def mostrarMedicamentos(self, tipo):
        print(f"\nMedicamentos para {tipo}:")
        for med in self.medicamentos:
            if med.getTipo().lower() == tipo.lower():
                med.mostrar()
    
    def buscarMedicamento(self, nombre):
        for med in self.medicamentos:
            if med.nombre.lower() == nombre.lower():
                return med
        return None
    
    def to_dict(self):
        """Convierte el objeto Farmacia a un diccionario"""
        return {
            'nombreFarmacia': self.nombreFarmacia,
            'sucursal': self.sucursal,
            'direccion': self.direccion,
            'numMedicamentos': self.numMedicamentos,
            'medicamentos': [med.to_dict() for med in self.medicamentos]
        }
    
    @classmethod
    def from_dict(cls, data):
        farmacia = cls()
        farmacia.nombreFarmacia = data['nombreFarmacia']
        farmacia.sucursal = data['sucursal']
        farmacia.direccion = data['direccion']
        farmacia.numMedicamentos = data['numMedicamentos']
        farmacia.medicamentos = [Medicamento.from_dict(med) for med in data['medicamentos']]
        return farmacia