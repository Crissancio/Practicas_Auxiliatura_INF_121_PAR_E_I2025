from typing import List

class Jugador:
    def __init__(self, nombre: str, numero: int, posicion: str):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrarInfo(self):
        print(f"Nombre: {self.nombre}")
        print(f"Número: {self.numero}")
        print(f"Posición: {self.posicion}")


class Portero(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Portero")

    def atajar(self):
        print("El portero está atajando el balón.")


class Defensa(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Defensa")

    def defender(self):
        print("El defensa está defendiendo.")


class MedioCampista(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Medio Campista")

    def pasar(self):
        print("El medio campista está pasando el balón.")

    def regatear(self):
        print("El medio campista está regateando.")


class Delantero(Jugador):
    def __init__(self, nombre: str, numero: int):
        super().__init__(nombre, numero, "Delantero")

    def marcarGol(self):
        print("El delantero está marcando gol.")


class Equipo:
    def __init__(self, nombre: str):
        self.nombre = nombre
        self.jugadores: List[Jugador] = []

    def agregarJugador(self, nombre: str, numero: int, posicion: str):
        if posicion == "Portero":
            self.jugadores.append(Portero(nombre, numero))
        elif posicion == "Defensa":
            self.jugadores.append(Defensa(nombre, numero))
        elif posicion == "Medio Campista":
            self.jugadores.append(MedioCampista(nombre, numero))
        elif posicion == "Delantero":
            self.jugadores.append(Delantero(nombre, numero))

    def mostrarEquipo(self):
        print(f"Equipo: {self.nombre}\n")
        print("------------------------------")
        print("Informacion de jugadores:\n")
        for jugador in self.jugadores:
            jugador.mostrarInfo()
            print()


if __name__ == "__main__":
    equipo = Equipo("Equipo A")

    equipo.agregarJugador("Juan", 1, "Portero")
    equipo.agregarJugador("Pedro", 2, "Defensa")
    equipo.agregarJugador("Luis", 3, "Medio Campista")
    equipo.agregarJugador("Carlos", 4, "Delantero")
    equipo.agregarJugador("Miguel", 5, "Medio Campista")
    equipo.agregarJugador("Jorge", 6, "Defensa")
    equipo.agregarJugador("Jose", 7, "Delantero")
    equipo.agregarJugador("Antonio", 8, "Medio Campista")

    equipo.mostrarEquipo()