class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="Indefinida", cantidad_jugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"Videojuego: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Jugadores: {self.cantidad_jugadores}")

    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad


# Instancias y prueba directa
juego1 = Videojuego("FIFA 23", "PC", 4)
juego2 = Videojuego("Zelda", "Nintendo Switch", 1)

juego1.mostrar()
print()
juego2.mostrar()
print()

# Agregar jugadores (simulando sobrecarga)
juego1.agregar_jugadores(2)
juego2.agregar_jugadores(3)

print("\nDespués de agregar jugadores:")
juego1.mostrar()
print()
juego2.mostrar()
print()
