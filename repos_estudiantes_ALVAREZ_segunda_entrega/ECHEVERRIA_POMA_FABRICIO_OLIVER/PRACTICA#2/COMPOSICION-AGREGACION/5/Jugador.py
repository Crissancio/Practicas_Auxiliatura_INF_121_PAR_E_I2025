class Jugador:
    def __init__(self, nombre, número, posición):
        self.__nombre = nombre
        self.__número = número
        self.__posición = posición

    #A
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_número(self):
        return self.__número

    def set_número(self, número):
        self.__número = número

    def get_posición(self):
        return self.__posición

    def set_posición(self, posición):
        self.__posición = posición

    def mostrar_info(self):
        raise NotImplementedError("Subclase debe implementar mostrar_info()")