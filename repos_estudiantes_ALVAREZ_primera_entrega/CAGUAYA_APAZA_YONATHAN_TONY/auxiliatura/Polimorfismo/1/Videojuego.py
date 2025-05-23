class Videojuego:
    # se debe sobrecargar el constructor 2 veces
    def __init__(self, nombre, plataforma, cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Plataforma:", self.plataforma)
        print("Cantidad de jugadores:", self.cantidadJugadores)
        print("--------------------------")


    # el metodo debe sobrecargarse
    def agregarJugadores(self):
        self.cantidadJugadores += 1

    def agregarJugadoresConCantidad(self, cantidad):
        if cantidad > 0:
            self.cantidadJugadores += cantidad

if __name__ == "__main__":
    v1 = Videojuego("FIFA 22", "PlayStation")
    v2 = Videojuego("Among Us", "PC", 5)

    v1.mostrar()
    v2.mostrar()

    v1.agregarJugadores()
    v2.agregarJugadoresConCantidad(3)

    v1.mostrar()
    v2.mostrar()
