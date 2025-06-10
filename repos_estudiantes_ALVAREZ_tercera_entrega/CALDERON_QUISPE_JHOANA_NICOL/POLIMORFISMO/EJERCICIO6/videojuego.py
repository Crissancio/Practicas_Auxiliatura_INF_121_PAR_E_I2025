class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="Desconocida", cantidadDeJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadDeJugadores = cantidadDeJugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidadDeJugadores}")

    def agregarJugadores(self, cantidad=1):
        self.cantidadDeJugadores += cantidad
        print(f"Se agregaron {cantidad} jugador(es). Total: {self.cantidadDeJugadores}")

v1 = Videojuego()
v1.mostrar()
v1.agregarJugadores()
v1.agregarJugadores(2)

v2 = Videojuego("fifa", "PlayStation")
v2.mostrar()

v3 = Videojuego("Mincraf", "PC", 5)
v3.mostrar()
