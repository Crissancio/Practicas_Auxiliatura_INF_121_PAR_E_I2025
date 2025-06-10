class Medicamento:
    def __init__(self, nombre, cod, tipo, precio):
        self.nombre = nombre
        self.codMedicamento = cod
        self.tipo = tipo
        self.precio = precio
    def getTipo(self):
        return self.tipo
    def getPrecio(self):
        return self.precio
    def mostrar(self):
        print(f"Nombre: {self.nombre}, Tipo: {self.tipo}, Precio: {self.precio}")
        
class Farmacia:
    def __init__(self, nombre, sucursal, direccion):
        self.nombreFarmacia = nombre
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = []
    def agregarMedicamento(self, med):
        self.medicamentos.append(med)
    def mostrar(self):
        print(f"Farmacia: {self.nombreFarmacia}, Sucursal: {self.sucursal}, Dirección: {self.direccion}")
        for m in self.medicamentos:
            m.mostrar()
    def getSucursal(self):
        return self.sucursal
    def getDireccion(self):
        return self.direccion
    def mostrarMedicamentos(self, tipo):
        for m in self.medicamentos:
            if m.getTipo().lower() == tipo.lower():
                m.mostrar()
    def buscaMedicamento(self, nombre):
        return any(m.nombre.lower() == nombre.lower() for m in self.medicamentos)
    
class ArchFarmacia:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo
        self.farmacias = []
    def adicionar(self, f):
        self.farmacias.append(f)
    def listar(self):
        for f in self.farmacias:
            f.mostrar()
    def mostrarMedicamentosTos(self, sucursal):
        for f in self.farmacias:
            if f.getSucursal() == sucursal:
                f.mostrarMedicamentos("tos")
    def mostrarSucursalesConGolpex(self):
        for f in self.farmacias:
            if f.buscaMedicamento("Mentisan"):
                print(f"Sucursal: {f.getSucursal()}, Dirección: {f.getDireccion()}")    
from EjePersistenciaObj5 import Medicamento
from EjePersistenciaObj5 import Farmacia
from EjePersistenciaObj5 import ArchFarmacia

archivo = ArchFarmacia("farmacias.txt")

f1 = Farmacia("Farmacia A", 1, "Av. Kantutani")
f1.agregarMedicamento(Medicamento("Golpex", 1, "tos", 20.5))
f1.agregarMedicamento(Medicamento("Paracetamol", 2, "fiebre", 10.0))

f2 = Farmacia("Farmacia B", 202, "Calle 7 enanos")
f2.agregarMedicamento(Medicamento("Antitusivo", 3, "tos", 15.0))

archivo.adicionar(f1)
archivo.adicionar(f2)

print("Listado de Farmacias:")
archivo.listar()

print("\nMedicamentos para la tos en sucursal 1:")
archivo.mostrarMedicamentosTos(101)

print("\nFarmacias con Mentisan en las farmacias:")
archivo.mostrarSucursalesConGolpex()
