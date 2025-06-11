class Parte:
    def __init__(self, nombre, peso):
        self.__nombre = nombre
        self.__peso = peso

    #A
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_peso(self):
        return self.__peso

    def set_peso(self, peso):
        self.__peso = peso

    def mostrar_info(self):
        print(f"Nombre: {self.__nombre}, Peso: {self.__peso} kg")