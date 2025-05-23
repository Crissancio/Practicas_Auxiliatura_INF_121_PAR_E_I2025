# Clase Videojuego
class Videojuego:
    # NO SE SOOBRECARGA EL CONSTRUCTOR
    def __init__(self, nombre=None, plataforma=None, cantidad_jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    # Método para mostrar información del videojuego
    def mostrar(self):
        print(f"El nombre es {self.nombre}, la plataforma es {self.plataforma}, con una cantidad de jugadores {self.cantidad_jugadores}")

    # Método para agregar un solo jugador
    def agregar_jugador(self, nombre_jugador):
        print(f"El nombre del primer jugador es {nombre_jugador}")

    # NO SE SOBRECARGA EL METODO PARA AGREGAR JUGADORES
    # Método para aumentar la cantidad de jugadores
    def agregar_jugadores(self, cantidad):
        self.cantidad_jugadores += cantidad
        print(f"La cantidad aumentada es {cantidad}, y ahora el total de jugadores es {self.cantidad_jugadores}")


# Crear instancias de Videojuego
juego1 = Videojuego("Tekken", "Steam", 3)
juego2 = Videojuego("Left 4 Dead", "Steam", 4)

# Usar los métodos de las instancias
juego1.mostrar()
juego1.agregar_jugador("Pepe")
juego1.agregar_jugadores(3)

print("---------------------------------")

juego2.mostrar()
juego2.agregar_jugador("Ronald")
juego2.agregar_jugadores(6)
