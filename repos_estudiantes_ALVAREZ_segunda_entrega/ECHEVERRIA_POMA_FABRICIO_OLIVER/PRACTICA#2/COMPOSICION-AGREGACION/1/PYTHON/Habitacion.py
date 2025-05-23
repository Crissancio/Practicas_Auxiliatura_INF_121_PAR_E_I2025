class Habitacion:
    def __init__(self, nombre, tamaño):
        self.__nombre = nombre
        self.__tamaño = tamaño

    #A
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_tamaño(self):
        return self.__tamaño

    def set_tamaño(self, tamaño):
        self.__tamaño = tamaño

    def mostrar_info(self):
        print(f"Nombre: {self.__nombre}, Tamaño: {self.__tamaño} m²")