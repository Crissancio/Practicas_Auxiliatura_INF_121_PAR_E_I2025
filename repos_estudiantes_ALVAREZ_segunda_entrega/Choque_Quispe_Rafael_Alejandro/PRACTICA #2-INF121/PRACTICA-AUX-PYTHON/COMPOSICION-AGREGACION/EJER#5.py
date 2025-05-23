class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Numero: {self.numero}")
        print(f"Posicion: {self.posicion}")

class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = "Atajadas"
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = "Marcaje"
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = "Pases"
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = "Goles"
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad especial: {self.habilidad_especial}")

class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []
    
    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)
    
    def mostrar_equipo(self):
        print(f"=== Equipo: {self.nombre} ===")
        print("=== Jugadores ===")
        for jugador in self.jugadores:
            jugador.mostrar_info()
            print("-------------------")


if __name__ == "__main__":
    barcelona = Equipo("FC Barcelona")
    
    # Crear jugadores específicos para este equipo
    barcelona.agregar_jugador(Portero("Ter Stegen", 1))
    barcelona.agregar_jugador(Defensa("Araujo", 4))
    barcelona.agregar_jugador(Mediocampista("Pedri", 8))
    barcelona.agregar_jugador(Delantero("Lewandowski", 9))
    barcelona.agregar_jugador(Defensa("Kounde", 23))
    barcelona.agregar_jugador(Mediocampista("Gavi", 6))
    
    barcelona.mostrar_equipo()