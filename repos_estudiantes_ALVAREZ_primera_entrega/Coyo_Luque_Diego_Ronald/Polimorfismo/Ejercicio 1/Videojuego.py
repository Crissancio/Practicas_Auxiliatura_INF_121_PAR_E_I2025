class Videojuego:
    # FALTA SOBRECARGA DEL CONSTRUCTOR
    # FALTA SOBRECARGA DEL METODO AGREGAR JUGADORES
    def __init__(self, nombre, plataforma):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = 1
    
    def agregarJugadores(self, cantidad=1):  
        self.cantidad_jugadores += cantidad
        print(f"Jugadores añadidos: {cantidad} / Total: {self.cantidad_jugadores}")
    
    def mostrar(self):
        print(f"{self.nombre} ({self.plataforma}) / Jugadores: {self.cantidad_jugadores}")


j1 = Videojuego("STUMBLE GUYS", "PC")
j2 = Videojuego("FIFA 25", "PlayStation")
    

j1.mostrar()
j2.mostrar()
    
j1.agregarJugadores()   
j1.agregarJugadores(3)
j2.agregarJugadores()   
j2.agregarJugadores(8)
    
j1.mostrar()
j2.mostrar()
