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
        print(f"Parte: {self.__nombre}, Peso: {self.__peso} kg")


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
        print(f"Modelo: {self.__modelo}")
        print(f"Fabricante: {self.__fabricante}")
        print("Partes del avión:")
        for parte in self.__partes:
            parte.mostrar_info()



avion1 = Avion("Boeing 747", "Boeing")
motor = Parte("Motor", 4000)
alas = Parte("Alas", 15000)
tren_aterrizaje = Parte("Tren de Aterrizaje", 3000)

avion1.agregar_parte(motor)
avion1.agregar_parte(alas)
avion1.agregar_parte(tren_aterrizaje)

avion1.mostrar_avion()