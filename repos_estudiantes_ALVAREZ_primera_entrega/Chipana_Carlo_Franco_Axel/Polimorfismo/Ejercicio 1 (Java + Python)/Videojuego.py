#Sea la clase Videojuego:
    #a) Instanciar al menos 2 videojuegos 
    #b) Sobrecargar el constructor 2 veces 
    #c) Implementar un método mostrar() 
    #d) Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.

class Videojuego:
    def __init__(self, nombre="", plataforma="", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    # SE DEBE SOBRECARGAR EL CONSTRUCTOR
    @classmethod
    def solo_datos_basicos(cls, nombre, plataforma):
        return cls(nombre, plataforma, 1)

    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidadJugadores}")

    # SE DEBE APLICAR SOBRECARGA
    def agregarJugadores(self):
        self.cantidadJugadores += 1

    def agregarJugadoresCantidad(self, cantidad):
        self.cantidadJugadores += cantidad

juego1 = Videojuego("FIFA 24", "PlayStation", 4)
juego2 = Videojuego.solo_datos_basicos("Among Us", "PC")

juego1.mostrar()
print()
juego2.mostrar()

print("\nAgregando jugadores...")
juego1.agregarJugadores()
juego2.agregarJugadoresCantidad(3)
print()
juego1.mostrar()
print()
juego2.mostrar()
