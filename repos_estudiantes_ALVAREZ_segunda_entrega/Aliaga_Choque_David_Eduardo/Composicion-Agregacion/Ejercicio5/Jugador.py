# a) Implementación de las clases con sus constructores, getters y setters
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    def get_nombre(self):
        return self._nombre

    def get_numero(self):
        return self._numero

    def get_posicion(self):
        return self._posicion

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Número: {self._numero}, Posición: {self._posicion}")

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

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
            print("-" * 30)

# b) Crear un equipo y agregar varios jugadores de diferentes tipos
equipo1 = Equipo("La Paz Club")

jug1 = Portero("Lampe", 12, "Atajadas")
jug2 = Defensa("Luis", 4, "Marcaje")
jug3 = Mediocampista("Guller", 8, "Pases")
jug4 = Delantero("Bruno", 7, "Goles")

equipo1.agregar_jugador(jug1)
equipo1.agregar_jugador(jug2)
equipo1.agregar_jugador(jug3)
equipo1.agregar_jugador(jug4)

# c) Mostrar la información del equipo y sus jugadores
equipo1.mostrar_equipo()