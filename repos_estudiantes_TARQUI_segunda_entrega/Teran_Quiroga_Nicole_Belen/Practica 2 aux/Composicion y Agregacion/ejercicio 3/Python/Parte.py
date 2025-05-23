class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso
    def mostrar(self):
        print("Parte:", self.nombre)
        print("Peso:", self.peso, "kg")
class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
    def agrega(self, parte):
        self.partes.append(parte)
    def mostrar(self):
        print("Avion:", self.modelo, "-", self.fabricante)
        for p in self.partes:
            p.mostrar()
a = Avion("Airbus A320", "Airbus")
a.agrega(Parte("Turbina", 2200))
a.agrega(Parte("Tren de aterrizaje", 1300))
a.mostrar()
