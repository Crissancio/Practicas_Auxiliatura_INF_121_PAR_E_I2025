# a) Implementa las clases con sus constructores, getters y setters
class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_peso(self):
        return self.peso

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

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_fabricante(self):
        return self.fabricante

    def set_fabricante(self, fabricante):
        self.fabricante = fabricante

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo del avión: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes del avión:")
        for parte in self.partes:
            parte.mostrar_info()

# b) Crea un avión y agrega varias partes

avion = Avion("Boeing 737", "Boeing")

parte1 = Parte("Motor", 2000)
parte2 = Parte("Alas", 1500)
parte3 = Parte("Tren de aterrizaje", 800)
parte4 = Parte("Cabina", 1200)

avion.agregar_parte(parte1)
avion.agregar_parte(parte2)
avion.agregar_parte(parte3)
avion.agregar_parte(parte4)

# c) Muestra la información del avión y sus partes

avion.mostrar_avion()