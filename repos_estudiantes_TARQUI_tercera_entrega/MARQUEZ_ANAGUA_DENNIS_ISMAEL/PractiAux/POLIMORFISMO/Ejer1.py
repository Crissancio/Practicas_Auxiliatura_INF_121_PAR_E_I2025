'''1.	Sea la clase Videojuego:
a)	Instanciar al menos 2 videojuegos
b)	Sobrecargar el constructor 2 veces
c)	Implementar un método mostrar()
d)	Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
'''
class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores
    @classmethod
    def crear_simple(cls, nombre, plataforma):
        return cls(nombre, plataforma, cantidadJugadores=1)

    @classmethod
    def crear_con_nombre(cls, nombre):
        return cls(nombre, plataforma="Desconocida", cantidadJugadores=1)
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Jugadores: {self.cantidadJugadores}")

    def agregarJugadores(self, jugadores=1):
        self.cantidadJugadores += jugadores
        print(f"Se agregaron {jugadores} jugador(es). Total de jugadores: {self.cantidadJugadores}")

    def agregarUnJugador(self):
        self.agregarJugadores(1)

videojuego1 = Videojuego(nombre="2K24", plataforma="PlayStation 3", cantidadJugadores=4)
videojuego2 = Videojuego.crear_simple(nombre="FNAF", plataforma="PC")

print("Info del juego 1:")
videojuego1.mostrar()

print("Info del juego 2:")
videojuego2.mostrar()

print("Agregando jugadores al juego 1:")
videojuego1.agregarJugadores(2)

print("Agregando un jugador al juego 2:")
videojuego2.agregarUnJugador()

print("Creando un juego con solo nombre:")
videojuego3 = Videojuego.crear_con_nombre("Resident Evil")
videojuego3.mostrar()
