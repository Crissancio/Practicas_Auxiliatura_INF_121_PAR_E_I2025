# a

class Jugador:
    def __init__(self, nombre, numero, posicion, habilidad_especial):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Número: {self._numero}, Posición: {self._posicion}, Habilidad especial: {self._habilidad_especial}")

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_numero(self):
        return self._numero

    def get_posicion(self):
        return self._posicion

    def get_habilidad_especial(self):
        return self._habilidad_especial

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_numero(self, numero):
        self._numero = numero

    def set_posicion(self, posicion):
        self._posicion = posicion

    def set_habilidad_especial(self, habilidad):
        self._habilidad_especial = habilidad


class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero", "Atajadas")


class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa", "Marcaje")


class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista", "Pases")


class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero", "Goles")


class Equipo:
    def __init__(self, nombre):
        self._nombre = nombre
        self._jugadores = []

    def agregar_jugador(self, jugador):
        self._jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self._nombre}")
        print("Jugadores:")
        for jugador in self._jugadores:
            jugador.mostrar_info()

    # Getters y setters
    def get_nombre(self):
        return self._nombre

    def get_jugadores(self):
        return self._jugadores

    def set_nombre(self, nombre):
        self._nombre = nombre


# b
mi_equipo = Equipo("Los Campeones")

mi_equipo.agregar_jugador(Portero("Carlos Pérez", 1))
mi_equipo.agregar_jugador(Defensa("Luis Rodríguez", 4))
mi_equipo.agregar_jugador(Defensa("Ana Torres", 5))
mi_equipo.agregar_jugador(Mediocampista("María Gómez", 8))
mi_equipo.agregar_jugador(Delantero("José Martínez", 9))

# b
mi_equipo.mostrar_equipo()
