# Enunciado:
# 5. Desarrolla un POO para un equipo de fútbol y sus jugadores.
# El equipo está compuesto por jugadores, y si el equipo se destruye,
# los jugadores también se destruyen.
# Además, los jugadores pueden ser de diferentes tipos (portero, defensa, mediocampista, delantero).
# Clase Padre: Jugador <nombre, número, posición>
# Métodos: mostrar_info() (muestra nombre, número y posición)
# Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de Jugador)
# Atributos adicionales: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases", "Goles")
# Clase: Equipo <nombre, jugadores (lista de objetos Jugador)>
# Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra nombre del equipo y la info de todos los jugadores)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un equipo y agrega varios jugadores de diferentes tipos.
# c) Muestra la información del equipo y sus jugadores.

class Jugador:
    def __init__(self, nombre, numero, posicion, habilidad_especial):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"{self.posicion}: {self.nombre} | Nº {self.numero} | Habilidad: {self.habilidad_especial}")

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial="Atajadas"):
        super().__init__(nombre, numero, "Portero", habilidad_especial)

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial="Marcaje"):
        super().__init__(nombre, numero, "Defensa", habilidad_especial)

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial="Pases"):
        super().__init__(nombre, numero, "Mediocampista", habilidad_especial)

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial="Goles"):
        super().__init__(nombre, numero, "Delantero", habilidad_especial)

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        for jugador in self.jugadores:
            jugador.mostrar_info()

# b) Crear un equipo y agregar jugadores
equipo = Equipo("Tigres FC")
equipo.agregar_jugador(Portero("Carlos Pérez", 1))
equipo.agregar_jugador(Defensa("Luis Gómez", 4))
equipo.agregar_jugador(Mediocampista("Andrés Rojas", 8))
equipo.agregar_jugador(Delantero("Jorge Díaz", 9))

# c) Mostrar la información del equipo y jugadores
equipo.mostrar_equipo()
