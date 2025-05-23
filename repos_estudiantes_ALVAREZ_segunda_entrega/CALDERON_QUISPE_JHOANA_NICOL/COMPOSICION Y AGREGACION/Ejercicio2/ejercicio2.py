class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Peso: {self.peso} kg")

    def getNombre(self):
        return self.nombre

    def getPeso(self):
        return self.peso

    def setNombre(self, nombre):
        self.nombre = nombre

    def setPeso(self, peso):
        self.peso = peso


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, nombre, peso):
        parte = Parte(nombre, peso)
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}, Fabricante: {self.fabricante}")
        print("Información de las Partes:")
        for parte in self.partes:
            parte.mostrar_info()

    def getModelo(self):
        return self.modelo

    def getFabricante(self):
        return self.fabricante

    def setModelo(self, modelo):
        self.modelo = modelo

    def setFabricante(self, fabricante):
        self.fabricante = fabricante



a1 = Avion("Caro", "jhoana")


a1.agregar_parte("izquierda", 500.0)
a1.agregar_parte("Motor derecho", 1500.0)
a1.agregar_parte("Cola", 300.0)


a1.mostrar_avion()
