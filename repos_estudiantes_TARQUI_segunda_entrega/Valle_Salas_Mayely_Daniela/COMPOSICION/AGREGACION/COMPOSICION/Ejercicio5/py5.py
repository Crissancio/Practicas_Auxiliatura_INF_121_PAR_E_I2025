class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        return f"Nombre: {self.nombre}, Número: {self.numero}, Posición: {self.posicion}"


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial


class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        info_equipo = f"Equipo: {self.nombre}\nJugadores:\n"
        for jugador in self.jugadores:
            info_equipo += jugador.mostrar_info() + f", Habilidad Especial: {jugador.habilidad_especial}\n"
        return info_equipo.strip()


equipo = Equipo("The Bug's")

jugador1 = Portero("Samuel", 2, "Atajadas")
jugador2 = Defensa("Juan", 4, "Marcaje")
jugador3 = Mediocampista("Andres", 5, "Pases")
jugador4 = Delantero("Raul", 6, "Goles")

equipo.agregar_jugador(jugador1)
equipo.agregar_jugador(jugador2)
equipo.agregar_jugador(jugador3)
equipo.agregar_jugador(jugador4)

print(equipo.mostrar_equipo())
