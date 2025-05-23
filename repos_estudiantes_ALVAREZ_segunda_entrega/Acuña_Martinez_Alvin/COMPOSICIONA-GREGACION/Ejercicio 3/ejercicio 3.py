# Enunciado:
# 3. Crea un POO de clases para modelar un avión y sus partes.
# El avión está compuesto por partes como motor, alas y tren de aterrizaje.
# Si el avión se destruye, las partes también se destruyen.
# Parte <nombre, peso (en kg)>
# Métodos: mostrar_info() (muestra el nombre y peso de la parte)
# Avión <modelo, fabricante, partes (lista de objetos de tipo Parte)>
# Métodos: agregar_parte(parte), mostrar_avion() (muestra modelo, fabricante e info de partes)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un avión y agrega varias partes.
# c) Muestra la información del avión y sus partes.

class Parte:
    # a) Constructor
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    # a) Método mostrar_info
    def mostrar_info(self):
        print(f"Parte: {self.nombre} | Peso: {self.peso} kg")

class Avion:
    # a) Constructor e inicialización de lista partes
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    # a) Método agregar_parte
    def agregar_parte(self, parte):
        self.partes.append(parte)

    # a) Método mostrar_avion
    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes:")
        for parte in self.partes:
            parte.mostrar_info()

# b) Crear avión y agregar partes
avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(Parte("Motor", 1800.0))
avion.agregar_parte(Parte("Alas", 2500.5))
avion.agregar_parte(Parte("Tren de aterrizaje", 800.3))

# c) Mostrar información del avión y partes
avion.mostrar_avion()