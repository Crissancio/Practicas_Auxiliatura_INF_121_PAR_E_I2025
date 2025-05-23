class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}, Fabricante: {self.fabricante}")
        for parte in self.partes:
            parte.mostrar_info()


# Ejemplo de uso
avion = Avion("Boeing 737", "Boeing")
avion.agregar_parte(Parte("Motor", 2000))
avion.agregar_parte(Parte("Alas", 3000))
avion.agregar_parte(Parte("Tren de Aterrizaje", 1500))

avion.mostrar_avion()
