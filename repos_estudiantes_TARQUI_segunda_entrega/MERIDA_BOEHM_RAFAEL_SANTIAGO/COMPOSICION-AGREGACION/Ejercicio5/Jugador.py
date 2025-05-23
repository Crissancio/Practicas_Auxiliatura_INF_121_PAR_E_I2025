# Clase base Jugador
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        return f"{self.nombre} | Número: {self.numero} | Posición: {self.posicion}"

# Clases derivadas de Jugador
class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = "Atajadas"

class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = "Marcaje"

class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = "Pases"

class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = "Goles"

# Clase Equipo con composición (Si el equipo desaparece, también los jugadores)
class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        print("Jugadores:")
        for jugador in self.jugadores:
            print(f"  - {jugador.mostrar_info()} (Habilidad: {jugador.habilidad_especial})")

#Creación del equipo y jugadores
equipo = Equipo("Copacabana FC")
equipo.agregar_jugador(Portero("Juan Pérez", 1))
equipo.agregar_jugador(Defensa("Carlos Gómez", 4))
equipo.agregar_jugador(Mediocampista("Luis Fernández", 8))
equipo.agregar_jugador(Delantero("Diego Rodríguez", 9))

# Mostrar la información del equipo y sus jugadores
equipo.mostrar_equipo()
