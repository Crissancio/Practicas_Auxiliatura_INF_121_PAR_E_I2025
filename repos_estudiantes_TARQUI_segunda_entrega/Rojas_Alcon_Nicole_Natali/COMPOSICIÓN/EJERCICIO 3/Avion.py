class Parte:
    def __init__(self, nombre, peso):
        self.__nombre = nombre
        self.__peso = peso
    def get_nombre(self):
        return self.__nombre
    def get_peso(self):
        return self.__peso
    def set_nombre(self, nombre):
        self.__nombre = nombre
    def set_peso(self, peso):
        self.__peso = peso

    def mostrar_info(self):
        print(f"{self.__nombre} - Peso: {self.__peso} kg")
class Avion:
    def __init__(self, modelo, fabricante):
        self.__modelo = modelo
        self.__fabricante = fabricante
        self.__partes = []
        
    def get_modelo(self):
        return self.__modelo

    def get_fabricante(self):
        return self.__fabricante

    def get_partes(self):
        return self.__partes

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def set_fabricante(self, fabricante):
        self.__fabricante = fabricante

    def agregar_parte(self, parte):
        self.__partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo del avión: {self.__modelo}")
        print(f"Fabricante: {self.__fabricante}")
        print("Partes del avión:")
        for parte in self.__partes:
            parte.mostrar_info()

avion = Avion("Boeing 737", "Boeing Company")

parte1 = Parte("Motor", 4500)
parte2 = Parte("Ala izquierda", 3000)
parte3 = Parte("Ala derecha", 3000)
parte4 = Parte("Tren de aterrizaje", 1500)

avion.agregar_parte(parte1)
avion.agregar_parte(parte2)
avion.agregar_parte(parte3)
avion.agregar_parte(parte4)

avion.mostrar_avion()
