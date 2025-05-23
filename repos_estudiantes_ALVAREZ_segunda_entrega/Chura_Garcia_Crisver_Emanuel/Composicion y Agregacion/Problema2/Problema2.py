# 2. Crea un POO de clases para modelar un avión y sus partes. El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión se destruye, las partes también se destruyen.
# a) Implementa las clases con sus constructores, getters y setters.
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
        print(f"Parte: {self.get_nombre()} peso: {self.get_peso()}")


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

    def get_partes(self):
        return self.partes

    def set_partes(self, partes):
        self.partes = partes

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Avión:\nModelo: {self.get_modelo()} Fabricante: {self.get_fabricante()} \nPartes:")
        for parte in self.partes:
            parte.mostrar_info()

# b) Crea un avión y agrega varias partes.
avion = Avion("Hercules", "Howard Hughes")
avion.agregar_parte(Parte("Motor", 600.56))
avion.agregar_parte(Parte("Alas", 7000.86))
avion.agregar_parte(Parte("Tren de aterrizaje", 550.45))
print("c) Muestra la información del avión y sus partes.")
avion.mostrar_avion()
