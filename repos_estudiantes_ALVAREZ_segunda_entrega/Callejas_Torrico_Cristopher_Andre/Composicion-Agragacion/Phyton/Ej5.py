class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        return f"{self.nombre} - Número: {self.numero} - Posición: {self.posicion}"

class Defensa(Jugador):
    def __init__(self, nombre, numero, posicion):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = "Quites"

class Delantero(Jugador):
    def __init__(self, nombre, numero, posicion):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = "Goleador"

class Portero(Jugador):
    def __init__(self, nombre, numero, posicion):
        super().__init__(nombre, numero, posicion)
        self.habilidad_especial = "Atajadas"

class Equipo:
    def __init__(self, nombre):
        self.nombredelequipo = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"------------ {self.nombredelequipo} ---------------")
        for jugador in self.jugadores:
            print(jugador.mostrar_info())
equipo = Equipo("Equipo Universitario")
equipo.agregar_jugador(Portero("Juan Lopez", 1, "Portero"))
equipo.agregar_jugador(Defensa("Bryan Castro", 4, "Defensa"))
equipo.agregar_jugador(Delantero("Fernando Diaz", 10, "Delantero"))

equipo.mostrar_equipo()
