class Videojuego:
    # No hay sobregcarga del constructor
    def __init__(self, nombre="", plataforma="", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    # Método mostrar()
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidadJugadores}")

    # Simulación de sobrecarga (métodos distintos)
    # se debe aplicar sobrecarga (con el mismo nombre ambos metodos)
    def agregarUnJugador(self):
        self.cantidadJugadores += 1
        print("Se agregó 1 jugador.")

    def agregarVariosJugadores(self, cantidad):
        self.cantidadJugadores += cantidad
        print(f"Se agregaron {cantidad} jugadores.")

v1 = Videojuego("Mario Karht", "celu", 5)
v2 = Videojuego("Minecraft", "PC hp", 2)


print("=== Videojuego 1 ===")
v1.mostrar()
print("\n=== Videojuego 2 ===")
v2.mostrar()


v1.agregarUnJugador()
v2.agregarVariosJugadores(3)


print("\n=== Después de agregar jugadores ===")
v1.mostrar()
v2.mostrar()
