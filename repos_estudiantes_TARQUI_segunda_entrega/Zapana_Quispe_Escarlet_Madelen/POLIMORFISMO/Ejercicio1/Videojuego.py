from multimethod import multimethod
class Videojuego:
    def __init__(self, nombre="MarioKart", plataforma="Nintendo", cantidadJugadores=4):
        self.__nombre = nombre
        self.__plataforma = plataforma
        self.__cantidadJugadores = cantidadJugadores
    @multimethod
    def agregarJugador(self,uno=1):
        self.__cantidadJugadores += uno
        return self.__cantidadJugadores
    @multimethod
    def agregarJugador(self, otro):
        self.__cantidadJugadores += otro
        return self.__cantidadJugadores

    def mostrar(self):
        print(f"Nombre: {self.__nombre} --- Plataforma: {self.__plataforma} --- Jugadores: {self.__cantidadJugadores}")
V1 = Videojuego()
V1.mostrar()
print(V1.agregarJugador(1))
V2 = Videojuego("Call of Duty", "PC", 2)
V2.mostrar()
print(V2.agregarJugador(5))
