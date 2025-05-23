class VideoJuego:
     def __init__(self, nombre="Ninguno", plataforma="Ninguno", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores
     def mostrar(self):
        print(f"Nombre del Juego: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de Jugadores: {self.cantidadJugadores}")
        print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
     def agregarJugadores(self, cantidad=10):
        self.cantidadJugadores = self.cantidadJugadores + cantidad
        print(f"Se agregaron {cantidad} jugador(es)\nLos datos actualizados son ")

# FALTA SOBRECARGA DEL CONSTRUCTOR
# FALTA SOBRECARGA DEL METODO AGREGAR JUGADORES
        
juego1 = VideoJuego("Minecraft", "PC", 2)
juego1.mostrar()
juego1.agregarJugadores(20)
juego1.mostrar()
juego2 = VideoJuego("assassin's creed", "PS5")
juego2.mostrar()
juego2.agregarJugadores(3)      
juego2.mostrar()
