# 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
# compuesto por jugadores, y si el equipo se destruye, los jugadores también se
# destruyen. Además, los jugadores pueden ser de diferentes tipos (portero,
# defensa, mediocampista, delantero).
# Clase Padre: Jugador<nombre, número, posición>
# Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
# Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de
# Jugador)
# Atributos adicionales: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases",
# "Goles")
# Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
# Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del
# equipo y la información de todos los jugadores)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un equipo y agrega varios jugadores de diferentes tipos.
# c) Muestra la información del equipo y sus jugadores.
class Jugador:
    def __init__(self, nombre, numero, posicion): 
        self.nombre, self.numero, self.posicion = nombre, numero, posicion
    def mostrar_info(self): 
        print(f"{self.posicion} #{self.numero}: {self.nombre}")

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
        self.nombre, self.jugadores = nombre, []
    def agregar_jugador(self, jugador): 
        self.jugadores.append(jugador)
    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        for j in self.jugadores: 
            j.mostrar_info()

equipo = Equipo("Tigres FC")
equipo.agregar_jugador(Portero("Pedro", 1, "Atajadas"))
equipo.agregar_jugador(Defensa("Luis", 3, "Marcaje"))
equipo.agregar_jugador(Mediocampista("Carlos", 8, "Pases"))
equipo.agregar_jugador(Delantero("José", 9, "Goles"))
equipo.mostrar_equipo()
