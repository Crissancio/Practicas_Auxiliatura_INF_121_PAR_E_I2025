"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"1. Sea la clase Videojuego:"

"a) Instanciar al menos 2 videojuegos"
"b) Sobrecargar el constructor 2 veces"
"c) Implementar un método mostrar()"
"d) Sobrecargar el método agregarJugadores() donde en el primero se agregue"
"solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar."

class Juego:
    def __init__(self, nombre, plataforma, cantidadDeJugadores=0):
        self.__nombre = nombre
        self.__plataforma = plataforma
        self.__cantidad_de_jugadores = cantidadDeJugadores

    def get_nombre(self):
        return self.__nombre

    def get_plataforma(self):
        return self.__plataforma

    def get_cantidad_de_jugadores(self):
        return self.__cantidad_de_jugadores

    def set_cantidad_de_jugadores(self, cantidad):
        self.__cantidad_de_jugadores = cantidad

    def mostrar_informacion(self):
        print(f"Nombre: {self.__nombre}")
        print(f"Plataforma: {self.__plataforma}")
        print(f"Cantidad de jugadores: {self.__cantidad_de_jugadores}")

    def actualizar_jugadores(self, cantidad=1):
        self.__cantidad_de_jugadores += cantidad
        print(f"Se agregaron {cantidad} jugadores. Cantidad total: {self.__cantidad_de_jugadores}")


if __name__ == "__main__":
    juego1 = Juego("devil may cry 3", "PlayStation")
    juego2 = Juego("solo leveling arise", "PC", 9)

    print("Datos del primer juego:")
    juego1.mostrar_informacion()

    print("\nDatos del segundo juego:")
    juego2.mostrar_informacion()

    print("\nActualización de jugadores:")
    juego1.actualizar_jugadores()
    juego2.actualizar_jugadores(3)
