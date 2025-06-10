# 3. Crea un POO de clases para modelar un avión y sus partes.
# El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje.
# Si el avión se destruye, las partes también se destruyen.
#
# Parte<nombre, peso (en kg)>
# Métodos: mostrar_info() (muestra el nombre y el peso de la parte)
#
# Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)>
# Métodos: agregar_parte(parte), mostrar_avión() (muestra el modelo, fabricante y la información de todas las partes)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un avión y agrega varias partes.
# c) Muestra la información del avión y sus partes.

# DIAGRAMA DE CLASES ERRONEO
class Parte:
    def __init__(self, nombre, peso):
        self.__nombre = nombre
        self.__peso = peso

    def mostrar_info(self):
        return f"Parte: {self.__nombre}, Peso: {self.__peso} kg"

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_peso(self):
        return self.__peso

    def set_peso(self, peso):
        self.__peso = peso


class Avion:
    def __init__(self, modelo, fabricante):
        self.__modelo = modelo
        self.__fabricante = fabricante
        self.__partes = []
        self.__crear_partes()

    def __crear_partes(self):
        self.__partes.append(Parte("Motor", 1500))
        self.__partes.append(Parte("Alas", 1200))
        self.__partes.append(Parte("Tren de aterrizaje", 800))

    def get_modelo(self):
        return self.__modelo

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def get_fabricante(self):
        return self.__fabricante

    def set_fabricante(self, fabricante):
        self.__fabricante = fabricante

    def mostrar_avion(self):
        print(f"Modelo: {self.__modelo}, Fabricante: {self.__fabricante}")
        for parte in self.__partes:
            print(parte.mostrar_info())

avion = Avion("Boeing 737", "Boeing")
avion.mostrar_avion()
