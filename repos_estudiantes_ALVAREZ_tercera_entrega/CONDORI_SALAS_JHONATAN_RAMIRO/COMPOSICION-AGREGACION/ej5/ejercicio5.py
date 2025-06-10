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
        print(f"Jugador: {self.__nombre} | Número: {self.__numero} | Posición: {self.__posicion}")


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.__habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.__habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.__habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.__habilidad_especial}")


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.__habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.__habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.__habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.__habilidad_especial}")


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.__habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.__habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.__habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.__habilidad_especial}")


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.__habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.__habilidad_especial

    def set_habilidad_especial(self, habilidad):
        self.__habilidad_especial = habilidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.__habilidad_especial}")


class Equipo:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__jugadores = []

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def agregar_jugador(self, jugador):
        self.__jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"\nEquipo: {self.__nombre}")
        print("Jugadores:")
        for jugador in self.__jugadores:
            jugador.mostrar_info()

equipo1 = Equipo("Los Titanes")
equipo1.agregar_jugador(Portero("Carlos Pérez", 1, "Atajadas rápidas"))
equipo1.agregar_jugador(Defensa("Luis Ramírez", 4, "Marcaje estricto"))
equipo1.agregar_jugador(Mediocampista("Juan Torres", 8, "Pases precisos"))
equipo1.agregar_jugador(Delantero("Pedro Gómez", 9, "Goleador implacable"))
equipo1.mostrar_equipo()
