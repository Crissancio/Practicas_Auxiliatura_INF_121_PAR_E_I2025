from Vehiculo import Vehiculo
class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio, nPuertas, tConbustible):
        super().__init__(marca, modelo, año, precio)
        self.nPuertas = nPuertas
        self.tConbustible = tConbustible
    def mostrar(self):
        return super().mostrar(), "Puertas: ", self.nPuertas, "Combustible: ", self.tConbustible