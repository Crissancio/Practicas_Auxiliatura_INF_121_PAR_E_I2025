class Avion:
    def __init__(self, modelo, fabricante):
        self.__modelo = modelo
        self.__fabricante = fabricante
        self.__partes = []

    #A
    def get_modelo(self):
        return self.__modelo

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def get_fabricante(self):
        return self.__fabricante

    def set_fabricante(self, fabricante):
        self.__fabricante = fabricante

    def get_partes(self):
        return self.__partes

    def set_partes(self, partes):
        self.__partes = partes

    def agregar_parte(self, parte):
        self.__partes.append(parte)

    def mostrar_avión(self):
        print(f"Modelo: {self.__modelo}, Fabricante: {self.__fabricante}")
        print("Partes:")
        for parte in self.__partes:
            parte.mostrar_info()