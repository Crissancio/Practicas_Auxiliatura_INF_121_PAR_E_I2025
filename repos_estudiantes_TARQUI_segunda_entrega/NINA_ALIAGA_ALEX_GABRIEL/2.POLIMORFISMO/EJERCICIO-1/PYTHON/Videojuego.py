class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    @classmethod
    def con_nombre_plataforma(cls, nombre, plataforma):
        return cls(nombre, plataforma, 1)

    @classmethod
    def con_nombre(cls, nombre):
        return cls(nombre, "Desconocida", 1)

    def mostrar(self):
        print(f"Videojuego: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidadJugadores}")

    def agregarJugadores(self, cantidad=1):
        if cantidad == 1:
            self.cantidadJugadores += 1
            print(f"Se agregó 1 jugador. Total: {self.cantidadJugadores}")
        else:
            self.cantidadJugadores += cantidad
            print(f"Se agregaron {cantidad} jugadores. Total: {self.cantidadJugadores}")


juego1 = Videojuego("The Legend of Zelda", "Nintendo Switch", 1)
juego2 = Videojuego.con_nombre_plataforma("Minecraft", "PC")
juego3 = Videojuego.con_nombre("Among Us")

juego1.mostrar()
juego2.mostrar()
juego3.mostrar()

juego1.agregarJugadores()
juego2.agregarJugadores(3)

juego1.mostrar()
juego2.mostrar()