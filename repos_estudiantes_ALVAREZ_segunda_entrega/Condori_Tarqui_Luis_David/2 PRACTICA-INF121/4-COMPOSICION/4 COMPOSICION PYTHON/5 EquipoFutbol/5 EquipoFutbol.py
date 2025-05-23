# TEMA: COMPOSICIÓN + HERENCIA
# Enunciado:
# 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está compuesto por jugadores,
# y si el equipo se destruye, los jugadores también se destruyen.
# Además, los jugadores pueden ser de diferentes tipos: Portero, Defensa, Mediocampista, Delantero.
#
# Clase Padre: Jugador<nombre, número, posición>
# Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
#
# Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de Jugador)
# Atributo adicional: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases", "Goles")
#
# Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
# Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del equipo y la información de todos los jugadores)
#
# Incisos:
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un equipo y agrega varios jugadores de diferentes tipos.
# c) Muestra la información del equipo y sus jugadores.

# a)
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        print(f"{self.nombre} - #{self.numero} - Posición: {self.posicion}")

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f" Habilidad especial: {self.habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f" Habilidad especial: {self.habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f" Habilidad especial: {self.habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f" Habilidad especial: {self.habilidad_especial}")

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

def main():
# b) Crea un equipo y agrega varios jugadores de diferentes tipos
    equipo = Equipo("Tigre")

    equipo.agregar_jugador(Portero("Carlos Perez", 1, "Atajada"))
    equipo.agregar_jugador(Defensa("Luis Torres", 4, "Marque"))
    equipo.agregar_jugador(Mediocampista("Juan lopez", 8, "Pases"))
    equipo.agregar_jugador(Delantero("Pedro Gomez", 9, "Goles"))

# c) Muestra la información del equipo y sus jugadores
    equipo.mostrar_equipo()
    
if __name__ == "__main__":
    main()
