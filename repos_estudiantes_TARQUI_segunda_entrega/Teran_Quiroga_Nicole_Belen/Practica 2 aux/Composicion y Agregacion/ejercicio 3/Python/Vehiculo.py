class Vehiculo:
    def __init__(self, marca, modelo, anio):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
    def mostrar(self):
        print("Vehículo:", self.marca, self.modelo, "-", self.anio)
class Conductor:
    def __init__(self, nombre, licencia):
        self.nombre = nombre
        self.licencia = licencia
    def mostrar(self):
        print("Conductor:", self.nombre)
        print("Licencia:", self.licencia)

class Flota:
    def __init__(self):
        self.vehiculos = []
        self.conductores = []
    def agregar(self, vehiculo):
        self.vehiculos.append(vehiculo)
    def conductor(self, conductor):
        self.conductores.append(conductor)
    def mostrar(self):
        print("Flota de Vehículos:")
        for v in self.vehiculos:
            v.mostrar()
        print("Conductores:")
        for c in self.conductores:
            c.mostrar()
f = Flota()
f.agregar(Vehiculo("Toyota", "Hilux", 2020))
f.conductor(Conductor("Luis", "ABC123"))
f.mostrar()
