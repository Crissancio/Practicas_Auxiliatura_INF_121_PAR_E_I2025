class Videojuego:
    def __init__(self, nombre: str, plataforma: str, cantidad_jugadores: int = 1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidad_jugadores}")

    def agregar_jugadores(self, cantidad: int = 1):
        self.cantidad_jugadores += cantidad

videojuego1 = Videojuego("Animal Crossing: New Horizons", "Nintendo Switch")
videojuego2 = Videojuego("The Last of Us Part II", "PlayStation 4", 2)

videojuego1.mostrar()
videojuego2.mostrar()

videojuego1.agregar_jugadores(1)
videojuego2.agregar_jugadores(3)

videojuego1.mostrar()
videojuego2.mostrar()
