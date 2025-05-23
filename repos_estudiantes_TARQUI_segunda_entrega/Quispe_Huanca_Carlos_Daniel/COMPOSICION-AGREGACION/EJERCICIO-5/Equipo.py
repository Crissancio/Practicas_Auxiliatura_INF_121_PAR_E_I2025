class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def numero(self):
        return self._numero

    @numero.setter
    def numero(self, numero):
        self._numero = numero

    @property
    def posicion(self):
        return self._posicion

    @posicion.setter
    def posicion(self, posicion):
        self._posicion = posicion

    def mostrar_info(self):
        return f"Nombre: {self._nombre}, Número: {self._numero}, Posición: {self._posicion}"


class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero")
        self._habilidad_especial = "Atajadas"

    @property
    def habilidad_especial(self):
        return self._habilidad_especial

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Habilidad especial: {self._habilidad_especial}"


class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa")
        self._habilidad_especial = "Marcaje"

    @property
    def habilidad_especial(self):
        return self._habilidad_especial

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Habilidad especial: {self._habilidad_especial}"


class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista")
        self._habilidad_especial = "Pases"

    @property
    def habilidad_especial(self):
        return self._habilidad_especial

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Habilidad especial: {self._habilidad_especial}"


class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero")
        self._habilidad_especial = "Goles"

    @property
    def habilidad_especial(self):
        return self._habilidad_especial

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Habilidad especial: {self._habilidad_especial}"


class Equipo:
    def __init__(self, nombre):
        self._nombre = nombre
        self._jugadores = []

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    def agregar_jugador(self, jugador):
        if isinstance(jugador, Jugador):
            self._jugadores.append(jugador)
        else:
            raise TypeError("Solo se pueden agregar objetos de tipo Jugador")

    def mostrar_equipo(self):
        info_equipo = f"Equipo: {self._nombre}\nJugadores:\n"
        for jugador in self._jugadores:
            info_equipo += f"- {jugador.mostrar_info()}\n"
        return info_equipo


if __name__ == "__main__":

    equipo = Equipo("Barcelona FC")

    portero = Portero("Wojciech Szczesny", 25)
    defensa1 = Defensa("Pau Cubarsí", 2)
    defensa2 = Defensa("Alejandro Balde", 3)
    mediocampista1 = Mediocampista("Dani Olmo", 20)
    mediocampista2 = Mediocampista("Pedri", 8)
    delantero1 = Delantero("Robert Lewandowski", 9)
    delantero2 = Delantero("Lamine Yamal", 19)

    equipo.agregar_jugador(portero)
    equipo.agregar_jugador(defensa1)
    equipo.agregar_jugador(defensa2)
    equipo.agregar_jugador(mediocampista1)
    equipo.agregar_jugador(mediocampista2)
    equipo.agregar_jugador(delantero1)
    equipo.agregar_jugador(delantero2)

    print(equipo.mostrar_equipo())