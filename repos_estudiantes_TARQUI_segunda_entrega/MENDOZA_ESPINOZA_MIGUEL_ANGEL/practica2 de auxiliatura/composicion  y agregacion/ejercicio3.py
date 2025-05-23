class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso
    def get_nombre(self):
        return self.nombre
    def get_peso(self):
        return self.peso
    def set_nombre(self, nombre):
        self.nombre = nombre
    def set_peso(self, peso):
        self.peso = peso
    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")
class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
    def get_modelo(self):
        return self.modelo
    def get_fabricante(self):
        return self.fabricante
    def set_modelo(self, modelo):
        self.modelo = modelo
    def set_fabricante(self, fabricante):
        self.fabricante = fabricante
    def agregar_parte(self, parte):
        self.partes.append(parte)
    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes del avión:")
        for parte in self.partes:
            parte.mostrar_info()
motor = Parte("Motor", 1200)
alas = Parte("Alas", 800)
tren = Parte("Tren de aterrizaje", 600)
avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(motor)
avion.agregar_parte(alas)
avion.agregar_parte(tren)
avion.mostrar_avion()
