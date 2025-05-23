class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
    def mostrar(self):
        print("Jugador:", self.nombre)
        print("Número:", self.numero)
        print("Posición:", self.posicion)
class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad):
        super().__init__(nombre, numero, "Portero")
        self.habilidad = habilidad
    def mostrar(self):
        super().mostrar()
        print("Habilidad especial:", self.habilidad)
class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad = habilidad
    def mostrar(self):
        super().mostrar()
        print("Habilidad especial:", self.habilidad)
class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad = habilidad
    def mostrar(self):
        super().mostrar()
        print("Habilidad especial:", self.habilidad)
class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad = habilidad
    def mostrar(self):
        super().mostrar()
        print("Habilidad especial:", self.habilidad)
class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []
    def agrega(self, jugador):
        self.jugadores.append(jugador)
    def mostrar(self):
        print("Equipo:", self.nombre)
        for j in self.jugadores:
            j.mostrar()
e = Equipo("Los shiposters");
e.agrega( Portero("Pedro", 1, "Atajadas"));
e.agrega( Defensa("Carlos", 4, "Marcaje"));
e.mostrar();
