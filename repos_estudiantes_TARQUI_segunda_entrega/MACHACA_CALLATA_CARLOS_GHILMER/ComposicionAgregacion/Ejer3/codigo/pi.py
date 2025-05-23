class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")

    def __str__(self):
        return f"Parte: [ {self.nombre}, {self.peso} kg ]"


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_info(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes:")
        for parte in self.partes:
            print(parte)



avion = Avion("Boeing 747", "Boeing")
parte1 = Parte("Ala", 2000)
parte2 = Parte("Motor", 5000)
parte3 = Parte("Tren de aterrizaje", 1500)

avion.agregar_parte(parte1)
avion.agregar_parte(parte2)
avion.agregar_parte(parte3)

print("Información del avión:")
avion.mostrar_info()