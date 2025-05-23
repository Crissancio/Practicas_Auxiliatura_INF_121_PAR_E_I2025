class Equipo:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__jugadores = []

    #A
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_jugadores(self):
        return self.__jugadores

    def set_jugadores(self, jugadores):
        self.__jugadores = jugadores

    def agregar_jugador(self, jugador):
        self.__jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self.__nombre}")
        print("Jugadores:")
        for jugador in self.__jugadores:
            jugador.mostrar_info()