

class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        return f"Parte: {self.nombre}, Peso: {self.peso} kg"

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f" Modelo: {self.modelo}")
        print(f" Fabricante: {self.fabricante}")
        print(" Partes:")
        for parte in self.partes:
            print("  ", parte.mostrar_info())


print("Noemí Chino Blanco")

avion = Avion("Amazonas A256", "pando")
avion.agregar_parte(Parte("Motor", 1300))
avion.agregar_parte(Parte("Alas", 700))
avion.agregar_parte(Parte("Tren de aterrizaje", 400))

avion.mostrar_avion()
