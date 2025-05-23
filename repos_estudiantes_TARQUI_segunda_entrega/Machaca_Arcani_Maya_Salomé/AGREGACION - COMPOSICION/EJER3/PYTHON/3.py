class Parte:
    def __init__(self, nombre: str, peso: float):
        self.__nombre = nombre
        self.__peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.__nombre} - Peso: {self.__peso} kg")

    def get_nombre(self):
        return self.__nombre

    def get_peso(self):
        return self.__peso

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_peso(self, peso):
        self.__peso = peso


class Avion:
    def __init__(self, modelo: str, fabricante: str):
        self.__modelo = modelo
        self.__fabricante = fabricante
        self.__partes = []

    def agregar_parte(self, parte: Parte):
        self.__partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.__modelo}")
        print(f"Fabricante: {self.__fabricante}")
        print("Partes:")
        for parte in self.__partes:
            parte.mostrar_info()

    def get_modelo(self):
        return self.__modelo

    def get_fabricante(self):
        return self.__fabricante

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def set_fabricante(self, fabricante):
        self.__fabricante = fabricante


avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(Parte("Motor", 5000.0))
avion.agregar_parte(Parte("Ala Izquierda", 2000.0))
avion.agregar_parte(Parte("Ala Derecha", 2000.0))
avion.agregar_parte(Parte("Tren de Aterrizaje", 1500.0))

avion.mostrar_avion()
