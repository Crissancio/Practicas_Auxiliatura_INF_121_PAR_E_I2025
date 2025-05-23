class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.__nombre = nombre
        self.__numero = numero
        self.__posicion = posicion
    def get_nombre(self):
        return self.__nombre

    def get_numero(self):
        return self.__numero

    def get_posicion(self):
        return self.__posicion

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_numero(self, numero):
        self.__numero = numero

    def set_posicion(self, posicion):
        self.__posicion = posicion

    def mostrar_info(self):
        print(f"Nombre: {self.__nombre} | Número: {self.__numero} | Posición: {self.__posicion}")
class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero")
        self.__habilidad_especial = "Atajadas"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.__habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa")
        self.__habilidad_especial = "Marcaje"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.__habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista")
        self.__habilidad_especial = "Pases"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.__habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero")
        self.__habilidad_especial = "Goles"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.__habilidad_especial}")
class Equipo:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__jugadores = []

    def agregar_jugador(self, jugador):
        self.__jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f" Nombre del equipo: {self.__nombre}")
        print(" Lista de jugadores:")
        for jugador in self.__jugadores:
            jugador.mostrar_info()
            print("-" * 40)
equipo1 = Equipo("The Strongest")

j1 = Portero("Luis", 1)
j2 = Defensa("Carlos", 4)
j3 = Mediocampista("Pedro", 8)
j4 = Delantero("Juan", 9)

equipo1.agregar_jugador(j1)
equipo1.agregar_jugador(j2)
equipo1.agregar_jugador(j3)
equipo1.agregar_jugador(j4)

equipo1.mostrar_equipo()
