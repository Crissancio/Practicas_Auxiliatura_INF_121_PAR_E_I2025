class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"  Parte: {self.nombre}, Peso: {self.peso} kg")

    # Getters
    def get_nombre(self):
        return self.nombre

    def get_peso(self):
        return self.peso

    # Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_peso(self, peso):
        self.peso = peso


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}, Fabricante: {self.fabricante}")
        print("Partes:")
        for parte in self.partes:
            parte.mostrar_info()

    # Getters
    def get_modelo(self):
        return self.modelo

    def get_fabricante(self):
        return self.fabricante

    def get_partes(self):
        return self.partes

    # Setters
    def set_modelo(self, modelo):
        self.modelo = modelo

    def set_fabricante(self, fabricante):
        self.fabricante = fabricante


# b) Crear un avión y agregar varias partes
avion1 = Avion("Boeing 747", "Boeing")
avion1.agregar_parte(Parte("Motor Izquierdo", 5000))
avion1.agregar_parte(Parte("Motor Derecho", 5000))
avion1.agregar_parte(Parte("Ala Izquierda", 8000))
avion1.agregar_parte(Parte("Ala Derecha", 8000))
avion1.agregar_parte(Parte("Tren de Aterrizaje Delantero", 1500))
avion1.agregar_parte(Parte("Tren de Aterrizaje Principal", 3000))

# c) Mostrar la información del avión y sus partes
avion1.mostrar_avion()