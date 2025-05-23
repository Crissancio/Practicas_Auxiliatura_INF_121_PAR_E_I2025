class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Plataforma:", self.plataforma)
        print("Cantidad de jugadores:", self.cantidadJugadores)
        
    def agregarJugadores(self, cantidad=1):
        self.cantidadJugadores += cantidad

if __name__ == "__main__":
    juego1 = Videojuego("Minecraft", "PC")
    juego2 = Videojuego("FIFA 2024", "PlayStation", 4)
    juego1.agregarJugadores()
    juego2.agregarJugadores(3)
    print("Juego 1")
    juego1.mostrar()

    print("\nJuego 2")
    juego2.mostrar()
