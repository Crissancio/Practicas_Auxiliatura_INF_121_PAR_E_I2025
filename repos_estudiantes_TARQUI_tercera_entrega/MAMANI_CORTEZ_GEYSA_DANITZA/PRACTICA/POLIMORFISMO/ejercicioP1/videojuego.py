#1. Sea la clase Videojuego:
class VideoJuego:
    def __init__(self, nombre="Candy", plataforma="app", cantidad_jugadores=2):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"{self.nombre} {self.plataforma} {self.cantidad_jugadores}")

    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad

class VideoJuegoOnline(VideoJuego):
    def agregar_jugadores(self, cantidad=1):
        print("(Online) Jugadores conectados...")
        self.cantidad_jugadores += cantidad * 2  

class VideoJuegoLocal(VideoJuego):
    def agregar_jugadores(self, cantidad=1):
        print("(Local) Agregando jugadores en la misma consola...")
        self.cantidad_jugadores += cantidad


j1 = VideoJuego()
j2 = VideoJuegoLocal("FIFA", "PlayStation", 4)
j3 = VideoJuegoOnline("Minecraft", "PC", 1)

# Mostrar
print("---Videojuegos---")
j1.mostrar()
j2.mostrar()
j3.mostrar()

print("\n--- Agregar jugadores  ---")
j1.agregar_jugadores()
j1.mostrar()

j2.agregar_jugadores(2)
j2.mostrar()

j3.agregar_jugadores(2)
j3.mostrar()


